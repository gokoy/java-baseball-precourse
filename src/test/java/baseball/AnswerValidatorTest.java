package baseball;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class AnswerValidatorTest {

    @ParameterizedTest
    @ValueSource(strings = {"", " ", "0", "!", "012", "111", "1234", "44444", "1d23"})
    void 입력값_검증_오류_발생_테스트(String input) {
        //given
        //when
        //then
        Assertions.assertThrows(IllegalArgumentException.class, () -> AnswerValidator.validate(input));
    }

    @ParameterizedTest
    @ValueSource(strings = {"123", "487", "987", "182", "675", "382"})
    void 입력값_검증_성공_테스트(String input) {
        //given
        //when
        //then
        AnswerValidator.validate(input);
    }
}