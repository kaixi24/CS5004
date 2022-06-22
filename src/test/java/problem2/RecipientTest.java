package problem2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import problem1.DoubleRoom;
import problem1.Room;
import problem1.SingleRoom;

class RecipientTest {
  Recipient recipient;
  Recipient r;

  @BeforeEach
  void setUp() {
    recipient=new Recipient ("Harry","Potter","h@gmail.com");
  }

  @Test
  void getFirstName() {
    assertEquals("Harry",recipient.getFirstName());
  }

  @Test
  void setFirstName() {
    recipient.setFirstName("Harry");
    assertEquals("Harry",recipient.getFirstName());
  }

  @Test
  void getLastName() {
    assertEquals("Potter",recipient.getLastName());
  }

  @Test
  void setLastName() {
    recipient.setFirstName("Potter");
    assertEquals("Potter",recipient.getLastName());
  }

  @Test
  void getEmailAddress() {
    assertEquals("h@gmail.com",recipient.getEmailAddress());
  }

  @Test
  void setEmailAddress() {
    recipient.setEmailAddress("h@gmail.com");
    assertEquals("h@gmail.com",recipient.getEmailAddress());
  }

  @Test
  void testEquals() {
    assertTrue(recipient.equals(recipient));
    assertFalse(recipient.equals(null));
    Recipient recipient1=recipient;
    assertEquals(recipient1,recipient);
    MailItem mail;
    mail=new MailItem (3.0,3.0,3.0,recipient1);
    assertFalse(recipient.equals(mail));

    Recipient recipient3;
    recipient3 =new Recipient ("Harry","Pott","h@gmail.com");
    assertFalse(recipient3.equals(recipient) && recipient.equals(recipient3));
    recipient3 =new Recipient ("Harry","Potter","h@gmail.com");
    assertTrue(recipient3.equals(recipient) && recipient.equals(recipient3));
    recipient3 =new Recipient ("Harr","Potter","h@gmail.com");
    assertFalse(recipient3.equals(recipient) && recipient.equals(recipient3));
    recipient3 =new Recipient ("Harry","Potter","hr@gmail.com");
    assertFalse(recipient3.equals(recipient) && recipient.equals(recipient3));

  }

  @Test
  void testHashCode() {
    Recipient recipient3;
    recipient3=new Recipient("Harry","Potter","h@gmail.com");
    assertEquals(recipient3.hashCode(),recipient.hashCode());
  }
}