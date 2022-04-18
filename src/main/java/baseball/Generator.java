package baseball;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Generator {

    private Generator() {
    }

    public static List<Integer> generateRandomNumbers() {
        Set<Integer> numbers = new HashSet<>();

        while (numbers.size() < 3) {
            int number = Randoms.pickNumberInRange(GameConfig.START_BOUND_NUMBER, GameConfig.END_BOUND_NUMBER);
            numbers.add(number);
        }

        return new ArrayList<>(numbers);
    }

}
