package pieces;

import junit.framework.TestCase;
import pieces.*;

public class PawnTest extends TestCase {

  private Pawn pawn;

  public void setUp(){
    pawn = new Pawn();
  }

  public void testCreate(){
    final String white = "white";
    Pawn firstPawn = new Pawn(white);
    assertEquals(white,firstPawn.getColor());

    final String black = "black";
    Pawn secondPawn = new Pawn(black);
    assertEquals(black,secondPawn.getColor());
  }

  public void testCreateNoColorPawn(){
	 pawn = new Pawn();
  }
}
