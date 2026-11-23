package homework.h08;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class T1Test {
  private T1 t1 = new T1();

  @Test
  void maxConsecutiveOnes01() {
    assertThat(t1.findMaxConsecutiveOnes(new int[] {1, 1, 0, 1, 1, 1})).isEqualTo(3);
  }

  @Test
  void maxConsecutiveOnes02() {
    assertThat(t1.findMaxConsecutiveOnes(new int[] {1, 0, 1, 1, 0, 1})).isEqualTo(2);
  }
}
