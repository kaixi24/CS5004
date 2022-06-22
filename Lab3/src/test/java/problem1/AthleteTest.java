package problem1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import problem1.Athlete;
import problem1.Name;

class AthleteTest {
  private Name testName;
  private Athlete athlete1;
  private Athlete athlete2;

  @BeforeEach
  void setUp() {
    testName=new Name("Harry","Potter");
    athlete1= new Athlete(testName, 180.00, 80.00, "Sun");
    athlete2=new Athlete(testName,180.00,80.00);
  }

  @Test
  void getAthletesName() {
    assertEquals(testName, athlete1.getAthletesName());
    assertEquals(testName,athlete2.getAthletesName());

  }

  @Test
  void getHeight() {
    assertEquals(180.00,athlete1.getHeight());
    assertEquals(180.00,athlete2.getHeight());
  }

  @Test
  void getWeight() {
    assertEquals(80.00,athlete1.getWeight());
    assertEquals(80.00,athlete2.getWeight());
  }

  @Test
  void getLeague() {
    assertEquals("Sun",athlete1.getLeague());
    assertEquals(null,athlete2.getLeague());
  }
}