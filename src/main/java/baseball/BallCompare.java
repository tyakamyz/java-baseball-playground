package baseball;

import baseball.model.Ball;
import baseball.model.BallsStatusResult;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BallCompare {

    public static Ball.BallStatus compareBall(Ball answerBall, Ball userBall) {
        if(answerBall.getRound() == userBall.getRound() && answerBall.getBall() == userBall.getBall()){
            return Ball.BallStatus.STRIKE;
        }

        if(answerBall.getBall() == userBall.getBall()){
            return Ball.BallStatus.BALL;
        }

        return Ball.BallStatus.NOTHING;
    }

    public static BallsStatusResult ballsCompareResult(List<Ball> answerBallList, List<Ball> userBallList) {

        List<Ball.BallStatus> ballStatusList = new ArrayList<>();

        for (Ball userBall : userBallList) {
            ballStatusList.add(compareBalls(userBall, answerBallList));
        }

        int strike = Collections.frequency(ballStatusList, Ball.BallStatus.STRIKE);
        int ball = Collections.frequency(ballStatusList, Ball.BallStatus.BALL);

        return new BallsStatusResult(strike,ball);
    }

    public static Ball.BallStatus compareBalls(Ball userBall, List<Ball> answerBallList) {

        Ball.BallStatus returnBallStatus = Ball.BallStatus.NOTHING;
        int index = 0;

        /* Strike 또는 Ball 이면 반복문 중단하고 return */
        while (returnBallStatus.equals(Ball.BallStatus.NOTHING) && index < 3){
            returnBallStatus = compareBall(userBall, answerBallList.get(index));
            index++;
        }

        return returnBallStatus;

    }
}
