package homework.h01;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class T2Test {
  private T2 t2 = new T2();

  @Test
  void OddNumbersInAnIntervalRange01() {
    assertThat(t2.countOdds(3, 7)).isEqualTo(3);
  }

  @Test
  void OddNumbersInAnIntervalRange02() {
    assertThat(t2.countOdds(8, 10)).isEqualTo(1);
  }
}
