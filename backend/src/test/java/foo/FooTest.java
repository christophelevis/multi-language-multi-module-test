package foo;

import org.junit.Test;
import static org.junit.Assert.*;

public class FooTest {

  //@Test
  public void testAdd() throws Exception {
  	assertEquals(Foo.div(10, 5), 2);

	System.runFinalizersOnExit(true);
	throw new RuntimeException("My Message");
  }

  public void testVoid() throws Exception {
  }
}
