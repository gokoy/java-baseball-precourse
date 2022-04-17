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
            run(baseballGame);
            view.gameOver();
            view.restartGame();
        } while (restart());
    }

    private void run(BaseballGame baseballGame) {
        do {
            view.inputNumbers();
            String answer = Console.readLine().trim();
            ScoreBoard scoreBoard = baseballGame.playRound(answer);
            view.printScore(scoreBoard);
        } while (baseballGame.isGameOver());
    }

    private boolean restart() {
        String condition = Console.readLine();
        return condition.equals("1");
    }
}