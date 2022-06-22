package problem2;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import problem1.MonthlyDonation;
import problem1.OneTimeDonation;
import problem1.Pledge;

class AuthorTest {
  Author testAuthor;
  Name name;
  RecordingArtist artist;

  @BeforeEach
  void setUp() {
    name=new Name("Harry", "Potter");
    testAuthor=new Author(name);
  }

  @Test
  void getName() {
    assertEquals(name,testAuthor.getName());
  }

  @Test
  void setName() {
    testAuthor.setName(name);
    assertEquals(name,testAuthor.getName());
  }

  @Test
  void testToString() {
    assertEquals("Person{name=Name{firstName='Harry', lastName='Potter'}}",testAuthor.toString());
  }


  @Test
  void testEquals() {
    assertTrue(testAuthor.equals(testAuthor));

    assertFalse(testAuthor.equals(null));

    Author testAuthor1=testAuthor;
    assertEquals(testAuthor1,testAuthor);

    MonthlyDonation testMonthlyDonation;
    LocalDateTime testDonationTime=LocalDateTime.of(2012,01,03,9,3,24);
    testMonthlyDonation=new MonthlyDonation(100.0,testDonationTime);
    assertFalse(testMonthlyDonation.equals(testAuthor));
  }

  @Test
  void testHashCode() {
    Author testAuthor1;
    testAuthor1=testAuthor;
    assertEquals(testAuthor1.hashCode(),testAuthor.hashCode());
  }


  @Test
  void isSameRecordingArtist() {
    assertEquals(false,testAuthor.isSameRecordingArtist(artist));
  }
}