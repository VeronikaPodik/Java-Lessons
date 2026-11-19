package homework.h01;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class T1Test {

  private T1 t1 = new T1();

  @Test
  void smallestEvenMultiple01() {
    assertThat(t1.smallestEvenMultiple(5)).isEqualTo(10);
  }

  @Test
  void smallestEvenMultiple02() {
    assertThat(t1.smallestEvenMultiple(6)).isEqualTo(6);
  }
}
