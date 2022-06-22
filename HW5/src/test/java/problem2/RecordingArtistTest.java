package problem2;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import problem1.MonthlyDonation;

class RecordingArtistTest {
  Name name;
  RecordingArtist artist;

  @BeforeEach
  void setUp() {
    artist=new RecordingArtist(name);
  }

  @Test
  void getName() {
    assertEquals(name,artist.getName());
  }

  @Test
  void setName() {
    artist.setName(name);
    assertEquals(name,artist.getName());
  }

  @Test
  void testEquals() {
    assertTrue(artist.equals(artist));

    assertFalse(artist.equals(null));

    RecordingArtist artist1=artist;
    assertEquals(artist1,artist);

    MonthlyDonation testMonthlyDonation;
    LocalDateTime testDonationTime=LocalDateTime.of(2012,01,03,9,3,24);
    testMonthlyDonation=new MonthlyDonation(100.0,testDonationTime);
    assertFalse(testMonthlyDonation.equals(artist));
  }

  @Test
  void testHashCode() {
    RecordingArtist artist1;
    artist1=artist;
    assertEquals(artist1.hashCode(),artist.hashCode());
  }

  @Test
  void testToString() {
    assertEquals("RecordingArtist{}",artist.toString());
  }

  @Test
  void isSameRecordingArtist() {
    assertEquals(true,artist.isSameRecordingArtist(artist));
  }
}