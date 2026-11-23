package homework.h06;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class T2Test {
  private T2 t2 = new T2();

  @Test
  void validPalindrome01() {
    assertThat(t2.isPalindrome("A man, a plan, a canal: Panama")).isEqualTo(true);
  }

  @Test
  void validPalindrome02() {
    assertThat(t2.isPalindrome("race a car")).isEqualTo(false);
  }

  @Test
  void validPalindrome03() {
    assertThat(t2.isPalindrome(" ")).isEqualTo(true);
  }
}
