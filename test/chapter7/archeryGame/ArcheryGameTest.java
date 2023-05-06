package chapter7.archeryGame;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArcheryGameTest {
    private static ArcheryGame game;

    @BeforeAll
    public static void alwaysSetUp(){
        game = new ArcheryGame(1);
    }
    @Test
    public  void testThatArcheryGameExists(){
        assertNotNull(game);
    }
    @Test
    public void testThatPlayersCanJoinArcheryGame(){
        Player[] games = game.getPlayers();
        assertNotNull(games);
        assertTrue(games.length > 0);
    }
    @Test
    public void testThatGameHasPlayer(){
        Player[] games = game.getPlayers();
        Player player = games[0];
        assertNotNull(player);
    }
//    @Test
//    public void testhatGame

}