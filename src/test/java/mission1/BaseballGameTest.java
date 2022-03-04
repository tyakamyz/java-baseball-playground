package mission1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;

class BaseballGameTest {

    BaseballGame baseballGame;

    @BeforeEach
    void setUp() {
        baseballGame = new BaseballGame();
    }

    @DisplayName("임의의 수 3가지 조합 하여 List type으로 반환")
    @Test
    void createRandomNumberList() {
        assertThat(3).isEqualTo(baseballGame.CreateRandomNumberList().size());
    }

}