import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CleaningTest {
  Cleaning testCleaning, testCleaning1;

  @BeforeEach
  void setUp() throws IllegalPetNumberException {
    testCleaning=new Cleaning("Seattle",true,8,Size.small,2);
  }

  @Test
  void validatePetNumber() throws IllegalPetNumberException {
    testCleaning.validatePetNumber(2);
    assertEquals(2,testCleaning.getPetNumber());
  }
  @Test
  void getPetNumber() {
    assertEquals(2,testCleaning.getPetNumber());
  }

  @Test
  void setPetNumber() throws IllegalPetNumberException {
    testCleaning.setPetNumber(2);
    assertEquals(2,testCleaning.getPetNumber());
  }

  @Test
  void testEquals() throws IllegalPetNumberException {
    assertTrue(testCleaning.equals(testCleaning));
    assertFalse(testCleaning.equals(null));
    Cleaning testCleaning1=testCleaning;
    assertEquals(testCleaning1,testCleaning);
    Painting testPainting;
    testPainting=new Painting("Seattle",true,8,Size.small,2);
    assertFalse(testCleaning.equals(testPainting));

  }

  @Test
  void testHashCode() throws IllegalPetNumberException {
    testCleaning1=new Cleaning("Seattle",true,8,Size.small,2);
    assertEquals(testCleaning1.hashCode(),testCleaning.hashCode());
  }

  @Test
  void getNumberServices() {
    assertEquals(8,testCleaning.getNumberServices());
  }

  @Test
  void setNumberServices() {
    testCleaning.setNumberServices(8);
    assertEquals(8,testCleaning.getNumberServices());
  }

  @Test
  void getSize() {
    assertEquals(Size.small,testCleaning.getSize());
  }

  @Test
  void setSize() {
    testCleaning.setSize(Size.small);
    assertEquals(Size.small,testCleaning.getSize());
  }

  @Test
  void getPropertyAddress() {
    assertEquals("Seattle",testCleaning.getPropertyAddress());
  }

  @Test
  void setPropertyAddress() {
    testCleaning.setPropertyAddress("Seattle");
    assertEquals("Seattle",testCleaning.getPropertyAddress());
  }

  @Test
  void isMonthlyService() {
    assertEquals(true,testCleaning.isMonthlyService());
  }

  @Test
  void setMonthlyService() {
    testCleaning.setMonthlyService(true);
    assertEquals(true,testCleaning.isMonthlyService());
  }

  @Test
  void discount() {
    assertEquals(0.9,testCleaning.discount());

    testCleaning.setNumberServices(9);
    assertEquals(0.5,testCleaning.discount());

    testCleaning.setNumberServices(8);
    testCleaning.setMonthlyService(false);
    assertEquals(1.0,testCleaning.discount());
  }


  @Test
  void calculatePrice() throws IllegalPetNumberException {
    assertEquals(75.6,testCleaning.calculatePrice());

    testCleaning.setSize(Size.large);
    assertEquals(302.4,testCleaning.calculatePrice());

    testCleaning.setSize(Size.medium);
    assertEquals(151.2,testCleaning.calculatePrice());

    testCleaning.setPetNumber(3);
    assertEquals(154.08,testCleaning.calculatePrice());

    testCleaning.setSize(Size.small);
    assertEquals(77.04,testCleaning.calculatePrice());

    testCleaning.setSize(Size.large);
    assertEquals(308.16,testCleaning.calculatePrice());

    testCleaning.setPetNumber(0);
    assertEquals(288,testCleaning.calculatePrice());

    testCleaning.setSize(Size.small);
    assertEquals(72,testCleaning.calculatePrice());

    testCleaning.setSize(Size.medium);
    assertEquals(144,testCleaning.calculatePrice());

  }

}