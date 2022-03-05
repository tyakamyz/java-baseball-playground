package mission1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

    @DisplayName("게임 결과 확인 및 게임 클리어 여부 확인")
    @Test
    void gameResultCheckAndReturnClearFlag() {
        List<Integer> inputNumberList = Arrays.asList(1,2,3);
        List<Integer> randomNumberList = Arrays.asList(1,2,3);

        assertThat(true).isEqualTo(baseballGame.GameResultCheckAndReturnClearFlag(inputNumberList, randomNumberList));
    }

    @DisplayName("완벽하게 일치하는 숫자의 개수")
    @Test
    void perfectSameNumberCount() {
        List<Integer> inputNumberList = Arrays.asList(1,2,3);
        List<Integer> randomNumberList = Arrays.asList(1,2,3);

        assertThat(3).isEqualTo(baseballGame.PerfectSameNumberCount(inputNumberList, randomNumberList));
    }

    @DisplayName("두 숫자의 일치 여부 확인")
    @Test
    void numberSameCheck() {
        assertThat(true).isEqualTo(baseballGame.NumberSameCheck(1,1));
    }

    @DisplayName("중복 숫자 개수 확인")
    @Test
    void duplicationNumberCount() {
        List<Integer> inputNumberList = new ArrayList<>(Arrays.asList(1,2,3));
        List<Integer> randomNumberList = new ArrayList<>(Arrays.asList(5,1,2));

        assertThat(2).isEqualTo(baseballGame.DuplicationNumberCount(inputNumberList,randomNumberList));
    }
}