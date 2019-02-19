package pieces;

public class Pawn{
  public final static String WHITE = "white";
  public final static String BLACK = "black";
  private String color;
  
  Pawn(){
	  color = WHITE;
  }

  public Pawn(String color){
    this.color=color;
  }

  String getColor(){
    return color;
  }
}
