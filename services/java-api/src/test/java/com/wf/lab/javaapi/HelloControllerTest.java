package com.wf.lab.javaapi;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class HelloControllerTest {

  @Test
  void hello_returns_expected_string() {
      HelloController controller = new HelloController();
      assertEquals("hello from java-api", controller.hello());
  }
}