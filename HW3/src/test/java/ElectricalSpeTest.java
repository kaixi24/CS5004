import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ElectricalSpeTest {
  ElectricalSpe testElectricalSpe, testElectricalSpe1;

  @BeforeEach
  void setUp() {
    testElectricalSpe=new ElectricalSpe("Seattle",true,3,Size.large,3,true);
  }

  @Test
  void getEmployeeNumber() {
    assertEquals(3,testElectricalSpe.getEmployeeNumber());
  }

  @Test
  void setEmployeeNumber() {
    testElectricalSpe.setEmployeeNumber(3);
    assertEquals(3,testElectricalSpe.getEmployeeNumber());

    testElectricalSpe.setEmployeeNumber(5);
    assertEquals(4,testElectricalSpe.getEmployeeNumber());
  }

  @Test
  void isComplex() {
    assertEquals(true,testElectricalSpe.isComplex());
  }

  @Test
  void setComplex() {
    testElectricalSpe.setComplex(true);
    assertEquals(true,testElectricalSpe.isComplex());
  }

  @Test
  void testEquals() throws IllegalPetNumberException {
    assertTrue(testElectricalSpe.equals(testElectricalSpe));
    assertFalse(testElectricalSpe.equals(null));
    ElectricalSpe testElectricalSpe1=testElectricalSpe;
    assertEquals(testElectricalSpe1,testElectricalSpe);
    Painting testPainting;
    testPainting=new Painting("Seattle",true,8,Size.small,2);
    assertFalse(testPainting.equals(testElectricalSpe));
  }

  @Test
  void testHashCode() {
    testElectricalSpe1=new ElectricalSpe("Seattle",true,3,Size.large,3,true);
    assertEquals(testElectricalSpe1.hashCode(),testElectricalSpe.hashCode());
  }

  @Test
  void getNumberServices() {
    assertEquals(3,testElectricalSpe.getNumberServices());
  }

  @Test
  void setNumberServices() {
    testElectricalSpe.setNumberServices(3);
    assertEquals(3,testElectricalSpe.getNumberServices());
  }

  @Test
  void getSize() {
    assertEquals(Size.large,testElectricalSpe.getSize());
  }

  @Test
  void setSize() {
    testElectricalSpe.setSize(Size.large);
    assertEquals(Size.large,testElectricalSpe.getSize());
  }

  @Test
  void getPropertyAddress() {
    assertEquals("Seattle",testElectricalSpe.getPropertyAddress());
  }

  @Test
  void setPropertyAddress() {
    testElectricalSpe.setPropertyAddress("Seattle");
    assertEquals("Seattle",testElectricalSpe.getPropertyAddress());
  }

  @Test
  void isMonthlyService() {
    assertEquals(true,testElectricalSpe.isMonthlyService());
  }

  @Test
  void setMonthlyService() {
    testElectricalSpe.setMonthlyService(true);
    assertEquals(true,testElectricalSpe.isMonthlyService());
  }

  @Test
  void discount() {
    assertEquals(0.9,testElectricalSpe.discount());

    testElectricalSpe.setNumberServices(9);
    assertEquals(0.5,testElectricalSpe.discount());

    testElectricalSpe.setNumberServices(8);
    testElectricalSpe.setMonthlyService(false);
    assertEquals(1.0,testElectricalSpe.discount());
  }


  @Test
  void testSetEmployeeNumber() {
    testElectricalSpe.setEmployeeNumber(3);
    assertEquals(3,testElectricalSpe.getEmployeeNumber());
  }

  @Test
  void calculatePrice() {
    assertEquals(650,testElectricalSpe.calculatePrice());
  }

  @Test
  void validateEmployeeNumber() {
    testElectricalSpe.validateEmployeeNumber(3);
    assertEquals(3,testElectricalSpe.getEmployeeNumber());

    testElectricalSpe.setSize(Size.small);
    testElectricalSpe.validateEmployeeNumber(1);
    assertEquals(2,testElectricalSpe.getEmployeeNumber());

    testElectricalSpe.setSize(Size.large);
    testElectricalSpe.validateEmployeeNumber(1);
    assertEquals(3,testElectricalSpe.getEmployeeNumber());
  }
}