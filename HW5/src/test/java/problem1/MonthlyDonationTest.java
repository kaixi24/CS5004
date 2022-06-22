package problem1;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MonthlyDonationTest {
  MonthlyDonation testMonthlyDonation, testMonthlyDonation1, testMonthlyDonation2;
  LocalDateTime testDonationTime=LocalDateTime.of(2012,01,03,9,3,24);
  LocalDateTime testDonationTime1=LocalDateTime.of(2013,01,03,9,3,24);
  @BeforeEach
  void setUp() {
    testMonthlyDonation=new MonthlyDonation(100.0,testDonationTime);
  }

  @Test
  void getAmount() {
    assertEquals(100.0,testMonthlyDonation.getAmount());
  }

  @Test
  void setAmount() {
    testMonthlyDonation.setAmount(100.0);
    assertEquals(100.0,testMonthlyDonation.getAmount());
  }

  @Test
  void getDonationTime() {
    assertEquals(testDonationTime,testMonthlyDonation.getDonationTime());
  }

  @Test
  void setDonationTime() {
    testMonthlyDonation.setDonationTime(testDonationTime);
    assertEquals(testDonationTime,testMonthlyDonation.getDonationTime());
  }

  @Test
  void setCancelMonthlyDonation() {
    testMonthlyDonation.setCancelMonthlyDonation(testDonationTime1);
    assertEquals("MonthlyDonation{amount=100.0, donationTime=2012-01-03T09:03:24, cancelDate=2013-01-03T09:03:24}",testMonthlyDonation.toString());

    LocalDateTime testDonationTime2=LocalDateTime.of(2011,01,03,9,3,24);
    Assertions.assertThrows(IllegalArgumentException.class, () -> {
      testMonthlyDonation.setCancelMonthlyDonation(testDonationTime2);
    });
  }

  @Test
  void getCancelDate() {
    testMonthlyDonation.setCancelMonthlyDonation(testDonationTime1);
    assertEquals(testDonationTime1,testMonthlyDonation.getCancelDate());
  }

  @Test
  void getDonationForYear() {
    testMonthlyDonation.setCancelMonthlyDonation(testDonationTime1);
    assertEquals(0.0,testMonthlyDonation.getDonationForYear(2008));

    assertEquals(0.0,testMonthlyDonation.getDonationForYear(2015));

    //sout using the print to check
   assertEquals(1200.0,testMonthlyDonation.getDonationForYear(2012));

   testMonthlyDonation1=testMonthlyDonation;
   LocalDateTime testDonationTime3;
   testDonationTime3=LocalDateTime.of(2010,01,03,9,3,24);
   testMonthlyDonation1.setDonationTime(testDonationTime3);
   testMonthlyDonation1.setCancelMonthlyDonation(null);
    assertEquals(1200.0,testMonthlyDonation1.getDonationForYear(2010));
    assertEquals(1200.0,testMonthlyDonation1.getDonationForYear(2011));
    assertEquals(0.0,testMonthlyDonation1.getDonationForYear(2009));

    LocalDateTime testDonationTime4;
    testDonationTime4=LocalDateTime.of(2010,05,06,9,3,24);
    testMonthlyDonation1.setCancelMonthlyDonation(testDonationTime4);

    assertEquals(500.0,testMonthlyDonation1.getDonationForYear(2010));

    testDonationTime4=LocalDateTime.of(2010,05,01,9,3,24);
    testMonthlyDonation1.setCancelMonthlyDonation(testDonationTime4);
    assertEquals(400.0,testMonthlyDonation1.getDonationForYear(2010));

    LocalDateTime testDonationTime5;
    testDonationTime5=LocalDateTime.of(2008,05,01,9,3,24);
    testMonthlyDonation1.setDonationTime(testDonationTime5);
    assertEquals(1200.0,testMonthlyDonation1.getDonationForYear(2009));
    assertEquals(400.0,testMonthlyDonation1.getDonationForYear(2010));

  }


  @Test
  void testEquals() {
    assertTrue(testMonthlyDonation.equals(testMonthlyDonation));

    assertFalse(testMonthlyDonation.equals(null));

    MonthlyDonation testMonthlyDonation1=testMonthlyDonation;
    assertEquals(testMonthlyDonation1,testMonthlyDonation);

    OneTimeDonation testOneTimeDonation;
    LocalDateTime time=LocalDateTime.of(2012,01,03,9,3,24);
    testOneTimeDonation=new OneTimeDonation(100.0,time);
    assertFalse(testMonthlyDonation.equals(testOneTimeDonation));

    MonthlyDonation testMonthlyDonation5;
    LocalDateTime testDonationTime5=LocalDateTime.of(2012,01,03,9,3,24);
    LocalDateTime time1=LocalDateTime.of(2015,5,8,9,3,24);
    testMonthlyDonation5=new MonthlyDonation(100.0,testDonationTime5);
    testMonthlyDonation5.setCancelMonthlyDonation(time1);

    assertFalse(testMonthlyDonation5.equals(testMonthlyDonation));

    testMonthlyDonation5.setAmount(20.0);
    assertFalse(testMonthlyDonation5.equals(testMonthlyDonation));

  }

  @Test
  void testHashCode() {
    MonthlyDonation testMonthlyDonation1;
    testMonthlyDonation1=testMonthlyDonation;
    assertEquals(testMonthlyDonation1.hashCode(),testMonthlyDonation.hashCode());
  }

  @Test
  void testToString() {
    assertEquals("MonthlyDonation{amount=100.0, donationTime=2012-01-03T09:03:24, cancelDate=null}",testMonthlyDonation.toString());
  }
}