package baseball;

public class Ball {

    private final int round;
    private final int ball;

    Ball(int round, int ball) {
        this.round = round;
        this.ball = ball;
    }

    public int getRound() {
        return round;
    }

    public int getBall() {
        return ball;
    }

    public enum BallStatus {BALL, NOTHING, STRIKE}
}
