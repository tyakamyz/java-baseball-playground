package stringcalculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.assertj.core.api.Assertions.assertThat;

class StringCalculatorTest {

    StringCalculator stringCalculator;

    @BeforeEach
    public void SetUp(){
        stringCalculator = new StringCalculator();
    }

    @DisplayName("문자열 스페이스바(' ') 기준으로 나누기")
    @Test
    void stringToStringArray() {
        String str = "2 + 10 / 2";
        String[] strArray = {"2", "+", "10", "/", "2"};

        assertThat(strArray).isEqualTo(stringCalculator.stringToStringArray(str));
    }

    @DisplayName("문자를 숫자로 타입 변경")
    @Test
    void stringToInt() {
        assertThat(3).isEqualTo(stringCalculator.stringToInt("3"));
    }

    @DisplayName("숫자, 부호 타입별로 구분")
    @Test
    void intAndSignSeparation() {
        Map<String, Object> resultMap = new HashMap<>();
        List<Integer> intList = new ArrayList<>(Arrays.asList(2,10,2));
        List<String> signList = new ArrayList<>(Arrays.asList("+","/"));
        resultMap.put("intList", intList);
        resultMap.put("signList", signList);

        String[] strArray = {"2", "+", "10", "/", "2"};

        assertThat(resultMap).isEqualTo(stringCalculator.intAndSignSeparation(strArray));
    }

    @DisplayName("더하기 계산")
    @Test
    void plusCalculation() {
        assertThat(6).isEqualTo(stringCalculator.plusCalculation(4,2));
    }

    @DisplayName("빼기 계산")
    @Test
    void minusCalculation() {
        assertThat(2).isEqualTo(stringCalculator.minusCalculation(4,2));
    }

    @DisplayName("곱하기 계산")
    @Test
    void multiplicationCalculation() {
        assertThat(8).isEqualTo(stringCalculator.multiplicationCalculation(4,2));
    }

    @DisplayName("나누기 계산")
    @Test
    void divisionCalculation() {
        assertThat(2).isEqualTo(stringCalculator.divisionCalculation(4,2));
    }

    @DisplayName("최종 값 계산")
    @Test
    void calculator() {
        assertThat(6).isEqualTo(stringCalculator.calculator(4,"+",2));
    }
}