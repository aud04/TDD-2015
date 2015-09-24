package upo.tdd;

import upo.rps.model.Player;
import upo.rps.model.RockPaperScissors;

public final class Main {

    public static void main(String[] args) {
        RockPaperScissors rps = new RockPaperScissors();
	    Player p1 = new Player("audrey");
        Player p2 = new Player("alice");
        rps.play(p1,p2);
    }
}
