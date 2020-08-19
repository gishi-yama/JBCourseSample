import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Tests {
  @Test
  public void testSolution() {
    assertEquals("Hello, Java!と表示できるようにする",
      "Hello, Java!", HelloJava.sayHello());
  }
}