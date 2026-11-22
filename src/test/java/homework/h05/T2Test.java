package homework.h05;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class T2Test {
  private T2 t2 = new T2();

  @Test
  void squaresOfASortedArray01() {
    assertThat(t2.sortedSquares(new int[] {-4, -1, 0, 3, 10}))
        .containsExactlyInAnyOrder(0, 1, 9, 16, 100);
  }

  @Test
  void squaresOfASortedArray02() {
    assertThat(t2.sortedSquares(new int[] {-7, -3, 2, 3, 11}))
        .containsExactlyInAnyOrder(4, 9, 9, 49, 121);
  }
}
