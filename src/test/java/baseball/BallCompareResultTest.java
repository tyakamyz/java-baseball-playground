package baseball;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class BallCompareResultTest {

    @Test
    void nothing(){
        Ball answerBall = new Ball(1,3);
        Ball userBall = new Ball(2,5);

        assertThat(BallCompareResult.compareBall(answerBall, userBall)).isEqualTo(Ball.BallStatus.NOTHING);
    }

    @Test
    void ball(){
        Ball answerBall = new Ball(1,3);
        Ball userBall = new Ball(2,3);

        assertThat(BallCompareResult.compareBall(answerBall, userBall)).isEqualTo(Ball.BallStatus.BALL);
    }

    @Test
    void strike(){
        Ball answerBall = new Ball(1,3);
        Ball userBall = new Ball(1,3);

        assertThat(BallCompareResult.compareBall(answerBall, userBall)).isEqualTo(Ball.BallStatus.STRIKE);
    }
}
