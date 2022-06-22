package problem1;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class OneTimeDonationTest {
  OneTimeDonation testOneTimeDonation;
  LocalDateTime time=LocalDateTime.of(2012,01,03,9,3,24);

  @BeforeEach
  void setUp() {
    testOneTimeDonation=new OneTimeDonation(100.0,time);
  }

  @Test
  void getAmount() {
    assertEquals(100.0,testOneTimeDonation.getAmount());
  }

  @Test
  void setAmount() {
    testOneTimeDonation.setAmount(100.0);
    assertEquals(100.0,testOneTimeDonation.getAmount());
  }

  @Test
  void getDonationTime() {
    assertEquals(time,testOneTimeDonation.getDonationTime());
  }

  @Test
  void setDonationTime() {
    testOneTimeDonation.setDonationTime(time);
    assertEquals(time,testOneTimeDonation.getDonationTime());
  }

  @Test
  void testEquals() {
    assertTrue(testOneTimeDonation.equals(testOneTimeDonation));

    assertFalse(testOneTimeDonation.equals(null));

    OneTimeDonation testOneTimeDonation1=testOneTimeDonation;
    assertEquals(testOneTimeDonation1,testOneTimeDonation);

    MonthlyDonation testMonthlyDonation;
    LocalDateTime testDonationTime=LocalDateTime.of(2012,01,03,9,3,24);
    testMonthlyDonation=new MonthlyDonation(100.0,testDonationTime);
    assertFalse(testMonthlyDonation.equals(testOneTimeDonation));
  }

  @Test
  void testHashCode() {
    OneTimeDonation testOneTimeDonation1;
    testOneTimeDonation1=new OneTimeDonation(100.0,time);
    assertEquals(testOneTimeDonation1.hashCode(),testOneTimeDonation.hashCode());
  }

  @Test
  void testToString() {
    assertEquals("OneTimeDonation{amount=100.0, donationTime=2012-01-03T09:03:24}",testOneTimeDonation.toString());
  }

  @Test
  void getDonationForYear() {
    assertEquals(100.0,testOneTimeDonation.getDonationForYear(2012));

    assertEquals(0.0,testOneTimeDonation.getDonationForYear(2013));
  }


}