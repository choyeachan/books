public class PawnTest extends junit.framework.TestCase {
  public void testCreate(){
    final String white = "white";
    Pawn firstPawn = new Pawn(white);
    assertEquals(white,firstPawn.getColor());

    final String black = "black";
    Pawn secondPawn = new Pawn(black);
    assertEquals(black,secondPawn.getColor());
  }
}
