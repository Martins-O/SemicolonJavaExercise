package chapter7.archeryGame;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class PlayerTest {
    private Player player;

    @BeforeEach
    public void alwaysSetUp(){
        player = new Player();
    }

    @Test
    void testThatPlayerExist(){
        assertNotNull(player);
    }


}
