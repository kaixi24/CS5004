import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PlumbingTest {
  Plumbing testPlumbing, testPlumbing1;

  @BeforeEach
  void setUp() {
    testPlumbing=new Plumbing("Seattle",true,4,Size.small,2,true);
  }

  @Test
  void getEmployeeNumber() {
    assertEquals(2,testPlumbing.getEmployeeNumber());
  }

  @Test
  void setEmployeeNumber() {
    testPlumbing.setEmployeeNumber(2);
    assertEquals(2,testPlumbing.getEmployeeNumber());
  }

  @Test
  void isComplex() {
    assertEquals(true,testPlumbing.isComplex());
  }

  @Test
  void setComplex() {
    testPlumbing.setComplex(true);
    assertEquals(true,testPlumbing.isComplex());
  }


  @Test
  void testEquals() throws IllegalPetNumberException {
    assertTrue(testPlumbing.equals(testPlumbing));
    assertFalse(testPlumbing.equals(null));
    Plumbing testPlumbing1=testPlumbing;
    assertEquals(testPlumbing1,testPlumbing);
    Painting testPainting;
    testPainting=new Painting("Seattle",true,8,Size.small,2);
    assertFalse(testPainting.equals(testPlumbing));
  }

  @Test
  void testHashCode() {
    testPlumbing1=new Plumbing("Seattle",true,4,Size.small,2,true);
    assertEquals(testPlumbing1.hashCode(),testPlumbing.hashCode());
  }

  @Test
  void getNumberServices() {
    assertEquals(4,testPlumbing.getNumberServices());
  }

  @Test
  void setNumberServices() {
    testPlumbing.setNumberServices(4);
    assertEquals(4,testPlumbing.getNumberServices());
  }

  @Test
  void getSize() {
    assertEquals(Size.small,testPlumbing.getSize());
  }

  @Test
  void setSize() {
    testPlumbing.setSize(Size.small);
    assertEquals(Size.small,testPlumbing.getSize());
  }

  @Test
  void getPropertyAddress() {
    assertEquals("Seattle",testPlumbing.getPropertyAddress());
  }

  @Test
  void setPropertyAddress() {
    testPlumbing.setPropertyAddress("Seattle");
    assertEquals("Seattle",testPlumbing.getPropertyAddress());
  }

  @Test
  void isMonthlyService() {
    assertEquals(true,testPlumbing.isMonthlyService());
  }

  @Test
  void setMonthlyService() {
    testPlumbing.setMonthlyService(true);
    assertEquals(true,testPlumbing.isMonthlyService());
  }

  @Test
  void discount() {
    assertEquals(0.9,testPlumbing.discount());

    testPlumbing.setNumberServices(9);
    assertEquals(0.5,testPlumbing.discount());

    testPlumbing.setNumberServices(8);
    testPlumbing.setMonthlyService(false);
    assertEquals(1.0,testPlumbing.discount());
  }

  @Test
  void calculatePrice() {
    assertEquals(420,testPlumbing.calculatePrice());
  }

  @Test
  void validateEmployeeNumber() {
    testPlumbing.validateEmployeeNumber(2);
    assertEquals(2,testPlumbing.getEmployeeNumber());

    testPlumbing.validateEmployeeNumber(1);
    assertEquals(2,testPlumbing.getEmployeeNumber());

    testPlumbing.setSize(Size.large);
    testPlumbing.validateEmployeeNumber(1);
    assertEquals(3,testPlumbing.getEmployeeNumber());
  }
}