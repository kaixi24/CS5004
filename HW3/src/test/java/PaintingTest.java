import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PaintingTest {
  Painting testPainting, testPainting1;

  @BeforeEach
  void setUp() throws IllegalPetNumberException{
    testPainting=new Painting("Seattle",true,8,Size.small,2);
  }

  @Test
  void getPetNumber() {
    assertEquals(2,testPainting.getPetNumber());
  }

  @Test
  void setPetNumber() throws IllegalPetNumberException {
    testPainting.setPetNumber(2);
    assertEquals(2,testPainting.getPetNumber());

    Assertions.assertThrows(IllegalPetNumberException.class, () -> {
      testPainting.setPetNumber(-2);
    });

  }

  @Test
  void testEquals() throws IllegalPetNumberException {
    assertTrue(testPainting.equals(testPainting));
    assertFalse(testPainting.equals(null));
    Painting testPainting1=testPainting;
    assertEquals(testPainting,testPainting1);
    Cleaning testCleaning;
    testCleaning=new Cleaning("Seattle",true,8,Size.small,2);
    assertFalse(testPainting.equals(testCleaning));
  }

  @Test
  void testHashCode() throws IllegalPetNumberException{
    testPainting1=new Painting("Seattle",true,8,Size.small,2);
    assertEquals(testPainting1.hashCode(),testPainting.hashCode());
  }

  @Test
  void getNumberServices() {
    assertEquals(8,testPainting.getNumberServices());
  }

  @Test
  void setNumberServices() {
    testPainting.setNumberServices(8);
    assertEquals(8,testPainting.getNumberServices());
  }

  @Test
  void getSize() {
    assertEquals(Size.small,testPainting.getSize());
  }

  @Test
  void setSize() {
    testPainting.setSize(Size.small);
    assertEquals(Size.small,testPainting.getSize());
  }

  @Test
  void getPropertyAddress() {
    assertEquals("Seattle",testPainting.getPropertyAddress());
  }

  @Test
  void setPropertyAddress() {
    testPainting.setPropertyAddress("Seattle");
    assertEquals("Seattle",testPainting.getPropertyAddress());
  }

  @Test
  void isMonthlyService() {
    assertEquals(true,testPainting.isMonthlyService());
  }

  @Test
  void setMonthlyService() {
    testPainting.setMonthlyService(true);
    assertEquals(true,testPainting.isMonthlyService());
  }

  @Test
  void discount() {
    assertEquals(0.9,testPainting.discount());

    testPainting.setNumberServices(9);
    assertEquals(0.5,testPainting.discount());

    testPainting.setNumberServices(8);
    testPainting.setMonthlyService(false);
    assertEquals(1.0,testPainting.discount());
  }

  @Test
  void calculatePrice() throws IllegalPetNumberException {
    assertEquals(1209.6,testPainting.calculatePrice());

    testPainting.setSize(Size.large);
    assertEquals(1814.4,testPainting.calculatePrice());

    testPainting.setPetNumber(0);
    assertEquals(1728.0,testPainting.calculatePrice());

    testPainting.setSize(Size.medium);
    assertEquals(1152.0,testPainting.calculatePrice());

  }

  @Test
  void validatePetNumber() throws IllegalPetNumberException {
    testPainting.validatePetNumber(2);
    assertEquals(2,testPainting.getPetNumber());
  }
}