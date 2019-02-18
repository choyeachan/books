class Pawn{
  private String color;
  
  Pawn(){
	color = "white";
  }

  Pawn(String color){
    this.color=color;
  }

  String getColor(){
    return color;
  }
}
