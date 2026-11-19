package app;

import static org.assertj.core.api.Assertions.assertThatCode;

import org.junit.jupiter.api.Test;

class HelloWorldAppTest {

  @Test
  void printHelloWorld() {
    assertThatCode(() -> HelloWorldApp.main(new String[0])).doesNotThrowAnyException();
  }
}
