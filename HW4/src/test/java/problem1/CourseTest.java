package problem1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CourseTest {
  Course testCourse;

  @BeforeEach
  void setUp() {
    testCourse=new Course("Data","CS5001",100);
  }

  @Test
  void testToString() {
    assertEquals(testCourse.toString(),"CS5001100: Data");
  }

  @Test
  void testEquals() {
    Course testCourse;
    testCourse=new Course("Data","CS5001",100);
    assertTrue(testCourse.equals(testCourse));
    assertFalse(testCourse.equals(null));
    Course testCourse1=testCourse;
    assertEquals(testCourse1,testCourse);
    CourseCatalog testCourseCatalog;
    testCourseCatalog=new CourseCatalog();
    assertFalse(testCourse.equals(testCourseCatalog));

    Course testCourse3;
    testCourse3=new Course("Data","CS5002",100);
    assertFalse(testCourse.equals(testCourse3));

    Course testCourse2;
    testCourse2=new Course("Data","CS5001",70);
    assertFalse(testCourse.equals(testCourse2));

    Course testCourse4;
    testCourse4=new Course("Data","CS5001",70);
    assertFalse(testCourse.equals(testCourse4));

  }

  @Test
  void testHashCode() {
    Course testCourse1;
    testCourse1=new Course("Data","CS5001",100);
    assertEquals(testCourse1.hashCode(),testCourse.hashCode());
  }
}