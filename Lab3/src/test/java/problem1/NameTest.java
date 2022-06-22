package problem1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class NameTest {
  Name testName;

  @BeforeEach
  void setUp() {
    testName=new Name("Harry", "Potter");
  }

  @Test
  void getFirstname() {
    assertEquals("Harry",testName.getFirstname());
  }

  @Test
  void getLastname() {
    assertEquals("Potter",testName.getLastname());
  }
}