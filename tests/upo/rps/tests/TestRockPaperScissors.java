package upo.rps.tests;

import org.testng.annotations.*;
import upo.rps.model.Player;
import upo.rps.model.RPSEnum;
import upo.rps.model.Result;
import upo.rps.model.RockPaperScissors;

import static org.testng.Assert.*;

/**
 * Created by austepha on 14/09/2015.
 * Test { testRockPaperScissor}
 */
public class TestRockPaperScissors {

    private RockPaperScissors rps;
    private Player j1;
    private Player j2;

    @BeforeClass
    public void setUp() throws Exception {
        rps = new RockPaperScissors();

    }



    @AfterClass
    public void tearDown() throws Exception {
        rps = null;
    }



    @DataProvider(name = "WinData")
    public Object[][] createTestWinData() {
        return new Object[][] {
                { "PAPER", "ROCK"},
                { "SCISSORS", "PAPER"},
                {"ROCK", "SCISSORS"},
        };
    }

    @DataProvider(name = "LostData")
    public Object[][] createTestLostData() {
        return new Object[][] {
                { "PAPER", "SCISSORS"},
                { "SCISSORS", "ROCK"},
                {"ROCK", "PAPER"},
        };
    }

    @DataProvider(name = "TieData")
    public Object[][] createTestTieData() {
        return new Object[][] {
                { "PAPER", "PAPER"},
                { "SCISSORS", "SCISSORS"},
                {"ROCK", "ROCK"},
        };
    }

   // @Parameters ({ "Paper" ,"Rock" })
    @Test(dataProvider = "WinData" )
    public void testWinPlay(String p1, String p2) throws Exception {

        assertEquals(rps.play(RPSEnum.valueOf(p1), RPSEnum.valueOf(p2)), Result.WIN);

    }

    @Test(dataProvider = "LostData" )
    public void testLostPlay(String p1, String p2) throws Exception {

        assertEquals(rps.play(RPSEnum.valueOf(p1), RPSEnum.valueOf(p2)), Result.LOST);

    }

    @Test(dataProvider = "TieData" )
    public void testTiePlay(String p1, String p2) throws Exception {

        assertEquals(rps.play(RPSEnum.valueOf(p1), RPSEnum.valueOf(p2)), Result.TIE);

    }



}