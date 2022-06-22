package problem2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MarineTest {
  Marine testMarine;

  @BeforeEach
  void setUp() {
    testMarine=new Marine("Harry","Potter",25,50.0);
  }

  @Test
  void getStamina() {
    assertEquals(50.0,testMarine.getStamina());
  }

  @Test
  void setStamina() throws IncorrectInput {
    testMarine.setStamina(50.0);
    assertEquals(50.0, testMarine.getStamina());

    Assertions.assertThrows(IncorrectInput.class, () -> {
      testMarine.setStamina(-200.0);
    });
  }

  @Test
  void increase_stamina() throws IncorrectStamina {
    assertEquals(70, testMarine.increase_stamina(20));
    Assertions.assertThrows(IncorrectStamina.class, () -> {
      testMarine.decrease_stamina(1200);
    });
  }


  @Test
  void decrease_stamina() throws IncorrectStamina {
    assertEquals(20, testMarine.decrease_stamina(30));

    Assertions.assertThrows(IncorrectStamina.class, () -> {
      testMarine.decrease_stamina(1200);
    });
  }

  @Test
  void getFirstName() {
    assertEquals("Harry",testMarine.getFirstName());
  }

  @Test
  void setFirstName() {
    testMarine.setFirstName("Harry");
    assertEquals("Harry",testMarine.getFirstName());
  }

  @Test
  void getLastName() {
    assertEquals("Potter",testMarine.getLastName());
  }

  @Test
  void setLastName() {
    testMarine.setFirstName("Potter");
    assertEquals("Potter",testMarine.getFirstName());
  }

  @Test
  void getAge() {
    assertEquals(25,testMarine.getAge());
  }

  @Test
  void setAge() throws IncorrectAge{
    testMarine.setAge(25);
    assertEquals(25,testMarine.getAge());

    Assertions.assertThrows(IncorrectAge.class, () -> {
      testMarine.setAge(1200);
    });
  }
}