package baseball;

import static baseball.GameConfig.COUNT;
import static baseball.GameConfig.END_BOUND_NUMBER;
import static baseball.GameConfig.GAME_RESTART_CONDITION;
import static baseball.GameConfig.START_BOUND_NUMBER;

import camp.nextstep.edu.missionutils.Console;
import camp.nextstep.edu.missionutils.Randoms;
import java.util.ArrayList;
import java.util.List;

public class Controller {

    private final View view;

    public Controller(View view) {
        this.view = view;
    }

    public void playGame() {
        do {
            BaseballGame baseballGame = new BaseballGame(
                    Randoms.pickUniqueNumbersInRange(START_BOUND_NUMBER, END_BOUND_NUMBER, COUNT));
            playRound(baseballGame);
            view.gameOver();
            view.restartGame();
        } while (restart());
    }

    private void playRound(BaseballGame baseballGame) {
        do {
            view.inputNumbers();
            String input = Console.readLine().trim();
            AnswerValidator.validate(input);
            List<Integer> answer = StringToIntegerList(input);
            ScoreBoard scoreBoard = baseballGame.check(answer);
            view.printScore(scoreBoard);
        } while (baseballGame.isGameOver());
    }

    private List<Integer> StringToIntegerList(String input) {
        String[] strings = input.split("");
        List<Integer> answer = new ArrayList<>();
        for (String string : strings) {
            answer.add(Integer.valueOf(string));
        }
        return answer;
    }

    private boolean restart() {
        String condition = Console.readLine();
        return condition.equals(GAME_RESTART_CONDITION);
    }
}