package com.codementor.coderetreat201903;

import org.junit.jupiter.api.Test;

import static com.codementor.coderetreat201903.Cell.DEAD;
import static com.codementor.coderetreat201903.Cell.LIVING;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class GolTest {

  @Test
  void livingCellDiesDueToUnderPopulation() {
    assertThat(new Gol().tick(LIVING, 0), is(DEAD));
  }

  @Test
  void livingCellDiesDueToOverPopulation() {
    assertThat(new Gol().tick(LIVING, 4), is(DEAD));
  }

  @Test
  void livingCellWith2NeighboursSurvives() {
    assertThat(new Gol().tick(LIVING, 2), is(LIVING));
  }

  @Test
  void livingCellWith3NeighboursSurvives() {
    assertThat(new Gol().tick(LIVING, 3), is(LIVING));
  }

  @Test
  void deadCellWith3NeighboursComesToLife() {
    assertThat(new Gol().tick(DEAD, 3), is(LIVING));
  }

  @Test
  void deadCellWithNoNeighboursStaysDead() {
    assertThat(new Gol().tick(DEAD, 0), is(DEAD));
  }
}
