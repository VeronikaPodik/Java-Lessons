package homework.h08;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

public class T2Test {
  private T2 t2 = new T2();

  @Test
  void countPairsWhoseSumIsLessThanTarget01() {
    assertThat(t2.countPairs(Arrays.asList(-1, 1, 2, 3, 1), 2)).isEqualTo(3);
  }

  @Test
  void countPairsWhoseSumIsLessThanTarget02() {
    assertThat(t2.countPairs(Arrays.asList(-6, 2, 5, -2, -7, -1, 3), -2)).isEqualTo(10);
  }
}
