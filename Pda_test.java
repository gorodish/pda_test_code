import static org.junit.Assert.*;
import org.junit.*;

public class Pda_test {

  Pda pda1;

  @Before
  public void before() {
    pda1 = new Pda();
  }

  @Test
  public void testFunc1() {
    assertEquals(true, pda1.func1(1));
    assertEquals(false, pda1.func1(2));
  }

  @Test
  public void testMax() {
    assertEquals(4, pda1.max(4,2));
  }

  @Test
  public void testLooper() {
    assertEquals(11, pda1.looper());
  }

  @Test
  public void testCheckLoop() {
    assertEquals("looper passed", pda1.checkLoop(10));
  }
}
