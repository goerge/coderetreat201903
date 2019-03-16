package com.codementor.coderetreat201903;

import static com.codementor.coderetreat201903.Cell.DEAD;

public class Gol {

  public Cell tick(Cell cell, int neighbours) {
    if(neighbours == 2)
      return cell;
    if(neighbours == 3)
      return cell;
    return DEAD;
  }
}
