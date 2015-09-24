package upo.rps.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import upo.rps.model.Player;
import upo.rps.model.RPSEnum;
import upo.rps.model.Result;
import upo.rps.model.RockPaperScissors;

import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.*;

/**
 * Created by austepha on 24/09/2015.
 */
public class PlayerTest {

    private RockPaperScissors rps;
    private Player p1;
    private Player p2;

    @BeforeMethod
    public void setUp() throws Exception {



        rps = new RockPaperScissors();
        List<RPSEnum> joueur = new ArrayList<>();
        for(int i=0; i<10; i++){
            joueur.add(RPSEnum.ROCK);
        }

        List<RPSEnum> joueurs = new ArrayList<>();
        for(int i=0; i<10; i++){
            joueurs.add(RPSEnum.PAPER);
        }


        p1 = new Player("Joueur1",joueur);
        p2 = new Player("Joueur2",joueurs);
    }

    @AfterMethod
    public void tearDown() throws Exception {
        rps = null;
        p1 = p2 = null;
    }

    @Test
    public void testWinPlay() throws Exception {

        assertEquals(rps.play(p1,p2), Result.WIN);

    }

    @Test
    public void testLostPlay() throws Exception {

        assertEquals(rps.play(p1,p2), Result.LOST);

    }

    @Test
    public void testTiePlay() throws Exception {

        assertEquals(rps.play(p1,p2), Result.TIE);

    }
}