package problem1;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PledgeTest {
  Pledge testPledge,testPledge3;
  LocalDateTime time1=LocalDateTime.of(2014,1,2,3,4,5);
  LocalDateTime time2=LocalDateTime.of(2015,2,2,3,4,5);

  @BeforeEach
  void setUp() {
    testPledge=new Pledge(1000.0,time1,time2);

    Assertions.assertThrows(IllegalArgumentException.class, () -> {
      testPledge=new Pledge(-1000.0,time1,time2);
    });
  }

  @Test
  void getAmount() {
    assertEquals(1000.0,testPledge.getAmount());
  }

  @Test
  void setAmount() {
    testPledge.setAmount(1000.0);
    assertEquals(1000.0,testPledge.getAmount());

    Assertions.assertThrows(IllegalArgumentException.class, () -> {
      testPledge.setAmount(-100.0);
    });
  }

  @Test
  void getDonationTime() {
    assertEquals(time1,testPledge.getDonationTime());
  }

  @Test
  void setDonationTime() {
    testPledge.setDonationTime(time1);
    assertEquals(time1,testPledge.getDonationTime());
  }

  @Test
  void getProcessingDate() {
    assertEquals(time2,testPledge.getProcessingDate());
  }

  @Test
  void setProcessingDate() {
    testPledge.setProcessingDate(time2);
    assertEquals(time2,testPledge.getProcessingDate());

    testPledge.setProcessingDate(null);
    assertEquals(null,testPledge.getProcessingDate());

    LocalDateTime time3=LocalDateTime.of(2011,2,2,3,4,5);
    Assertions.assertThrows(IllegalArgumentException.class, () -> {
      testPledge.setProcessingDate(time3);
    });
  }


  @Test
  void getDonationForYear() {
    assertEquals(1000.0,testPledge.getDonationForYear(2015));

    assertEquals(0.0,testPledge.getDonationForYear(2014));

  }


  @Test
  void testEquals() {
    assertTrue(testPledge.equals(testPledge));

    assertFalse(testPledge.equals(null));

    Pledge testPledge1=testPledge;
    assertEquals(testPledge1,testPledge);

    MonthlyDonation testMonthlyDonation;
    LocalDateTime testDonationTime=LocalDateTime.of(2012,01,03,9,3,24);
    testMonthlyDonation=new MonthlyDonation(100.0,testDonationTime);
    assertFalse(testMonthlyDonation.equals(testPledge));


    LocalDateTime time1=LocalDateTime.of(2014,1,2,3,4,5);
    LocalDateTime time2=LocalDateTime.of(2017,2,2,3,4,5);
    testPledge3=new Pledge(100.0,time1, time2);
    assertFalse(testPledge3.equals(testPledge));

    Pledge testPledge5;
    testPledge5=new Pledge(1000.0,time1, time2);
    assertFalse(testPledge5.equals(testPledge));

  }

  @Test
  void testHashCode() {
    Pledge testPledge1;
    testPledge1=testPledge;
    assertEquals(testPledge1.hashCode(),testPledge.hashCode());
  }

  @Test
  void testToString() {
    assertEquals("Pledge{amount=1000.0, donationTime=2014-01-02T03:04:05, processingDate=2015-02-02T03:04:05}",testPledge.toString());
  }
}