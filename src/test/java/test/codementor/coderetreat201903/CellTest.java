package test.codementor.coderetreat201903;

import org.junit.Test;
import org.junit.runner.RunWith;

import com.codementor.coderetreat201903.GOL;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;

import static com.codementor.coderetreat201903.GOL.Cell.DEAD;
import static com.codementor.coderetreat201903.GOL.Cell.LIVING;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

@RunWith(JUnitParamsRunner.class)
public class CellTest {

  @Test
  @Parameters({"0", "1"})
  public void livingCellDiesDueToUnderpopulation(int neighbours) {
    var cell = LIVING;
    var newCell = new GOL().tick(cell, neighbours); // did not force us to not add the 0 here
    assertThat(newCell, is(DEAD));
  }

  @Test
  @Parameters({"2", "3"})
  public void livingCellWithNeighboursSurvives(int neighbours) {
    var cell = LIVING;
    var newCell = new GOL().tick(cell, neighbours);
    assertThat(newCell, is(LIVING));
  }

  @Test
  @Parameters({"4", "5", "6", "7", "8"})
  public void livingCellDiesDueToOverpopulation(int neighbours) {
    var cell = LIVING;
    var newCell = new GOL().tick(cell, neighbours);
    assertThat(newCell, is(DEAD));
  }

  @Test
  @Parameters({"0", "1", "2"})
  public void deadCellWithTooFewNeighboursStaysDead(int neighbours) {
    var cell = DEAD;
    var newCell = new GOL().tick(cell, neighbours);
    assertThat(newCell, is(DEAD));
  }

  @Test
  @Parameters({"3"})
  public void deadCellWithThreeNeighboursWakesUp(int neighbours) {
    var cell = DEAD;
    var newCell = new GOL().tick(cell, neighbours);
    assertThat(newCell, is(LIVING));
  }

  @Test
  @Parameters({"4", "5", "6", "7", "8"})
  public void deadCellWithTooManyNeighboursStaysDead(int neighbours) {
    var cell = DEAD;
    var newCell = new GOL().tick(cell, neighbours);
    assertThat(newCell, is(DEAD));
  }
}
