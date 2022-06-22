package problem2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import problem1.Fruit;
import problem1.Meat;

class FarmerTest {
  Farmer testFarmer;

  @BeforeEach
  void setUp() {
    testFarmer =new Farmer("Harry","Potter",25,100);
  }


  @Test
  void getWealth() {
    assertEquals(100,testFarmer.getWealth());
  }

  @Test
  void setWealth() throws IncorrectInput {
    testFarmer.setWealth(100);
    assertEquals(100,testFarmer.getWealth());

    Assertions.assertThrows(IncorrectInput.class, () -> {
      testFarmer.setWealth(-200);
    });
  }

  @Test
  void testIncrease_wealth() {
    assertEquals(300, testFarmer.increase_wealth(200));
  }

  @Test
  void testDecrease_wealth() throws IncorrectDecreaseWealth{
    assertEquals(50,testFarmer.decrease_wealth(50));

    Assertions.assertThrows(IncorrectDecreaseWealth.class, () -> {
      testFarmer.decrease_wealth(1200);
    });
  }

  @Test
  void getFirstName() {
    assertEquals("Harry",testFarmer.getFirstName());
  }

  @Test
  void setFirstName() {
    testFarmer.setFirstName("Harry");
    assertEquals("Harry",testFarmer.getFirstName());
  }

  @Test
  void getLastName() {
    assertEquals("Potter",testFarmer.getLastName());
  }

  @Test
  void setLastName() {
    testFarmer.setLastName("Potter");
    assertEquals("Potter",testFarmer.getLastName());
  }

  @Test
  void getAge() {
    assertEquals(25,testFarmer.getAge());
  }

  @Test
  void setAge() throws IncorrectAge {
    testFarmer.setAge(25);
    assertEquals(25,testFarmer.getAge());

    Assertions.assertThrows(IncorrectAge.class, () -> {
      testFarmer.setAge(-30);
    });
  }
  @Test
  void testEquals() {
    assertTrue(testFarmer.equals(testFarmer));
    assertFalse(testFarmer.equals(null));
    Farmer testFarmer1=testFarmer;
    assertEquals(testFarmer1,testFarmer);
    Engineer testEngineer;
    testEngineer=new Engineer("Harry","Potter",25, 200);
    assertFalse(testFarmer.equals(testEngineer));

    Farmer testFarmer2;
    testFarmer2 =new Farmer("Harry","Potter",30,100);
    assertFalse(testFarmer.equals(testFarmer2) && testFarmer2.equals(testFarmer));
    testFarmer2 =new Farmer("Harry","Potter",25,100);
    assertTrue(testFarmer.equals(testFarmer2) && testFarmer2.equals(testFarmer));
  }

  @Test
  void testHashCode() {
    Farmer testFarmer2=testFarmer;
    assertEquals(testFarmer.hashCode(),testFarmer2.hashCode());
  }
}