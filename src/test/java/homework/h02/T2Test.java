package homework.h02;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class T2Test {
  private T2 t2 = new T2();

  @Test
  void ANumberAfterADoubleReversal01() {
    assertThat(t2.isSameAfterReversals(526)).isEqualTo(true);
  }

  @Test
  void ANumberAfterADoubleReversal02() {
    assertThat(t2.isSameAfterReversals(1800)).isEqualTo(false);
  }

  @Test
  void ANumberAfterADoubleReversal03() {
    assertThat(t2.isSameAfterReversals(0)).isEqualTo(true);
  }
}
