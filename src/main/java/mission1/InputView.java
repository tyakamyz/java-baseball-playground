package mission1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class InputView {

    /* 숫자 값 입력 후 리스트 반환 */
    public List<Integer> InputNumberAndToList() throws IOException {
        System.out.print("숫자를 입력해 주세요 : ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        return Arrays.stream(br.readLine().split("")).map(Integer::parseInt).collect(Collectors.toList());
    }

    /* 게임 시작 종료 선택 */
    public int InputGameStartOrEnd() throws IOException {
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        return Integer.parseInt(br.readLine());
    }
}
