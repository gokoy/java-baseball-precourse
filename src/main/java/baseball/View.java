package baseball;

public class View {
    public void gameOver() {
        System.out.print(GameConfig.COUNT + "개의 숫자를 모두 맞혔습니다! 게임종료");

    }

    public void restartGame() {
        System.out.print("게임을 새로 시작하려면 " + GameConfig.RESTART_GAME + ", 종료하려면 2를 입력하세요.");
    }
}
