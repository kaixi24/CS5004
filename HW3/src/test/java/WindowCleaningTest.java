import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class WindowCleaningTest {
  WindowCleaning testWindowCleaning,testWindowCleaning1;

  @BeforeEach
  void setUp() throws IllegalFloorNumberException {
    testWindowCleaning=new WindowCleaning("Seattle",true,8,Size.small,3);
  }

  @Test
  void getMoney() {
    assertEquals(80,testWindowCleaning.getMoney());

    testWindowCleaning.setSize(Size.medium);
    assertEquals(160,testWindowCleaning.getMoney());

    testWindowCleaning.setSize(Size.large);
    assertEquals(320,testWindowCleaning.getMoney());
  }

  @Test
  void getNumberServices() {
    assertEquals(8,testWindowCleaning.getNumberServices());
  }

  @Test
  void setNumberServices() {
    testWindowCleaning.setNumberServices(8);
    assertEquals(8,testWindowCleaning.getNumberServices());
  }

  @Test
  void getSize() {
    assertEquals(Size.small,testWindowCleaning.getSize());
  }

  @Test
  void setSize() {
    testWindowCleaning.setSize(Size.small);
    assertEquals(Size.small,testWindowCleaning.getSize());
  }

  @Test
  void getPropertyAddress() {
    assertEquals("Seattle",testWindowCleaning.getPropertyAddress());
  }

  @Test
  void setPropertyAddress() {
    testWindowCleaning.setPropertyAddress("Seattle");
    assertEquals("Seattle",testWindowCleaning.getPropertyAddress());
  }

  @Test
  void isMonthlyService() {
    assertEquals(true,testWindowCleaning.isMonthlyService());
  }

  @Test
  void setMonthlyService() {
    testWindowCleaning.setMonthlyService(true);
    assertEquals(true,testWindowCleaning.isMonthlyService());
  }

  @Test
  void discount() {
    assertEquals(0.9,testWindowCleaning.discount());

    testWindowCleaning.setNumberServices(9);
    assertEquals(0.5,testWindowCleaning.discount());

    testWindowCleaning.setNumberServices(8);
    testWindowCleaning.setMonthlyService(false);
    assertEquals(1.0,testWindowCleaning.discount());
  }

  @Test
  void testEquals() throws IllegalPetNumberException {
    assertTrue(testWindowCleaning.equals(testWindowCleaning));
    assertFalse(testWindowCleaning.equals(null));
    WindowCleaning testWindowCleaning=testWindowCleaning1;
    assertEquals(testWindowCleaning1,testWindowCleaning);
    Painting testPainting;
    testPainting=new Painting("Seattle",true,8,Size.small,2);
    assertFalse(testPainting.equals(testWindowCleaning));
  }

  @Test
  void testHashCode() throws IllegalFloorNumberException {
    testWindowCleaning1=new WindowCleaning("Seattle",true,8,Size.small,3);
    assertEquals(testWindowCleaning1.hashCode(),testWindowCleaning.hashCode());
  }

  @Test
  void getFloorNumber() {
    assertEquals(3,testWindowCleaning.getFloorNumber());
  }

  @Test
  void setFloorNumber() throws IllegalFloorNumberException {
    testWindowCleaning.setFloorNumber(3);
    assertEquals(3,testWindowCleaning.getFloorNumber());

    Assertions.assertThrows(IllegalFloorNumberException.class, () -> {
      testWindowCleaning.setFloorNumber(-200);
    });
  }

  @Test
  void calculatePrice() {
    assertEquals(75.6,testWindowCleaning.calculatePrice());
  }
}