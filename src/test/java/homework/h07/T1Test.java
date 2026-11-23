package homework.h07;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class T1Test {
  private T1 t1 = new T1();

  @Test
  void fizzBuzz01() {
    assertThat(t1.fizzBuzz(3)).containsExactlyInAnyOrder("1", "2", "Fizz");
  }

  @Test
  void fizzBuzz02() {
    assertThat(t1.fizzBuzz(5)).containsExactlyInAnyOrder("1", "2", "Fizz", "4", "Buzz");
  }

  @Test
  void fizzBuzz03() {
    assertThat(t1.fizzBuzz(15))
        .containsExactlyInAnyOrder(
            "1",
            "2",
            "Fizz",
            "4",
            "Buzz",
            "Fizz",
            "7",
            "8",
            "Fizz",
            "Buzz",
            "11",
            "Fizz",
            "13",
            "14",
            "FizzBuzz");
  }
}
