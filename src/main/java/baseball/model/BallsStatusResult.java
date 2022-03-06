package baseball.model;

public class BallsStatusResult {
    private final int strikeCount;
    private final int ballCount;

    public BallsStatusResult(int strikeCount, int ballCount) {
        this.strikeCount = strikeCount;
        this.ballCount = ballCount;
    }

    public int getStrikeCount() {
        return strikeCount;
    }

    public int getBallCount() {
        return ballCount;
    }
}
