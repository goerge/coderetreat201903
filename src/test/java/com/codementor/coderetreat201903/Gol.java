package com.codementor.coderetreat201903;

import static com.codementor.coderetreat201903.Cell.DEAD;
import static com.codementor.coderetreat201903.Cell.LIVING;

public class Gol {

  public Cell tick(Cell cell, int neighbours) {
    return neighbours == 2 ? cell : neighbours == 3 ? LIVING : DEAD;
  }
}
