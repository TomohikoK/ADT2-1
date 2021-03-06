package ai;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import player.Player;
import player.ai.SimpleAI;

import board.Board;
import board.Position;
import board.Turn;

public class SimpleAITest {

    @Test
    public void testEval1() {
        Board board = new Board(
                "........" + 
                "........" + 
                "........" + 
                "...WB..." + 
                "...BW..." + 
                "........" + 
                "........" + 
                "........");
        
        Player ai = new SimpleAI(Turn.BLACK);
        Position p = ai.play(board);
        
        assertThat(p, equalTo(new Position(4, 3)));
    }
}
