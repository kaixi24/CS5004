package problem1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import problem1.Name;
import problem1.Runner;

class RunnerTest {
  private Runner runner1;
  private Runner runner2;
  private Name testName;

  @BeforeEach
  void setUp() {
    testName=new Name("Harry", "Potter");
    runner1=new Runner(testName,180.00,80.00,"Sun",5.5,4.5,"Olympics");
    runner2=new Runner(testName,180.00,80.00,5.5,4.5,"Olympics");
  }

  @Test
  void getBest5kTime() {
    assertEquals(5.5,runner1.getBest5kTime());
    assertEquals(5.5,runner2.getBest5kTime());
  }

  @Test
  void getBestH_M_Time() {
    assertEquals(4.5,runner1.getBestH_M_Time());
    assertEquals(4.5,runner2.getBestH_M_Time());
  }

  @Test
  void getFavEvent() {
    assertEquals("Olympics",runner1.getFavEvent());
    assertEquals("Olympics",runner2.getFavEvent());
  }

  @Test
  void setBest5kTime() {
    runner1.setBest5kTime(5.5);
    assertEquals(5.5,runner1.getBest5kTime());
    runner2.setBest5kTime(5.5);
    assertEquals(5.5,runner2.getBest5kTime());
  }

  @Test
  void setBestH_M_Time() {
    runner1.setBestH_M_Time(4.5);
    assertEquals(4.5,runner1.getBestH_M_Time());
    runner2.setBestH_M_Time(4.5);
    assertEquals(4.5,runner2.getBestH_M_Time());
  }

  @Test
  void setFavEvent() {
    runner1.setFavEvent("Olympics");
    assertEquals("Olympics",runner1.getFavEvent());
    runner2.setFavEvent("Olympics");
    assertEquals("Olympics",runner2.getFavEvent());
  }
}