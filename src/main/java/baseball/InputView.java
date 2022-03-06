package baseball;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputView {

    /* 숫자 값 입력 */
    public static String inputNumber() throws IOException {
        System.out.print("숫자를 입력해 주세요 : ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        return br.readLine();
    }

    /* 게임 시작 종료 선택 */
    public int InputGameStartOrEnd() throws IOException {
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        return Integer.parseInt(br.readLine());
    }
}
