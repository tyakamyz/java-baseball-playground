package baseball;

public class BallCompareResult {

    public static Ball.BallStatus compareBall(Ball answerBall, Ball userBall) {
        if(answerBall.getRound() == userBall.getRound() && answerBall.getBall() == userBall.getBall()){
            return Ball.BallStatus.STRIKE;
        }

        if(answerBall.getBall() == userBall.getBall()){
            return Ball.BallStatus.BALL;
        }

        return Ball.BallStatus.NOTHING;
    }
}
