package baseball;

import java.util.List;
import org.junit.jupiter.api.RepeatedTest;

class GeneratorTest {

    @RepeatedTest(10)
    void 테스트_1_과_9_사이의_서로_다른_3자리_숫자_검증() {
        //given
        List<Integer> numbers = Generator.generateRandomNumbers();

        StringBuilder input = new StringBuilder();
        for (Integer number : numbers) {
            input.append(number);
        }

        //when
        //then
        AnswerValidator.validate(input.toString());
    }

}