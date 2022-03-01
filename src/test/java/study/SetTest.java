package study;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.HashSet;
import java.util.Set;

import static org.assertj.core.api.Assertions.*;

public class SetTest {
    private Set<Integer> numbers;

    @BeforeEach
    void setUp() {
        numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
    }

    // Test Case 구현
    @Test
    void setSize() {
        /* Set의 size() 메소드를 활용해 Set의 크기를 확인하는 학습테스트를 구현한다. */

        assertThat(numbers.size()).isEqualTo(3);
        assertThat(numbers).hasSize(numbers.size());
    }

    @Test
    void contains() {
        /*  Set의 contains() 메소드를 활용해 1, 2, 3의 값이 존재하는지를 확인하는 학습테스트를 구현하려한다.
            구현하고 보니 다음과 같이 중복 코드가 계속해서 발생한다.
            JUnit의 ParameterizedTest를 활용해 중복 코드를 제거해 본다. */

        assertThat(numbers.contains(1)).isTrue();
        assertThat(numbers.contains(2)).isTrue();
        assertThat(numbers.contains(3)).isTrue();
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3})
    void containsTestByParameterizedTest(int valueSourceInt) {
        assertThat(numbers.contains(valueSourceInt)).isTrue();
    }

}
