package problem1;

import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDateTime;

import jdk.jfr.Experimental;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

class MeatTest {
  Meat testMeat;
  OrderDate d1;
  ExpirationDate d2;

  @BeforeEach
  void setUp() {
    d1= new OrderDate(2021,01,30);
    d2 = new ExpirationDate(2021,03, 20);
    testMeat=new Meat("Pork", 5.0,
        100, 5, d1, d2);
  }
  @Test
  void getD1() {
    assertEquals(d1,testMeat.getD1());
  }

  @Test
  void setD1() {
    testMeat.setD1(d1);
    assertEquals(d1,testMeat.getD1());
  }

  @Test
  void getD2() {
    assertEquals(d2,testMeat.getD2());
  }

  @Test
  void setD2() {
    testMeat.setD2(d2);
    assertEquals(d2,testMeat.getD2());
  }

  @Test
  void getName() {
    assertEquals("Pork",testMeat.getName());
  }

  @Test
  void setName() {
    testMeat.setName("Pork");
    assertEquals("Pork",testMeat.getName());
  }

  @Test
  void getCurrent_price_per_unit() {
    assertEquals(5,testMeat.getCurrent_price_per_unit());
  }

  @Test
  void setCurrent_price_per_unit() {
    testMeat.setCurrent_price_per_unit(5.0);
    assertEquals(5.0,testMeat.getCurrent_price_per_unit());
  }

  @Test
  void getAvailable_quantity() {
    assertEquals(100,testMeat.getAvailable_quantity());
  }

  @Test
  void setAvailable_quantity() {
    testMeat.setAvailable_quantity(5);
    assertEquals(5, testMeat.getAvailable_quantity());
  }

  @Test
  void getMax_allowed_quantity() {
    assertEquals(100,testMeat.getMax_allowed_quantity());
  }

  @Test
  void setMax_allowed_quantity() {
    testMeat.setMax_allowed_quantity(5);
    assertEquals(5,testMeat.getMax_allowed_quantity());
  }
}