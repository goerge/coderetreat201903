package test.codementor.coderetreat201903;

import org.junit.Test;

import com.codementor.coderetreat201903.SUT;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.emptyString;

public class FirstTest {

  @Test
  public void failing() {
    var coderetreat = SUT.getCodecop();
    assertThat(coderetreat, is(not(emptyString())));
  }
}
