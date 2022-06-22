package problem2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BoatTest {
  Boat testBoat;

  @BeforeEach
  void setUp() {
    testBoat = new Boat("12345", 80, 150);
  }

  @Test
  void getID() {
    assertEquals("12345", testBoat.getID());
  }

  @Test
  void setID() {
    testBoat.setID("12345");
    assertEquals("12345", testBoat.getID());
  }

  @Test
  void getAverageSpeed() {
    assertEquals(80, testBoat.getAverageSpeed());
  }

  @Test
  void setAverageSpeed() {
    testBoat.setAverageSpeed(80);
    assertEquals(80, testBoat.getAverageSpeed());
  }

  @Test
  void getMaxSpeed() {
    assertEquals(150, testBoat.getMaxSpeed());
  }

  @Test
  void setMaxSpeed() {
    testBoat.setMaxSpeed(150);
    assertEquals(150, testBoat.getMaxSpeed());
  }
}