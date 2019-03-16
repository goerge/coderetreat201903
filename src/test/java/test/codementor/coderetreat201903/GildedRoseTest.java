package test.codementor.coderetreat201903;

import org.junit.Test;

import com.codementor.coderetreat201903.GildedRose;
import com.codementor.coderetreat201903.Item;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class GildedRoseTest {

  @Test
  public void itemIsDecreasedInQuality() {
    var item = new Item("irrelevant", 1, 10);
    new GildedRose(new Item[]{item}).updateQuality();
    assertThat(item.quality, is(9));
  }

  @Test
  public void itemQualityDoesNotDropBelowZero() {
    var item = new Item("irrelevant", 1, 0);
    new GildedRose(new Item[]{item}).updateQuality();
    assertThat(item.quality, is(0));
  }

  @Test
  public void sulfurasDoesNotChangeQuality() {
    var item = new Item("Sulfuras, Hand of Ragnaros", 1, 99);
    new GildedRose(new Item[]{item}).updateQuality();
    assertThat(item.quality, is(99));
  }

  @Test
  public void agedBrieIncreasesInQuality() {
    var item = new Item("Aged Brie", 1, 10);
    new GildedRose(new Item[]{item}).updateQuality();
    assertThat(item.quality, is(11));
  }

  @Test
  public void backstagePassIncreasesInQuality() {
    var item = new Item("Backstage passes to a TAFKAL80ETC concert", 15, 10);
    new GildedRose(new Item[]{item}).updateQuality();
    assertThat(item.quality, is(11));
  }
}
