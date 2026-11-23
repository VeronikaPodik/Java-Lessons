package homework.h06;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class T1Test {
  private T1 t1 = new T1();

  @Test
  void validAnagram01() {
    assertThat(t1.isAnagram("anagram", "nagaram")).isEqualTo(true);
  }

  @Test
  void validAnagram02() {
    assertThat(t1.isAnagram("rat", "car")).isEqualTo(false);
  }
}
