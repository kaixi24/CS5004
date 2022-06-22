package problem2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EngineerTest {
  Engineer testEngineer;

  @BeforeEach
  void setUp() {
    testEngineer=new Engineer("Harry","Potter",30, 200);
  }

  @Test
  void getWealth() {
    assertEquals(200,testEngineer.getWealth());
  }

  @Test
  void setWealth() throws IncorrectInput {
    testEngineer.setWealth(200);
    assertEquals(200,testEngineer.getWealth());

    Assertions.assertThrows(IncorrectInput.class, () -> {
      testEngineer.setWealth(-200);
    });
  }

  @Test
  void increase_wealth() {
    assertEquals(400, testEngineer.increase_wealth(200));
  }

  @Test
  void decrease_wealth() throws IncorrectDecreaseWealth{
    assertEquals(150,testEngineer.decrease_wealth(50));

    Assertions.assertThrows(IncorrectDecreaseWealth.class, () -> {
      testEngineer.decrease_wealth(1200);
    });
  }

  @Test
  void getFirstName() {
    assertEquals("Harry",testEngineer.getFirstName());
  }

  @Test
  void setFirstName() {
    testEngineer.setFirstName("Harry");
    assertEquals("Harry",testEngineer.getFirstName());
  }

  @Test
  void getLastName() {
    assertEquals("Potter",testEngineer.getLastName());
  }

  @Test
  void setLastName() {
    testEngineer.setLastName("Potter");
    assertEquals("Potter",testEngineer.getLastName());
  }

  @Test
  void getAge() throws IncorrectAge{
    assertEquals(30,testEngineer.getAge());
  }

  @Test
  void setAge() throws IncorrectAge {
    testEngineer.setAge(30);
    assertEquals(30,testEngineer.getAge());

    Assertions.assertThrows(IncorrectAge.class, () -> {
      testEngineer.setAge(1200);
    });
  }
}