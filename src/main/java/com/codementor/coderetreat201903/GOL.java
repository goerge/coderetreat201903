package com.codementor.coderetreat201903;

import static com.codementor.coderetreat201903.GOL.Cell.DEAD;
import static com.codementor.coderetreat201903.GOL.Cell.LIVING;

public class GOL {

  public enum Cell {
    LIVING,
    DEAD
  }

  public Cell tick(Cell cell, int neighbours) {
    if (neighbours >= 2) {
      return LIVING;
    }
    return DEAD;
  }
}
