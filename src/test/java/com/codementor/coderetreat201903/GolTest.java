package com.codementor.coderetreat201903;

import org.junit.jupiter.api.Test;

import static com.codementor.coderetreat201903.Cell.DEAD;
import static com.codementor.coderetreat201903.Cell.LIVING;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class GolTest {

    @Test
    void livingCellDiesDueToUnderPopulation() {
        var cell = LIVING;
        var newCell = new Gol().tick(cell, 0);
        assertThat(newCell, is(DEAD));
    }

    @Test
    void deadCellWithNoNeighboursStaysDead() {
        var cell = DEAD;
        var newCell = new Gol().tick(cell, 0);
        assertThat(newCell, is(DEAD));
    }
}
