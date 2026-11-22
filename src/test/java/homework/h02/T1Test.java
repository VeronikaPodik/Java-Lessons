package homework.h02;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class T1Test {
  private T1 t1 = new T1();

  @Test
  void addDigits01() {
    assertThat(t1.addDigits(38)).isEqualTo(2);
  }

  @Test
  void addDigits02() {
    assertThat(t1.addDigits(0)).isEqualTo(0);
  }
}
