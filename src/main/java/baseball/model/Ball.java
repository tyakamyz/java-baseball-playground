package baseball.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ball {

    static final int BALLS_COUNT = 3;

    private final int round;
    private final int ball;

    public Ball(int round, int ball) {
        this.round = round;
        this.ball = ball;
    }

    public static List<Ball> inputStringToBalls(String inputString) {
        List<Integer> inputNumberList = Arrays.stream(inputString.split("")).map(Integer::parseInt).collect(Collectors.toList());

        /* 유효성 체크 */
        ballsValidateCheck(inputNumberList);

        return inputListToBalls(inputNumberList);
    }

    private static void ballsValidateCheck(List<Integer> inputNumberList) {
        /* 숫자가 3개가 아니거나 중복된 숫자가 있을 경우, 숫자 0이 있을 경우 */
        if(inputNumberList.stream().distinct().count() != BALLS_COUNT || inputNumberList.contains(0)){
            throw new IllegalArgumentException();
        }
    }

    public static List<Ball> inputListToBalls(List<Integer> inputNumberList) {
        List<Ball> ballList = new ArrayList<>();

        for (int i = 0; i < inputNumberList.size(); i++) {
            ballList.add(new Ball(i+1, inputNumberList.get(i)));
        }

        return ballList;
    }

        public int getRound() {
        return round;
    }

    public int getBall() {
        return ball;
    }

    public enum BallStatus {BALL, NOTHING, STRIKE}
}
