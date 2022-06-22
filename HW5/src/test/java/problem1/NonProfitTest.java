package problem1;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class NonProfitTest {
  NonProfit testNonProfit;
  ArrayList<Donation> donation1=new ArrayList<Donation>();
  LocalDateTime time1=LocalDateTime.of(2012,1,3,9,3,24);
  OneTimeDonation testOneTimeDonation1=new OneTimeDonation(100.0,time1);

  @BeforeEach
  void setUp() {
    donation1.add(testOneTimeDonation1);
    testNonProfit=new NonProfit("Sunshine",donation1);
  }


  @Test
  void getTotalDonationsForYear() {
    assertEquals(100.0,testNonProfit.getTotalDonationsForYear(2012));

    Assertions.assertThrows(IllegalArgumentException.class, () -> {
      testNonProfit.getTotalDonationsForYear(-1000);
    });
  }


  @Test
  void testEquals() {
    NonProfit testNonProfit1;
    testNonProfit1=testNonProfit;
    assertTrue(testNonProfit.equals(testNonProfit1));

    assertFalse(testNonProfit.equals(null));

    MonthlyDonation testMonthlyDonation;
    LocalDateTime testDonationTime=LocalDateTime.of(2012,01,03,9,3,24);
    testMonthlyDonation=new MonthlyDonation(100.0,testDonationTime);
    assertFalse(testNonProfit.equals(testMonthlyDonation));

    ArrayList<Donation> donation2=new ArrayList<Donation>();
    LocalDateTime time2=LocalDateTime.of(2012,1,3,9,3,24);
    OneTimeDonation testOneTimeDonation2=new OneTimeDonation(100.0,time2);
    donation2.add(testOneTimeDonation2);
    NonProfit testNonProfit2=new NonProfit("Hello",donation2);
    assertFalse(testNonProfit2.equals(testNonProfit));
 //   System.out.println(testNonProfit2);
  //  System.out.println(testNonProfit);

    ArrayList<Donation> donation3=new ArrayList<Donation>();
    LocalDateTime time3=LocalDateTime.of(2014,1,3,9,3,24);
    OneTimeDonation testOneTimeDonation3=new OneTimeDonation(1000.0,time3);
    donation3.add(testOneTimeDonation3);
    NonProfit testNonProfit3=new NonProfit("Sunshine",donation3);
    assertFalse(testNonProfit3.equals(testNonProfit));

  //  System.out.println(testNonProfit3);
   // System.out.println(testNonProfit);


    ArrayList<Donation> donation4=new ArrayList<Donation>();
    LocalDateTime time4=LocalDateTime.of(2013,1,3,9,3,24);
    OneTimeDonation testOneTimeDonation4=new OneTimeDonation(1000.0,time4);
    donation4.add(testOneTimeDonation4);
    NonProfit testNonProfit4=new NonProfit("Hello",donation4);
    assertFalse(testNonProfit4.equals(testNonProfit));

  //  System.out.println(testNonProfit4);
   // System.out.println(testNonProfit);


    ArrayList<Donation> donation5=new ArrayList<Donation>();
    LocalDateTime time5=LocalDateTime.of(2012,1,3,9,3,24);
    OneTimeDonation testOneTimeDonation5=new OneTimeDonation(100.0,time5);
    donation5.add(testOneTimeDonation5);
    NonProfit testNonProfit5=new NonProfit("Sunshine",donation5);
    assertEquals(testNonProfit5,testNonProfit);

  }

  @Test
  void testHashCode() {
   NonProfit testNonProfit1;
    testNonProfit1=testNonProfit;
    assertEquals(testNonProfit1.hashCode(),testNonProfit.hashCode());
  }

  @Test
  void testToString() {
    assertEquals("NonProfit{orgName='Sunshine', donation=[OneTimeDonation{amount=100.0, donationTime=2012-01-03T09:03:24}]}",testNonProfit.toString());
  }
}