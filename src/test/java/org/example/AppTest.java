package org.example;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;


public class AppTest 
{

    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void testGameBoard(){
        GameBoard gb = new GameBoard();
        boolean init_OK = gb.readConfig();
        assertTrue(init_OK);
    }

    @Test
    public void testGameBoardWithPlayersLogged(){
        GameBoard gb = new GameBoard();
        boolean init_OK = gb.readConfig();
        assertTrue(init_OK);
    }


}
