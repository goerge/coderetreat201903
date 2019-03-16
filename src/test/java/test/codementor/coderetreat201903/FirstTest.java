package test.codementor.coderetreat201903;

import org.junit.Test;

import com.codementor.coderetreat201903.GOL;

import static com.codementor.coderetreat201903.GOL.Cell.DEAD;
import static com.codementor.coderetreat201903.GOL.Cell.LIVING;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class FirstTest {

  @Test
  public void liveCellWithoutNeighboursDies() {
    var cell = LIVING;
    var newCell = new GOL().tick(cell, 0); // did not force us to not add the 0 here
    assertThat(newCell, is(DEAD));
  }

  @Test
  public void liveCellWithThreeNeighboursSurvives() {
    var cell = LIVING;
    var newCell = new GOL().tick(cell, 3);
    assertThat(newCell, is(LIVING));
  }

  @Test
  public void liveCellWithTwoNeighboursSurvives() {
    var cell = LIVING;
    var newCell = new GOL().tick(cell, 2);
    assertThat(newCell, is(LIVING));
  }

  @Test
  public void deadCellWithTwoNeighboursStaysDead() {
    var cell = DEAD;
    var newCell = new GOL().tick(cell, 2);
    assertThat(newCell, is(DEAD));
  }
}
