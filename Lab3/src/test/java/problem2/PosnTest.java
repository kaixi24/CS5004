package problem2;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashSet;
import java.util.Set;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PosnTest {
  Posn Posn1,Posn2,Posn3,Posn4,Posn5,Posn6,Posn7, Posn8;
  Object o1;

  @BeforeEach
  void setUp() {
    Posn1= new Posn(3,8);
  }

  @Test
  void getX() {
    assertEquals(3,Posn1.getX());
  }

  @Test
  void getY() {
    assertEquals(8,Posn1.getY());
  }

  @Test
  void testEquals() {
    // Reflexive test
    assertTrue(Posn1.equals(Posn1));
    Posn2= new Posn(3,8);
    Posn3= new Posn(3,8);
    //Symmetric test
    assertTrue(Posn1.equals(Posn2) && Posn2.equals(Posn1));
    //Transitive test
    if (Posn1.equals(Posn2) && Posn2.equals(Posn3))
      assertTrue(Posn1.equals(Posn3));
    //Consistent test
    Posn2= new Posn(4,8);
    assertFalse(Posn1.equals(Posn2));
    //No.5 test
    assertFalse(Posn1.equals(null));

    //test this==o
    Posn4= Posn1;
    assertTrue(Posn1.equals(Posn4)&& Posn4.equals(Posn1));
    //test o==null
    Posn5=null;
    assertFalse(Posn1.equals(Posn5));
    //test getClass()!=o.getClass()
    Posn6=new Posn(4,8);
    assertFalse(Posn1.equals(Posn6));
    // test (this.x != null ? !this.x.equals(posn.x) : posn.x != null)
    Posn7=new Posn(null,8);
    assertFalse(Posn7.equals(Posn1)&& Posn1.equals(Posn7));
    Posn8=new Posn (5,8);
    assertFalse(Posn1.equals(Posn8) && Posn8.equals(Posn1));
    // test ( this.y != null ? this.y.equals(posn.y) : posn.y == null)
    Posn7=new Posn(3,null);
    assertFalse(Posn7.equals(Posn1)&& Posn1.equals(Posn7));
    Posn8=new Posn (3,5);
    assertFalse(Posn1.equals(Posn8) && Posn8.equals(Posn1));
  }

  @Test
  void testHashCode() {
    Set<Posn> set = new HashSet<Posn>();
    set.add(new Posn(1, 2));
    set.add(new Posn(1, 2));
    assertEquals(1, set.size());
    Posn2= new Posn(3,8);
    assertEquals(Posn2.hashCode(),Posn1.hashCode());
    //test hashcode result
    Posn3=new Posn(null,2);
    assertEquals(2,Posn3.hashCode());
    Posn4=new Posn(2,null);
    assertEquals(62,Posn4.hashCode());
    Posn5=new Posn(3,8);
    assertEquals(101,Posn5.hashCode());

  }


  @Test
  void testToString() {
    assertEquals("Posn{x=3, y=8}",Posn1.toString());
  }
}