package homework.h07;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class T2Test {
  private T2 t2 = new T2();

  @Test
  void numberOfStepsToReduceANumberToZero01() {
    assertThat(t2.numberOfSteps(14)).isEqualTo(6);
  }

  @Test
  void numberOfStepsToReduceANumberToZero02() {
    assertThat(t2.numberOfSteps(8)).isEqualTo(4);
  }

  @Test
  void numberOfStepsToReduceANumberToZero03() {
    assertThat(t2.numberOfSteps(123)).isEqualTo(12);
  }
}
