package com.codementor.coderetreat201903;

import static com.codementor.coderetreat201903.GOL.Cell.DEAD;

public class GOL {

  public enum Cell {
    LIVING,
    DEAD
  }

  public Cell tick(Cell cell, int neighbours) {
    return DEAD;
  }
}
