package baseball;

import baseball.model.Ball;
import baseball.model.BallsStatusResult;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class BallCompareTest {

    @DisplayName("정답과 사용자가 입력한 숫자 비교")
    @Test
    void ballsCompareResult(){
        List<Ball> answerBallList = Arrays.asList(new Ball(1,1),new Ball(2,2),new Ball(3,3));
        List<Ball> userBallList = Arrays.asList(new Ball(1,2),new Ball(2,1),new Ball(3,3));

        BallsStatusResult ballsStatusResult = BallCompare.ballsCompareResult(answerBallList, userBallList);
        BallsStatusResult answerBallsStatusResult = new BallsStatusResult(1,2);

        assertThat(ballsStatusResult)
                .usingRecursiveComparison()
                .isEqualTo(answerBallsStatusResult);
    }

    @DisplayName("정답을 기준으로 사용자가 입력한 숫자 1개 비교")
    @Test
    void compareBalls(){
        Ball userBall = new Ball(2,1);
        List<Ball> answerBallList = Arrays.asList(new Ball(1,1),new Ball(2,2),new Ball(3,3));

        assertThat(BallCompare.compareBalls(userBall, answerBallList)).isEqualTo(Ball.BallStatus.BALL);
    }

    @DisplayName("결과 값 1:1 비교 - nothing")
    @Test
    void compareBall_nothing(){
        Ball answerBall = new Ball(1,3);
        Ball userBall = new Ball(2,5);

        assertThat(BallCompare.compareBall(answerBall, userBall)).isEqualTo(Ball.BallStatus.NOTHING);
    }

    @DisplayName("결과 값 1:1 비교 - ball")
    @Test
    void compareBall_ball(){
        Ball answerBall = new Ball(1,3);
        Ball userBall = new Ball(2,3);

        assertThat(BallCompare.compareBall(answerBall, userBall)).isEqualTo(Ball.BallStatus.BALL);
    }

    @DisplayName("결과 값 1:1 비교 - strike")
    @Test
    void compareBall_strike(){
        Ball answerBall = new Ball(1,3);
        Ball userBall = new Ball(1,3);

        assertThat(BallCompare.compareBall(answerBall, userBall)).isEqualTo(Ball.BallStatus.STRIKE);
    }
}
