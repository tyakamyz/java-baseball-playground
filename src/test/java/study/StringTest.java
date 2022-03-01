package study;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class StringTest {
    @Test
    void replace() {
        String actual = "abc".replace("b", "d");
        assertThat(actual).isEqualTo("adc");
    }

    @Test
    void requirementCase1() {

        /*  "1,2"을 ,로 split 했을 때 1과 2로 잘 분리되는지 확인하는 학습 테스트를 구현한다. */
        String splitExampleString = "1,2";
        String[] splitExampleStringArray = splitExampleString.split(",");
        assertThat(splitExampleStringArray).contains("1");              // 포함 여부 확인
        assertThat(splitExampleStringArray).containsExactly("1","2");   // 순서를 포함해서 정확히 일치

        /* "1"을 ,로 split 했을 때 1만을 포함하는 배열이 반환되는지에 대한 학습 테스트를 구현한다. */
        splitExampleString = "1";
        splitExampleStringArray = splitExampleString.split(",");
        assertThat(splitExampleStringArray).contains("1");          // 포함 여부 확인
        assertThat(splitExampleStringArray).containsExactly("1");   // 순서를 포함해서 정확히 일치

    }

    @Test
    void requirementCase2() {

        /* "(1,2)" 값이 주어졌을 때 String의 substring() 메소드를 활용해 ()을 제거하고 "1,2"를 반환하도록 구현한다. */
        String resultString = "1,2";
        String splitExampleString = "(1,2)";
        splitExampleString = splitExampleString.substring(1,splitExampleString.length()-1);

        assertThat(splitExampleString).isEqualTo(resultString);
    }

    @DisplayName("IndexOutOfBoundsException 예외 발생 확인")
    @Test
    void requirementCase3() {
        /* "abc" 값이 주어졌을 때 String의 charAt() 메소드를 활용해 특정 위치의 문자를 가져오는 학습 테스트를 구현한다.
            String의 charAt() 메소드를 활용해 특정 위치의 문자를 가져올 때 위치 값을 벗어나면 StringIndexOutOfBoundsException이 발생하는 부분에 대한 학습 테스트를 구현한다.
            JUnit의 @DisplayName을 활용해 테스트 메소드의 의도를 드러낸다. */
        /* Error Message: String index out of range: 3 */

        String exampleString = "abc";
        int index = 3;

        /* hasMessageContaining: 포함된 문자 여부 확인 */
        assertThatThrownBy(() -> {
            exampleString.charAt(index);
        }).isInstanceOf(IndexOutOfBoundsException.class).hasMessageContaining("index out of range");

        /* 다른 표현 방식 */
        assertThatThrownBy(() -> {
            exampleString.charAt(index);
        }).isInstanceOf(IndexOutOfBoundsException.class).hasMessageContaining("%d", index);

        /* withMessageMatching: 모든 문자 일치 여부 확인 */
        assertThatExceptionOfType(IndexOutOfBoundsException.class).isThrownBy(() -> {
            exampleString.charAt(index);
        }).withMessageMatching("String index out of range: \\d");

        /* TODO 다른 방법으로 예외 문구 변경 처리 가능한지 확인 필요 */
        assertThatExceptionOfType(IndexOutOfBoundsException.class).isThrownBy(() -> {
            try {
                exampleString.charAt(index);
            }catch (Exception e){
                throw new IndexOutOfBoundsException("Index: " + (exampleString.length()-1) + ", Size: " + exampleString.length());
            }
        }).withMessageMatching("Index: \\d+, Size: \\d+");

    }

}
