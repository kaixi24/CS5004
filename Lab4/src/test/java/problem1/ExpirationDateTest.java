package problem1;

import static org.junit.jupiter.api.Assertions.*;

import jdk.jfr.Experimental;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ExpirationDateTest {
  ExpirationDate t1;

  @BeforeEach
  void setUp() {
    t1=new ExpirationDate(2022,3,16);
  }

  @Test
  void getYear() {
    assertEquals(2022,t1.getYear());
  }

  @Test
  void setYear() {
    t1.setYear(2022);
    assertEquals(2022,t1.getYear());
  }

  @Test
  void getMonth() {
    assertEquals(3,t1.getMonth());
  }

  @Test
  void setMonth() {
    t1.setMonth(3);
    assertEquals(3,t1.getMonth());
  }

  @Test
  void getDate() {
    assertEquals(16,t1.getDate());
  }

  @Test
  void setDate() {
    t1.setDate(16);
    assertEquals(16,t1.getDate());
  }
}