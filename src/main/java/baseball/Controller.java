package baseball;

import camp.nextstep.edu.missionutils.Console;

public class Controller {

    private final View view;

    public Controller(View view) {
        this.view = view;
    }

    public void playGame() {
        do {
            BaseballGame baseballGame = new BaseballGame();
            baseballGame.run();
            view.gameOver();
            view.restartGame();
        } while (restart());
    }

    private boolean restart() {
        String condition = Console.readLine();
        return condition.equals("1");
    }
}