package baseball;

import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

public class AnswerValidator {

    private AnswerValidator() {
    }

    public static void validate(String input) {
        if (isThreeDigitsBetweenOneToNine(input) && isDifferentCharacter(input)) {
            return;
        }

        throw new IllegalArgumentException("The input must be " + GameConfig.COUNT + " different numbers between "
                + GameConfig.START_BOUND_NUMBER + " and " + GameConfig.END_BOUND_NUMBER + ".");
    }

    private static boolean isThreeDigitsBetweenOneToNine(String str) {
        return Pattern.matches(GameConfig.REGEX_CONDITION, str);
    }

    private static boolean isDifferentCharacter(String str) {
        Set<Integer> check = new HashSet<>();

        String[] strings = str.split("");
        for (String string : strings) {
            check.add(Integer.valueOf(string));
        }

        return check.size() == GameConfig.COUNT;
    }
}
