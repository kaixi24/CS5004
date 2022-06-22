package problem1;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import problem2.Set;

class CourseCatalogTest {
  CourseCatalog testCourseCatalog;

  @BeforeEach
  void setUp() {
    testCourseCatalog=new CourseCatalog();
  }

  @Test
  void append() {
    Course course;
    course=new Course("Data","CS5001",100);
    testCourseCatalog.append(course);
    assertEquals(testCourseCatalog.count(),1);
    assertEquals(testCourseCatalog.contains(course),true);

    Course course1;
    course1=new Course("Data","CS5002",100);
    testCourseCatalog.append(course1);

    Course course2;
    course2=new Course("Data","CS5003",100);
    testCourseCatalog.append(course2);

    Course course3;
    course3=new Course("Data","CS5004",100);
    testCourseCatalog.append(course3);

    Course course4;
    course4=new Course("Data","CS5005",100);
    testCourseCatalog.append(course4);

    Course course5;
    course5=new Course("Data","CS5006",100);
    testCourseCatalog.append(course5);

    Course course6;
    course6=new Course("Data","CS5007",100);
    testCourseCatalog.append(course6);

    Course course7;
    course7=new Course("Data","CS5008",100);
    testCourseCatalog.append(course7);

    Course course8;
    course8=new Course("Data","CS5009",100);
    testCourseCatalog.append(course8);

    Course course9;
    course9=new Course("Data","CS5010",100);
    testCourseCatalog.append(course9);

    Course course10;
    course10=new Course("Data","CS5011",100);
    testCourseCatalog.append(course10);

    Course course11;
    course11=new Course("Data","CS5012",100);
    testCourseCatalog.append(course11);
  }

 @Test
  void remove() throws CourseNotFoundException {
    Course course;
    course=new Course("Data","CS5001",100);
    Course course1;
    course1=new Course("Data2","CS5002",50);
    Course course2;
    course2=new Course("Data2","CS5002",50);
    testCourseCatalog.append(course);
    testCourseCatalog.append(course1);
    testCourseCatalog.remove(course1);
    assertEquals(testCourseCatalog.count(),1);

   Assertions.assertThrows(CourseNotFoundException.class, () -> {
     testCourseCatalog.remove(course2);
   });
  }

  @Test
  void contains() {
    Course course;
    course=new Course("Data","CS5001",100);
    testCourseCatalog.append(course);
    assertEquals(true,testCourseCatalog.contains(course));
  }

  @Test
  void indexOf() {
    testCourseCatalog=new CourseCatalog();
    Course course;
    course=new Course("Data","CS5001",100);
    testCourseCatalog.append(course);
    assertEquals(0,testCourseCatalog.indexOf(course));

    Course course1;
    course1=new Course("Data","CS5002",100);
    assertEquals(-1,testCourseCatalog.indexOf(course1));
  }

  @Test
  void count() {
    Course course;
    course=new Course("Data","CS5001",100);
    testCourseCatalog.append(course);
    assertEquals(1,testCourseCatalog.count());
  }

  @Test
  void get() throws InvalidIndexException {
    Assertions.assertThrows(InvalidIndexException.class, () -> {
     testCourseCatalog.get(3);
    });
    Course course;
    course=new Course("Data","CS5001",100);
    testCourseCatalog.append(course);
    assertEquals(course,testCourseCatalog.get(0));
  }

  @Test
  void isEmpty() throws CourseNotFoundException {
    Course course;
    course=new Course("Data","CS5001",100);
    testCourseCatalog.append(course);
    assertEquals(false,testCourseCatalog.isEmpty());
    testCourseCatalog.remove(course);
    assertEquals(true,testCourseCatalog.isEmpty());
  }

  @Test
  void testEquals() {
    Course course;
    course=new Course("Data","CS5001",100);
    testCourseCatalog.append(course);
    assertTrue(testCourseCatalog.equals(testCourseCatalog));
    assertFalse(testCourseCatalog.equals(null));
    CourseCatalog testCourseCatalog1=testCourseCatalog;
    assertEquals(testCourseCatalog,testCourseCatalog1);
    testCourseCatalog1=new CourseCatalog();
    assertFalse(course.equals(testCourseCatalog1));

    Course course1;
    course1=new Course("Data2","CS5002",50);
    testCourseCatalog.append(course1);
    assertFalse(testCourseCatalog.equals(testCourseCatalog1));


    CourseCatalog testCourseCatalog2;
    testCourseCatalog2=new CourseCatalog();
    Course course3;
    course3=new Course("Data2","CS5002",70);
    testCourseCatalog2.append(course3);
    testCourseCatalog2.append(course1);
    assertFalse(testCourseCatalog1.equals(testCourseCatalog2));

    testCourseCatalog.append(course3);
    assertFalse(testCourseCatalog.equals(testCourseCatalog2));
  }

  @Test
  void testHashCode() {
    CourseCatalog testCourseCatalog1;
    testCourseCatalog1=new CourseCatalog();
    assertEquals(testCourseCatalog1.hashCode(),testCourseCatalog.hashCode());
  }


  @Test
  void testToString() {
    assertEquals("CourseCatalog{count=0, courseArray=[null, null, null, null, null, null, null, null, null, null]}",testCourseCatalog.toString());
  }
}