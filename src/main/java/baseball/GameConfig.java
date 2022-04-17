package baseball;

public class GameConfig {

    public static final int START_BOUND_NUMBER = 1;
    public static final int END_BOUND_NUMBER = 9;
    public static final int COUNT = 3;
    public static final String GAME_RESTART_CONDITION = "1";
    public static final String REGEX_CONDITION =
            "^[" + START_BOUND_NUMBER + "-" + END_BOUND_NUMBER + "]{" + COUNT + "}$";

    private GameConfig() {
    }
}
