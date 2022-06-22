package problem2;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import problem1.MonthlyDonation;

class NameTest {
  Name testName;

  @BeforeEach
  void setUp() {
    testName=new Name("Harry","Potter");
  }

  @Test
  void getFirstName() {
    assertEquals("Harry",testName.getFirstName());
  }

  @Test
  void setFirstName() {
    testName.setFirstName("Harry");
    assertEquals("Harry",testName.getFirstName());
  }

  @Test
  void getLastName() {
    assertEquals("Potter",testName.getLastName());
  }

  @Test
  void setLastName() {
    testName.setLastName("Potter");
    assertEquals("Potter",testName.getLastName());
  }

  @Test
  void testToString() {
    assertEquals("Name{firstName='Harry', lastName='Potter'}",testName.toString());
  }

  @Test
  void testEquals() {
    assertTrue(testName.equals(testName));

    assertFalse(testName.equals(null));

    Name testName1=testName;
    assertEquals(testName,testName1);

    MonthlyDonation testMonthlyDonation;
    LocalDateTime testDonationTime=LocalDateTime.of(2012,01,03,9,3,24);
    testMonthlyDonation=new MonthlyDonation(100.0,testDonationTime);
    assertFalse(testName.equals(testMonthlyDonation));

    Name testName2=new Name("Harry","Happy");
    assertFalse(testName2.equals(testName));

    Name testName3=new Name("Happy","Potter");
    assertFalse(testName3.equals(testName));
  }

  @Test
  void testHashCode() {
    Name testName1;
    testName1=testName;
    assertEquals(testName1.hashCode(),testName.hashCode());
  }
}