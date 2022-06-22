package problem2;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import problem1.MonthlyDonation;

class MusicTest {
  Music musicTest;
  RecordingArtist artist;

  @BeforeEach
  void setUp() {
    musicTest=new Music(artist,"Westlife",2005);
    Assertions.assertThrows(IllegalArgumentException.class, () -> {
      Music musicTest1=new Music(artist,"WestLife",-100);
    });

  }

  @Test
  void getCreator() {
    assertEquals(artist,musicTest.getCreator());
  }

  @Test
  void setCreator() {
    musicTest.setCreator(artist);
    assertEquals(artist,musicTest.getCreator());
  }

  @Test
  void getTitle() {
    assertEquals("Westlife",musicTest.getTitle());
  }

  @Test
  void setTitle() {
    musicTest.setTitle("Westlife");
    assertEquals("Westlife",musicTest.getTitle());
  }

  @Test
  void getYear() {
    assertEquals(2005,musicTest.getYear());
  }

  @Test
  void setYear() {
    musicTest.setYear(2005);
    assertEquals(2005,musicTest.getYear());

    Assertions.assertThrows(IllegalArgumentException.class, () -> {
      musicTest.setYear(-100);
    });
  }


  @Test
  void testToString() {
    assertEquals("Item{creator=null, title='Westlife', year=2005}",musicTest.toString());
  }


  @Test
  void testEquals() {
    assertTrue(musicTest.equals(musicTest));

    assertFalse(musicTest.equals(null));

    Music musicTest1=musicTest;
    assertEquals(musicTest1,musicTest);

    MonthlyDonation testMonthlyDonation;
    LocalDateTime testDonationTime=LocalDateTime.of(2012,01,03,9,3,24);
    testMonthlyDonation=new MonthlyDonation(100.0,testDonationTime);
    assertFalse(musicTest.equals(testMonthlyDonation));
  }

  @Test
  void testHashCode() {
    Music musicTest1;
    musicTest1=musicTest;
    assertEquals(musicTest.hashCode(),musicTest1.hashCode());
  }


}