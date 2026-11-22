package homework.h03;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class T2Test {
  private T2 t2 = new T2();

  @Test
  void divisibleandNondivisibleSumsDifference01() {
    assertThat(t2.differenceOfSums(10, 3)).isEqualTo(19);
  }

  @Test
  void divisibleandNondivisibleSumsDifference02() {
    assertThat(t2.differenceOfSums(5, 6)).isEqualTo(15);
  }

  @Test
  void divisibleandNondivisibleSumsDifference03() {
    assertThat(t2.differenceOfSums(5, 1)).isEqualTo(-15);
  }
}
