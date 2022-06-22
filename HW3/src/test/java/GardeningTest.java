import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GardeningTest {
  Gardening testGardening, testGardening1;

  @BeforeEach
  void setUp() {
    testGardening=new Gardening("Seattle",true,8,Size.small);
  }

  @Test
  void getMoney() {
    assertEquals(80,testGardening.getMoney());

    testGardening.setSize(Size.medium);
    assertEquals(160,testGardening.getMoney());

    testGardening.setSize(Size.large);
    assertEquals(320,testGardening.getMoney());
  }

  @Test
  void getNumberServices() {
    assertEquals(8,testGardening.getNumberServices());
  }

  @Test
  void setNumberServices() {
    testGardening.setNumberServices(8);
    assertEquals(8,testGardening.getNumberServices());
  }

  @Test
  void getSize() {
    assertEquals(Size.small,testGardening.getSize());
  }

  @Test
  void setSize() {
    testGardening.setSize(Size.large);
    assertEquals(Size.large,testGardening.getSize());
  }

  @Test
  void getPropertyAddress() {
    assertEquals("Seattle",testGardening.getPropertyAddress());
  }

  @Test
  void setPropertyAddress() {
    testGardening.setPropertyAddress("Seattle");
    assertEquals("Seattle",testGardening.getPropertyAddress());
  }

  @Test
  void isMonthlyService() {
    assertEquals(true,testGardening.isMonthlyService());
  }

  @Test
  void setMonthlyService() {
    testGardening.setMonthlyService(true);
    assertEquals(true,testGardening.isMonthlyService());
  }

  @Test
  void discount() {
    assertEquals(0.9,testGardening.discount());

    testGardening.setNumberServices(9);
    assertEquals(0.5,testGardening.discount());

    testGardening.setNumberServices(8);
    testGardening.setMonthlyService(false);
    assertEquals(1.0,testGardening.discount());
  }

  @Test
  void testEquals() throws IllegalPetNumberException {
    assertTrue(testGardening.equals(testGardening));
    assertFalse(testGardening.equals(null));
    Gardening testGardening1=testGardening;
    assertEquals(testGardening1,testGardening);
    Painting testPainting;
    testPainting=new Painting("Seattle",true,8,Size.small,2);
    assertFalse(testPainting.equals(testGardening));
  }

  @Test
  void testHashCode() {
    testGardening1=new Gardening("Seattle",true,8,Size.small);
    assertEquals(testGardening1.hashCode(),testGardening.hashCode());
  }

  @Test
  void calculatePrice() {
    assertEquals(90.0,testGardening.calculatePrice());
  }
}