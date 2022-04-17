package baseball;

public class View {

    public void inputNumbers() {
        System.out.print("숫자를 입력해주세요 : ");
    }

    public void gameOver() {
        System.out.print(GameConfig.COUNT + "개의 숫자를 모두 맞혔습니다! 게임종료");

    }

    public void restartGame() {
        System.out.print("게임을 새로 시작하려면 " + GameConfig.GAME_RESTART_CONDITION + ", 종료하려면 2를 입력하세요.");
    }

    public void score(ScoreBoard scoreBoard) {
        StringBuilder builder = new StringBuilder();

        if (scoreBoard.getBall() > 0) {
            builder.append(scoreBoard.getBall()).append("볼 ");
        }

        if (scoreBoard.getStrike() > 0) {
            builder.append(scoreBoard.getStrike()).append("스트라이크");
        }

        if (builder.length() == 0) {
            builder.append("낫싱");
        }

        System.out.println(builder);
    }
}
