package problem1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RiceTest {

  Rice testRice;

  @BeforeEach
  void setUp() {
    testRice = new Rice("White Rice", 2.0, 100, 5);
  }

  @Test
  void getName() {
    assertEquals("White Rice", testRice.getName());
  }

  @Test
  void setName() {
    testRice.setName("White Rice");
    assertEquals("White Rice", testRice.getName());

  }

  @Test
  void getCurrent_price_per_unit() {
    assertEquals(2.0, testRice.getCurrent_price_per_unit());
  }

  @Test
  void setCurrent_price_per_unit() {
    testRice.setCurrent_price_per_unit(2.0);
    assertEquals(2.0, testRice.getCurrent_price_per_unit());
  }

  @Test
  void getAvailable_quantity() {
    assertEquals(100, testRice.getAvailable_quantity());
  }

  @Test
  void setAvailable_quantity() {
    testRice.setAvailable_quantity(100);
    assertEquals(100, testRice.getAvailable_quantity());
  }

  @Test
  void getMax_allowed_quantity() {
    assertEquals(250, testRice.getMax_allowed_quantity());
  }

  @Test
  void setMax_allowed_quantity() {
    testRice.setMax_allowed_quantity(5);
    assertEquals(5, testRice.getMax_allowed_quantity());
  }

  @Test
  void testEquals() {
    assertTrue(testRice.equals(testRice));
    assertFalse(testRice.equals(null));
    Rice testRice1 = testRice;
    assertEquals(testRice1, testRice);
    Pasta testPasta;
    testPasta = new Pasta("Spaghetti", 2.0, 100, 5);
    assertFalse(testRice.equals(testPasta));
    Rice testRice2;
    testRice2=new Rice("White Rice", 2.0, 180, 5);
    assertFalse(testRice1.equals(testRice2) && testRice2.equals(testRice1));
    testRice2=new Rice("White Rice", 2.0, 100, 5);
    assertTrue(testRice1.equals(testRice2) && testRice2.equals(testRice1));

  }

  @Test
  void testHashCode() {
    Rice testRice1 = testRice;
    assertEquals(testRice.hashCode(), testRice1.hashCode());
  }
}