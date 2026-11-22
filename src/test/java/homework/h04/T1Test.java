package homework.h04;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class T1Test {
  private T1 t1 = new T1();

  @Test
  void HammingDistance01() {
    assertThat(t1.hammingDistance(1, 4)).isEqualTo(2);
  }

  @Test
  void HammingDistance02() {
    assertThat(t1.hammingDistance(1, 4)).isEqualTo(2);
  }
}
