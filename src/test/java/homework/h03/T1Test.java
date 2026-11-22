package homework.h03;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class T1Test {
  private T1 t1 = new T1();

  @Test
  void calculationOfAverageSalary01() {
    assertThat(t1.average(new int[] {4000, 3000, 1000, 2000})).isEqualTo(2500.00000);
  }

  @Test
  void calculationOfAverageSalary02() {
    assertThat(t1.average(new int[] {1000, 2000, 3000})).isEqualTo(2000.00000);
  }
}
