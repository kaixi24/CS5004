package problem1;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Objects;
import java.util.function.BooleanSupplier;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FruitTest {

  Fruit testFruit;
  OrderDate d1;
  ExpirationDate d2;

  @BeforeEach
  void setUp() {
    d1 = new OrderDate(2021, 01, 30);
    d2 = new ExpirationDate(2021, 03, 20);
    testFruit = new Fruit("apple", 5.0,
        100, 5, d1, d2);
  }

  @Test
  void getD1() {
    assertEquals(d1, testFruit.getD1());
  }

  @Test
  void setD1() {
    testFruit.setD1(d1);
    assertEquals(d1, testFruit.getD1());
  }

  @Test
  void getD2() {
    assertEquals(d2, testFruit.getD2());
  }

  @Test
  void setD2() {
    testFruit.setD2(d2);
    assertEquals(d2, testFruit.getD2());
  }

  @Test
  void testEquals() {
    assertTrue(testFruit.equals(testFruit));
    assertFalse(testFruit.equals(null));
    Fruit testFruit1=testFruit;
    assertEquals(testFruit1,testFruit);
    Meat testMeat;
    testMeat=new Meat("Pork", 5.0,
        100, 5, d1, d2);
    assertFalse(testMeat.equals(testFruit));

    Fruit testFruit2;
    testFruit2=new Fruit("apple", 5.0,
        80, 5, d1, d2);
    assertFalse(testFruit1.equals(testFruit2) && testFruit2.equals(testFruit1));
    testFruit2=new Fruit("apple", 5.0,
        100, 5, d1, d2);
    assertTrue(testFruit1.equals(testFruit2) && testFruit2.equals(testFruit1));
  }

  @Test
  void testHashCode() {
    Fruit testFruit1=testFruit;
    assertEquals(testFruit.hashCode(),testFruit1.hashCode());
  }

  @Test
  void getName() {
    assertEquals("apple", testFruit.getName());
  }

  @Test
  void setName() {
    testFruit.setName("apple");
    assertEquals("apple", testFruit.getName());
  }

  @Test
  void getCurrent_price_per_unit() {
    assertEquals(5.0, testFruit.getCurrent_price_per_unit());
  }

  @Test
  void setCurrent_price_per_unit() {
    testFruit.setCurrent_price_per_unit(5.0);
    assertEquals(5.0, testFruit.getCurrent_price_per_unit());
  }

  @Test
  void getAvailable_quantity() {
    assertEquals(100, testFruit.getAvailable_quantity());
  }

  @Test
  void setAvailable_quantity() {
    testFruit.setAvailable_quantity(100);
    assertEquals(100, testFruit.getAvailable_quantity());
  }

  @Test
  void getMax_allowed_quantity() {
    assertEquals(100, testFruit.getMax_allowed_quantity());
  }

  @Test
  void setMax_allowed_quantity() {
    testFruit.setMax_allowed_quantity(5);
    assertEquals(5, testFruit.getMax_allowed_quantity());
  }

}
