package com.codementor.coderetreat201903;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class GolTest {

  @ParameterizedTest
  @CsvSource({
    "LIVING, 0, DEAD",
    "LIVING, 1, DEAD",
    "LIVING, 2, LIVING",
    "LIVING, 3, LIVING",
    "LIVING, 4, DEAD",
    "LIVING, 5, DEAD",
    "LIVING, 6, DEAD",
    "LIVING, 7, DEAD",
    "LIVING, 8, DEAD",
    "DEAD, 0, DEAD",
    "DEAD, 1, DEAD",
    "DEAD, 2, DEAD",
    "DEAD, 3, LIVING",
    "DEAD, 4, DEAD",
    "DEAD, 5, DEAD",
    "DEAD, 6, DEAD",
    "DEAD, 7, DEAD",
    "DEAD, 8, DEAD",
  })
  void cell(Cell currentState, int neighbours, Cell expectedState) {
    assertThat(new Gol().tick(currentState, neighbours), is(expectedState));
  }
}
