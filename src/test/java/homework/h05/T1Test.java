package homework.h05;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class T1Test {
  private T1 t1 = new T1();

  @Test
  void maximumProductDifferenceBetweenTwoPairs01() {
    assertThat(t1.maxProductDifference(new int[] {5, 6, 2, 7, 4})).isEqualTo(34);
  }

  @Test
  void maximumProductDifferenceBetweenTwoPairs02() {
    assertThat(t1.maxProductDifference(new int[] {4, 2, 5, 9, 7, 4, 8})).isEqualTo(64);
  }
}
