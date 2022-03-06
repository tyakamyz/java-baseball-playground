import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringCalculator {

    /*  사용자가 입력한 문자열 값에 따라 사칙연산을 수행할 수 있는 계산기를 구현해야 한다.
        문자열 계산기는 사칙연산의 계산 우선순위가 아닌 입력 값에 따라 계산 순서가 결정된다. 즉, 수학에서는 곱셈, 나눗셈이 덧셈, 뺄셈 보다 먼저 계산해야 하지만 이를 무시한다.
        예를 들어 "2 + 3 * 4 / 2"와 같은 문자열을 입력할 경우 2 + 3 * 4 / 2 실행 결과인 10을 출력해야 한다. */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String value = scanner.nextLine();
        String[] values = value.split(" ");

        List<Integer> intList = new ArrayList<>();
        List<String> signList = new ArrayList<>();

        for(int i=0; i<values.length; i++){
            if(i%2 == 1){
                signList.add(values[i]);
            }else if(i%2 == 0){
                intList.add(Integer.parseInt(values[i]));
            }
        }

        int result = intList.get(0);
        int index = 0;
        for(String sign:signList){
            index++;
            switch (sign){
                case "+":
                    result = result + intList.get(index);
                    break;
                case "-":
                    result = result - intList.get(index);
                    break;
                case "*":
                    result = result * intList.get(index);
                    break;
                case "/":
                    result = result / intList.get(index);
                    break;
            }
        }

        System.out.println("result: " + result);
    }
}
