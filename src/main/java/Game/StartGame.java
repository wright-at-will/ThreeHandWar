package Game;

import war.Annihilation;
import war.War;

public class StartGame {

    public static void main(String[] args) {
        War war = new Annihilation();
        war.playGame();
    }
}
