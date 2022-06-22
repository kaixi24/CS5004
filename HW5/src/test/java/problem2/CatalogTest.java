package problem2;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import problem1.MonthlyDonation;

class CatalogTest {
  Catalog testCatalog;
  Book book;
  Music music;
  Author author;
  Name name;
  RecordingArtist musician;


  @BeforeEach
  void setUp() {
    name= new Name("Jane", "Rowling");
    author=new Author(name);
    book=new Book(author,"Harry Potter",2010);
    testCatalog=new Catalog();
    musician=new RecordingArtist(name);
    music=new Music(musician,"Happy",2012);
    ArrayList<Item> list=new ArrayList<Item>();
    list.add(book);
    Catalog testCatalog1=new Catalog(list);
  }

  @Test
  void addItem() {
    testCatalog.addItem(book);
    assertEquals("Catalog{itemArray=[Item{creator=Person{name=Name{firstName='Jane', lastName='Rowling'}}, title='Harry Potter', year=2010}]}",testCatalog.toString());
  }

  @Test
  void removeItem() {
    testCatalog.addItem(book);
    testCatalog.removeItem(book);
    assertEquals("Catalog{itemArray=[]}",testCatalog.toString());
  }


  @Test
  void search() {
    testCatalog.addItem(book);
    ArrayList<Item> arr =new ArrayList<Item>();
    arr.add(book);
    assertEquals(arr,testCatalog.search("HA"));
  }


  @Test
  void testSearch() {
    testCatalog.addItem(book);
    ArrayList<Item> arr =new ArrayList<Item>();
    arr.add(book);
    assertEquals(arr,testCatalog.search(author));
  }


  @Test
  void testSearch1() {
    testCatalog.addItem(music);
    ArrayList<Item> arr =new ArrayList<Item>();
    arr.add(music);
    assertEquals(arr,testCatalog.search(musician));
  }


  @Test
  void testToString() {
    assertEquals("Catalog{itemArray=[]}",testCatalog.toString());
  }

  @Test
  void testEquals() {
    assertTrue(testCatalog.equals(testCatalog));

    assertFalse(testCatalog.equals(null));

    Catalog testCatalog1=testCatalog;
    assertEquals(testCatalog1,testCatalog);

    MonthlyDonation testMonthlyDonation;
    LocalDateTime testDonationTime=LocalDateTime.of(2012,01,03,9,3,24);
    testMonthlyDonation=new MonthlyDonation(100.0,testDonationTime);
    assertFalse(testCatalog.equals(testMonthlyDonation));

    Catalog testCatalog2;
    Book book2;
    Music music2;
    Author author2;
    Name name2;
    RecordingArtist musician2;
    name2= new Name("Jane", "Rowling");
    author2=new Author(name2);
    book2=new Book(author2,"Harry Potter and his life",2010);
    testCatalog2=new Catalog();
    musician2=new RecordingArtist(name2);
    music=new Music(musician2,"Happy",2012);
    testCatalog2.addItem(book2);
    assertFalse(testCatalog2.equals(testCatalog));
  }

  @Test
  void testHashCode() {
    Catalog testCatalog1;
    testCatalog1=testCatalog;
    assertEquals(testCatalog1.hashCode(),testCatalog.hashCode());
  }
}