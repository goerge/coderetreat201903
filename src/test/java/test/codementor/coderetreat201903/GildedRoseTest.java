package test.codementor.coderetreat201903;

import org.hamcrest.Matchers;
import org.junit.Test;

import com.codementor.coderetreat201903.GildedRose;
import com.codementor.coderetreat201903.Item;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class GildedRoseTest {

  @Test
  public void name() {
    var gildedRose = new GildedRose(new Item[]{});

    assertThat(gildedRose, is(Matchers.notNullValue()));
  }
}
