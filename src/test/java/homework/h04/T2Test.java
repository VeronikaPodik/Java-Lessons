package homework.h04;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class T2Test {
  private T2 t2 = new T2();

  @Test
  void NumberComplement01() {
    assertThat(t2.findComplement(5)).isEqualTo(2);
  }

  @Test
  void NumberComplement02() {
    assertThat(t2.findComplement(1)).isEqualTo(0);
  }
}
