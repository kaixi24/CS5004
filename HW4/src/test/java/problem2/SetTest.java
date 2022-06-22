package problem2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import problem1.Course;
import problem1.CourseCatalog;

class SetTest {
  Set testSet;

  @BeforeEach
  void setUp() {
    testSet=new Set();
  }

  @Test
  void emptySet() {
    testSet.emptySet();
    assertEquals(testSet.isEmpty(),true);
  }

  @Test
  void isEmpty() {
    testSet.emptySet();
    assertEquals(testSet.isEmpty(),true);
  }

  @Test
  void add() {
    Set testSet2;
    testSet.emptySet();
    testSet2=testSet.add(2);
    //System.out.println(testSet.add(2).toString());
    assertEquals(testSet2.isEmpty(),false);

    testSet2=testSet2.add(2);
    assertEquals(1,testSet2.size());
    testSet2=testSet2.add(3);
    assertEquals(2,testSet2.size());
    testSet2=testSet2.add(4);
    testSet2=testSet2.add(5);
    testSet2=testSet2.add(6);
    testSet2=testSet2.add(7);
    testSet2=testSet2.add(8);
    testSet2=testSet2.add(9);
    testSet2=testSet2.add(10);
    testSet2=testSet2.add(11);
    testSet2=testSet2.add(12);
    assertEquals(11,testSet2.size());
  }

  @Test
  void contains() {
    Set testSet2;
    testSet.emptySet();
    testSet2=testSet.add(2);
   // System.out.println(testSet.toString());
    assertEquals(true,testSet2.contains(2));
  }
  @Test
  void remove() {
    Set testSet3;
    testSet.emptySet();
    testSet3=testSet.remove(2);
    assertEquals(0,testSet3.size());

    Set testSet2;
    testSet2=testSet.add(2);
    //System.out.println(testSet2.toString());
    testSet2=testSet2.remove(2);
    //System.out.println(testSet2.toString());
    assertEquals(0,testSet2.size());

    Set testSet4;
    testSet4=testSet.add(2);
    testSet4=testSet4.add(3);
    testSet4=testSet4.add(4);
    testSet4= testSet4.remove(3);
    assertEquals(2,testSet4.size());

  }

  @Test
  void size() {
    testSet.emptySet();
    assertEquals(0,testSet.size());
  }

  @Test
  void testEquals() {
    Set testSet;
    testSet=new Set();
    assertTrue(testSet.equals(testSet));
    assertFalse(testSet.equals(null));
    Set testSet1=testSet;
    assertEquals(testSet1,testSet);
    CourseCatalog testCourseCatalog;
    testCourseCatalog=new CourseCatalog();
    assertFalse(testSet.equals(testCourseCatalog));

    Set testSet2;
    testSet2=new Set();
    testSet2=testSet2.add(1);
    assertFalse(testSet1.equals(testSet2));
    Set testSet3;
    testSet3=new Set();
    testSet3=testSet3.add(2);
    assertFalse(testSet2.equals(testSet3));
    testSet3=testSet3.add(3);
    assertFalse(testSet2.equals(testSet3));

  }

  @Test
  void testHashCode() {
    Set testSet1;
    testSet1=testSet;
    assertEquals(testSet.hashCode(),testSet1.hashCode());
  }
}