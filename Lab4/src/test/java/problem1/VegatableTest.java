package problem1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class VegatableTest {
  Vegatable testVegatable;
  OrderDate d1;
  ExpirationDate d2;

  @BeforeEach
  void setUp() {
    d1= new OrderDate(2021,01,30);
    d2 = new ExpirationDate(2021,03, 20);
    testVegatable=new Vegatable("Bean", 5.0,
        100, 5, d1, d2);
  }

  @Test
  void getD1() {
    assertEquals(d1,testVegatable.getD1());
  }

  @Test
  void setD1() {
    testVegatable.setD1(d1);
    assertEquals(d1,testVegatable.getD1());
  }

  @Test
  void getD2() {
    assertEquals(d2,testVegatable.getD2());
  }

  @Test
  void setD2() {
    testVegatable.setD2(d2);
    assertEquals(d2,testVegatable.getD2());
  }

  @Test
  void getName() {
    assertEquals("Bean",testVegatable.getName());
  }

  @Test
  void setName() {
    testVegatable.setName("Bean");
    assertEquals("Bean",testVegatable.getName());
  }

  @Test
  void getCurrent_price_per_unit() {
    assertEquals(5.0,testVegatable.getCurrent_price_per_unit());
  }

  @Test
  void setCurrent_price_per_unit() {
    testVegatable.setCurrent_price_per_unit(5.0);
    assertEquals(5.0,testVegatable.getCurrent_price_per_unit());
  }

  @Test
  void getAvailable_quantity() {
    assertEquals(100,testVegatable.getAvailable_quantity());
  }

  @Test
  void setAvailable_quantity() {
    testVegatable.setAvailable_quantity(100);
    assertEquals(100,testVegatable.getAvailable_quantity());
  }

  @Test
  void getMax_allowed_quantity() {
    assertEquals(100,testVegatable.getMax_allowed_quantity());
  }

  @Test
  void setMax_allowed_quantity() {
    testVegatable.setMax_allowed_quantity(5);
    assertEquals(5,testVegatable.getMax_allowed_quantity());
  }

}