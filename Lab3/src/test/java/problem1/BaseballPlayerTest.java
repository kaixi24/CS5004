package problem1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import problem1.BaseballPlayer;
import problem1.Name;

class BaseballPlayerTest {
  private BaseballPlayer player1;
  private BaseballPlayer player2;
  private Name testName;

  @BeforeEach
  void setUp() {
    testName=new Name("Harry", "Potter");
    player1=new BaseballPlayer(testName,180.00,80.00,"Sun","Hero",230.10,20);
    player2=new BaseballPlayer(testName,180.00,80.00,"Hero",230.10,20);
  }

  @Test
  void getTeam() {
    assertEquals("Hero",player1.getTeam());
    assertEquals("Hero",player2.getTeam());
  }

  @Test
  void getAvg_batting() {
    assertEquals(230.10,player1.getAvg_batting());
    assertEquals(230.10,player2.getAvg_batting());
  }

  @Test
  void getSeasonHomeRuns() {
    assertEquals(20, player1.getSeasonHomeRuns());
    assertEquals(20, player2.getSeasonHomeRuns());
  }

  @Test
  void setTeam() {
    player1.setTeam("Hero");
    assertEquals("Hero",player1.getTeam());
    player2.setTeam("Hero");
    assertEquals("Hero",player2.getTeam());
  }

  @Test
  void setAvg_batting() {
    player1.setAvg_batting(230.10);
    assertEquals(230.10,player1.getAvg_batting());
    player2.setAvg_batting(230.10);
    assertEquals(230.10,player2.getAvg_batting());
  }

  @Test
  void setSeasonHomeRuns() {
    player1.setSeasonHomeRuns(20);
    assertEquals(20,player1.getSeasonHomeRuns());
    player2.setSeasonHomeRuns(20);
    assertEquals(20,player2.getSeasonHomeRuns());
  }
}