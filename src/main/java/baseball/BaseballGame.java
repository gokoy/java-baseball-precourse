package baseball;

import java.util.List;

public class BaseballGame {

    private final List<Integer> solution;

    private boolean gameOver;

    public BaseballGame(List<Integer> randomNums) {
        solution = randomNums;
        gameOver = false;
    }

    public ScoreBoard check(final List<Integer> answer) {
        int strike = 0;
        int ball = 0;
        for (int i = 0; i < answer.size(); i++) {
            strike += isStrike(answer.get(i), i);
            ball += isBall(answer.get(i), i);
        }

        isCorrectAnswer(strike);

        return new ScoreBoard(strike, ball);
    }

    private void isCorrectAnswer(int strike) {
        if (strike == GameConfig.COUNT) {
            gameOver = true;
        }
    }

    private int isStrike(int answer, int idx) {
        return answer == solution.get(idx) ? 1 : 0;
    }

    private int isBall(int answer, int idx) {
        return solution.contains(answer) && solution.indexOf(answer) != idx ? 1 : 0;
    }

    public boolean isGameOver() {
        return gameOver;
    }


}