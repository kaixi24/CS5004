package problem2;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import problem1.MonthlyDonation;

class BandTest {
  Band testBand;
  RecordingArtist artist;
  Name name;
  ArrayList<RecordingArtist> list1 =new ArrayList<RecordingArtist>();

  @BeforeEach
  void setUp() {
    name=new Name("Harry","Potter");
    artist=new RecordingArtist(name);
    list1.add(artist);
    testBand=new Band("Sun",list1);
  }

  @Test
  void getBandName() {
    assertEquals("Sun",testBand.getBandName());
  }

  @Test
  void setBandName() {
    testBand.setBandName("Sun");
    assertEquals("Sun",testBand.getBandName());
  }

  @Test
  void addRecordingArtist() {
    testBand.addRecordingArtist(artist);
    assertEquals("Band{bandName='Sun', list=[RecordingArtist{}, RecordingArtist{}]}",testBand.toString());
  }


  @Test
  void removeRecordingArtist() {
    testBand.addRecordingArtist(artist);
    testBand.removeRecordingArtist(artist);
    assertEquals("Band{bandName='Sun', list=[RecordingArtist{}]}",testBand.toString());
  }


  @Test
  void isSameRecordingArtist() {
    Name name1=new Name("Harry","Potter");
    RecordingArtist artist1= new RecordingArtist(name1);
    assertEquals(true,testBand.isSameRecordingArtist(artist1));

    Name name2=new Name("Happy","Potter");
    RecordingArtist artist2= new RecordingArtist(name2);
    assertEquals(false,testBand.isSameRecordingArtist(artist2));
  }

  @Test
  void testEquals() {
    assertTrue(testBand.equals(testBand));

    assertFalse(testBand.equals(null));

    Band testBand1=testBand;
    assertEquals(testBand1,testBand);

    MonthlyDonation testMonthlyDonation;
    LocalDateTime testDonationTime=LocalDateTime.of(2012,01,03,9,3,24);
    testMonthlyDonation=new MonthlyDonation(100.0,testDonationTime);
    assertFalse(testBand.equals(testMonthlyDonation));

    Band testBand2;
    RecordingArtist artist2;
    Name name2;
    ArrayList<RecordingArtist> list2 =new ArrayList<RecordingArtist>();
    name2=new Name("Harry","Potter");
    artist2=new RecordingArtist(name2);
    list2.add(artist2);
    testBand2=new Band("Sunshine",list2);
    assertFalse(testBand2.equals(testBand));

    Band testBand3;
    RecordingArtist artist3;
    Name name3;
    ArrayList<RecordingArtist> list3 =new ArrayList<RecordingArtist>();
    name3=new Name("Harry","PotterHHH");
    artist3=new RecordingArtist(name3);
    list3.add(artist3);
    testBand3=new Band("Sun",list3);
    assertFalse(testBand3.equals(testBand));


    Band testBand4;
    RecordingArtist artist4;
    Name name4;
    ArrayList<RecordingArtist> list4 =new ArrayList<RecordingArtist>();
    name4=new Name("Harry","PotterHHH");
    artist4=new RecordingArtist(name4);
    list4.add(artist4);
    testBand4=new Band("Sunshine",list4);
    assertFalse(testBand4.equals(testBand));


    Band testBand5;
    RecordingArtist artist5;
    Name name5;
    ArrayList<RecordingArtist> list5 =new ArrayList<RecordingArtist>();
    name5=new Name("Harry","Potter");
    artist5=new RecordingArtist(name5);
    list5.add(artist5);
    testBand5=new Band("Sun",list5);
    assertTrue(testBand5.equals(testBand));

  }

  @Test
  void testHashCode() {
    Band testBand1;
    testBand1=testBand;
    assertEquals(testBand1.hashCode(),testBand.hashCode());
  }

  @Test
  void testToString() {
    assertEquals("Band{bandName='Sun', list=[RecordingArtist{}]}",testBand.toString());
  }
}