package chess;

import java.util.*;
import pieces.Pawn;

/**
 * Board Class
 * @author yechancho
 */ 
public class Board {
  ArrayList<Pawn> pawns = new ArrayList<Pawn>();

  /**
   * add method
   * @param Pawn pawn
   */
  void add(Pawn pawn){
    pawns.add(pawn);
  }

  /**
   * return Pawns count
   * @return int the number of pawns
   */
  int getPawnsCount(){
    return pawns.size();
  }

}
