package problem1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class OrderDateTest {
  OrderDate t1;


  @BeforeEach
  void setUp() {
    t1=new OrderDate(2021,2,12);
  }

  @Test
  void getYear() {
    assertEquals(2021,t1.getYear());
  }

  @Test
  void setYear() {
    t1.setYear(2021);
    assertEquals(2021,t1.getYear());
  }

  @Test
  void getMonth() {
    assertEquals(2,t1.getMonth());
  }

  @Test
  void setMonth() {
    t1.setMonth(2);
    assertEquals(2,t1.getMonth());
  }

  @Test
  void getDate() {
    assertEquals(12,t1.getDate());
  }

  @Test
  void setDate() {
    t1.setDate(12);
    assertEquals(12,t1.getDate());
  }
}