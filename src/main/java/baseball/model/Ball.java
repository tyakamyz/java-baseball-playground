package baseball.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ball {

    private final int round;
    private final int ball;

    public Ball(int round, int ball) {
        this.round = round;
        this.ball = ball;
    }

    public static List<Ball> inputStringToList(String inputString) {

        List<Ball> ballList = new ArrayList<>();

        List<Integer> inputNumberList = Arrays.stream(inputString.split("")).map(Integer::parseInt).collect(Collectors.toList());
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
