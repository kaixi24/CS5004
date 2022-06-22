package problem1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PastaTest {

  Pasta testPasta;

  @BeforeEach
  void setUp() {
    testPasta=new Pasta("Spaghetti",2.0,100,5);
  }

  @Test
  void getName() {
    assertEquals("Spaghetti",testPasta.getName());
  }

  @Test
  void setName() {
    testPasta.setName("Spaghetti");
    assertEquals("Spaghetti",testPasta.getName());
  }

  @Test
  void getCurrent_price_per_unit() {
    assertEquals(2.0,testPasta.getCurrent_price_per_unit());
  }

  @Test
  void setCurrent_price_per_unit() {
    testPasta.setCurrent_price_per_unit(2.0);
    assertEquals(2.0,testPasta.getCurrent_price_per_unit());
  }

  @Test
  void getAvailable_quantity() {
    assertEquals(100,testPasta.getAvailable_quantity());
  }

  @Test
  void setAvailable_quantity() {
    testPasta.setAvailable_quantity(100);
    assertEquals(100,testPasta.getAvailable_quantity());
  }

  @Test
  void getMax_allowed_quantity() {
    assertEquals(250,testPasta.getMax_allowed_quantity());
  }

  @Test
  void setMax_allowed_quantity() {
    testPasta.setMax_allowed_quantity(5);
    assertEquals(5,testPasta.getMax_allowed_quantity());
  }

}