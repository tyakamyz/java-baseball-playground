package baseball;

import baseball.model.Ball;
import baseball.model.BallsStatusResult;

import java.io.IOException;
import java.util.List;

public class BaseballGame {

    final int GAME_FINISH_STRIKE_COUNT = 3;

    public void GamePlaying() throws IOException {

        /* 컴퓨터(정답) 랜덤한 수 생성 */
        CreateAnswerNumber createAnswerNumber = new CreateAnswerNumber();
        List<Ball> answerBallList = Ball.inputListToBalls(createAnswerNumber.CreateRandomNumberList());

        boolean clearFlag = false;
        while (!clearFlag){
            /* 사용자 랜덤한 수 입력 */
            List<Ball> userBallList = Ball.inputStringToBalls(InputView.inputNumber());
            clearFlag = GameResultCheckAndReturnClearFlag(answerBallList, userBallList);
        }
    }

    public int isGameReplayChoice() throws IOException {
        InputView inputView = new InputView();

        return inputView.InputGameStartOrEnd();
    }

    /* 게임 결과 확인 (숫자 비교, 결과 값 도출) */
    public boolean GameResultCheckAndReturnClearFlag(List<Ball> answerBallList, List<Ball> userBallList){
        BallCompare ballCompare = new BallCompare();
        BallsStatusResult ballsStatusResult = ballCompare.ballsCompareResult(answerBallList, userBallList);
        int ballCount = ballsStatusResult.getBallCount();
        int strikeCount = ballsStatusResult.getStrikeCount();

        ResultView.GameResultMessage(ballCount, strikeCount);

        if(strikeCount == GAME_FINISH_STRIKE_COUNT){
            return true;
        }

        return false;
    }

}
