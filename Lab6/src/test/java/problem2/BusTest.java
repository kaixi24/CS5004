package problem2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BusTest {
  Bus testBus;

  @BeforeEach
  void setUp() {
    testBus = new Bus("12345", 80, 150);
  }

  @Test
  void getID() {
    assertEquals("12345", testBus.getID());
  }

  @Test
  void setID() {
    testBus.setID("12345");
    assertEquals("12345", testBus.getID());
  }

  @Test
  void getAverageSpeed() {
    assertEquals(80, testBus.getAverageSpeed());
  }

  @Test
  void setAverageSpeed() {
    testBus.setAverageSpeed(80);
    assertEquals(80, testBus.getAverageSpeed());
  }

  @Test
  void getMaxSpeed() {
    assertEquals(150, testBus.getMaxSpeed());
  }

  @Test
  void setMaxSpeed() {
    testBus.setMaxSpeed(150);
    assertEquals(150, testBus.getMaxSpeed());
  }
}