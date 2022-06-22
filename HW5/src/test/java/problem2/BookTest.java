package problem2;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import problem1.MonthlyDonation;

class BookTest {
  Book testBook;
  Author author;


  @BeforeEach
  void setUp() {
    Name name=new Name("Jane","Rowling");
    author=new Author(name);
    testBook=new Book(author,"Harry Potter", 2010);
  }

  @Test
  void getCreator() {
    assertEquals(author,testBook.getCreator());
  }

  @Test
  void setCreator() {
    testBook.setCreator(author);
    assertEquals(author,testBook.getCreator());
  }

  @Test
  void getTitle() {
    assertEquals("Harry Potter",testBook.getTitle());
  }

  @Test
  void setTitle() {
    testBook.setTitle("Harry Potter");
    assertEquals("Harry Potter",testBook.getTitle());
  }

  @Test
  void getYear() {
    assertEquals(2010,testBook.getYear());
  }

  @Test
  void setYear() {
    testBook.setYear(2010);
    assertEquals(2010,testBook.getYear());
  }

  @Test
  void testToString() {
    assertEquals("Item{creator=Person{name=Name{firstName='Jane', lastName='Rowling'}}, title='Harry Potter', year=2010}",testBook.toString());
  }

  @Test
  void testEquals() {
    assertTrue(testBook.equals(testBook));

    assertFalse(testBook.equals(null));

    Book testBook1=testBook;
    assertEquals(testBook1,testBook);

    MonthlyDonation testMonthlyDonation;
    LocalDateTime testDonationTime=LocalDateTime.of(2012,01,03,9,3,24);
    testMonthlyDonation=new MonthlyDonation(100.0,testDonationTime);
    assertFalse(testBook.equals(testMonthlyDonation));

    Book testBook2=new Book(author,"Harry Potter", 2011);
    assertFalse(testBook2.equals(testBook));

    Book testBook3=new Book(author,"Harry Potter and his friends", 2010);
    assertFalse(testBook3.equals(testBook));

    Name name4=new Name("John","Rowling");
    Author author4=new Author(name4);
    Book testBook4=new Book(author4,"Harry Potter", 2010);
    assertFalse(testBook4.equals(testBook));

    Book testBook5;
    Author author5;
    Name name5=new Name("Jane","Rowling");
    author5=new Author(name5);
    testBook5=new Book(author5,"Harry Potter", 2010);
    assertTrue(testBook5.equals(testBook));

  }

  @Test
  void testHashCode() {
   Book testBook1;
   testBook1=testBook;
   assertEquals(testBook.hashCode(),testBook1.hashCode());
  }

}