package problem2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TrainTest {

  Train testTrain;

  @BeforeEach
  void setUp() {
    testTrain = new Train("12345", 80, 150);
  }

  @Test
  void getID() {
    assertEquals("12345", testTrain.getID());
  }

  @Test
  void setID() {
    testTrain.setID("12345");
    assertEquals("12345", testTrain.getID());
  }

  @Test
  void getAverageSpeed() {
    assertEquals(80, testTrain.getAverageSpeed());
  }

  @Test
  void setAverageSpeed() {
    testTrain.setAverageSpeed(80);
    assertEquals(80, testTrain.getAverageSpeed());
  }

  @Test
  void getMaxSpeed() {
    assertEquals(150, testTrain.getMaxSpeed());
  }

  @Test
  void setMaxSpeed() {
    testTrain.setMaxSpeed(150);
    assertEquals(150, testTrain.getMaxSpeed());
  }

}