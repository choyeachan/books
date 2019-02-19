package chess;

import junit.framework.TestCase;
import pieces.*;

public class BoardTest extends TestCase {

  private Board board;

  public void setUp(){
    board = new Board();
  }

  public void testCreate(){
    board = new Board();
  }

  public void testAddPawn(){
    board.add(new Pawn(Pawn.WHITE));
    assertEquals(1, board.getPawnsCount());
    board.add(new Pawn(Pawn.BLACK));
    assertEquals(2, board.getPawnsCount());
  }

}
