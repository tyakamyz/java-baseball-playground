package baseball.model;

import baseball.model.Ball;
import org.assertj.core.api.Condition;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.internal.bytebuddy.matcher.ElementMatchers.is;

public class BallTest {

    @DisplayName("입력받은 문자열을 List 형태로 타입 변경")
    @Test
    void inputStringToList(){
        assertThat(Ball.inputStringToBalls("123"))
                .usingRecursiveComparison()
                .isEqualTo(Arrays.asList(new Ball(1,1),new Ball(2,2),new Ball(3,3)));
    }
}
