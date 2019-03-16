package com.codementor.coderetreat201903;

import static com.codementor.coderetreat201903.Cell.DEAD;
import static com.codementor.coderetreat201903.Cell.LIVING;

public class Gol {

  public Cell tick(Cell cell, int neighbours) {
    switch (neighbours) {
      case 2: return cell;
      case 3: return LIVING;
      default: return DEAD;
    }
  }
}
