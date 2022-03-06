package baseball;

public class ResultView {

    public static void GameResultMessage(int ball, int strike){
        /* 결과 조합 */
        StringBuilder resultStringBuilder = new StringBuilder();

        if(strike == 3){
            resultStringBuilder.append("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
        }

        if(ball == 0 && strike == 0){
            resultStringBuilder.append("낫싱");
        }

        if(ball > 0){
            resultStringBuilder.append(ball);
            resultStringBuilder.append("볼 ");
        }

        if(strike > 0 && strike < 3){
            resultStringBuilder.append(strike);
            resultStringBuilder.append("스트라이크");
        }

        System.out.println(resultStringBuilder.toString());
    }

}
