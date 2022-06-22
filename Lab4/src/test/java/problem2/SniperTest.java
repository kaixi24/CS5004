package problem2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SniperTest {

  Sniper testSniper;

  @BeforeEach
  void setUp() {
    testSniper = new Sniper("Harry", "Potter", 25, 50.0);
  }

  @Test
  void getStamina() {
    assertEquals(50.0, testSniper.getStamina());
  }

  @Test
  void setStamina() throws IncorrectInput {
    testSniper.setStamina(80.0);
    assertEquals(80.0, testSniper.getStamina());

    Assertions.assertThrows(IncorrectInput.class, () -> {
      testSniper.setStamina(-200.0);
    });
  }

  @Test
  void increase_stamina() throws IncorrectInput {
    assertEquals(80, testSniper.increase_stamina(30));
    Assertions.assertThrows(IncorrectStamina.class, () -> {
      testSniper.decrease_stamina(1200);
    });
  }

  @Test
  void decrease_stamina() throws IncorrectStamina {
    assertEquals(20, testSniper.decrease_stamina(30));

    Assertions.assertThrows(IncorrectStamina.class, () -> {
      testSniper.decrease_stamina(1200);
    });
  }

  @Test
  void getFirstName() {
    assertEquals("Harry", testSniper.getFirstName());
  }

  @Test
  void setFirstName() {
    testSniper.setFirstName("Harry");
    assertEquals("Harry", testSniper.getFirstName());
  }

  @Test
  void getLastName() {
    assertEquals("Potter", testSniper.getLastName());
  }

  @Test
  void setLastName() {
    testSniper.setLastName("Potter");
    assertEquals("Potter", testSniper.getLastName());
  }

  @Test
  void getAge() {
    assertEquals(25, testSniper.getAge());
  }

  @Test
  void setAge() throws IncorrectAge {
    testSniper.setAge(25);
    assertEquals(25, testSniper.getAge());

    Assertions.assertThrows(IncorrectAge.class, () -> {
      testSniper.setAge(-30);
    });
  }
  @Test
  void testEquals() {
    assertTrue(testSniper.equals(testSniper));
    assertFalse(testSniper.equals(null));
    Sniper testSniper1=testSniper;
    assertEquals(testSniper1,testSniper);
    Marine testMarine;
    testMarine=new Marine("Harry", "Potter", 25, 50.0);
    assertFalse(testMarine.equals(testSniper));

    Sniper testSniper2;
    testSniper2 =new Sniper("Harry", "Potter", 30, 50.0);
    assertFalse(testSniper2.equals(testSniper) && testSniper.equals(testSniper2));
    testSniper2 =new Sniper("Harry","Potter",25,50.0);
    assertTrue(testSniper2.equals(testSniper) && testSniper.equals(testSniper2));
  }

  @Test
  void testHashCode() {
    Sniper testSniper2=testSniper;
    assertEquals(testSniper2.hashCode(),testSniper.hashCode());
  }
}

