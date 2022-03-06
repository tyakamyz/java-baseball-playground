import baseball.BaseballGame;

import java.io.IOException;

public class Application {
    public static void main(String[] args) throws IOException {

        BaseballGame baseballGame = new BaseballGame();

        int inputGameStartOrEnd = 1;
        while(inputGameStartOrEnd == 1){
            baseballGame.GamePlaying();
            inputGameStartOrEnd = baseballGame.isGameReplayChoice();
        }

    }
}
