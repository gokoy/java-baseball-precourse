package baseball;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class BaseballGameTest {

    List<Integer> solution = Arrays.asList(1, 2, 3);
    BaseballGame baseballGame;

    @BeforeEach
    void 게임_세팅() {
        baseballGame = new BaseballGame(solution);
    }

    @ParameterizedTest
    @ValueSource(strings = {"981", "298", "938", "392", "312"})
    void 볼_테스트(String input) {
        //given
        String[] split = input.split("");

        List<Integer> answer = new ArrayList<>();
        for (String s : split) {
            answer.add(Integer.valueOf(s));
        }

        //when
        Hint hint = baseballGame.check(answer);

        //then
        assertThat(hint.getBall()).isGreaterThan(0);
        assertThat(hint.getStrike()).isEqualTo(0);
    }

    @ParameterizedTest
    @ValueSource(strings = {"145", "425", "453", "124", "143", "123"})
    void 스트라이크_테스트(String input) {
        //given
        String[] split = input.split("");

        List<Integer> answer = new ArrayList<>();
        for (String s : split) {
            answer.add(Integer.valueOf(s));
        }

        //when
        Hint hint = baseballGame.check(answer);

        //then
        assertThat(hint.getStrike()).isGreaterThan(0);
        assertThat(hint.getBall()).isEqualTo(0);
    }

    @ParameterizedTest
    @ValueSource(strings = {"456", "789", "459", "756"})
    void 낫싱_테스트(String input) {
        //given
        String[] split = input.split("");

        List<Integer> answer = new ArrayList<>();
        for (String s : split) {
            answer.add(Integer.valueOf(s));
        }

        //when
        Hint hint = baseballGame.check(answer);

        //then
        assertThat(hint.getStrike()).isEqualTo(0);
        assertThat(hint.getBall()).isEqualTo(0);
    }

    @Test
    void 정답_테스트() {
        //given
        List<Integer> answer = Arrays.asList(1, 2, 3);

        //when
        Hint hint = baseballGame.check(solution);

        //then
        assertThat(hint.getStrike()).isEqualTo(GameConfig.COUNT);
        assertThat(baseballGame.isGameOver()).isTrue();
    }
}