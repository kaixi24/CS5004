package problem2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import problem1.IllegalBooking;

class LockerTest {
  Locker testLocker,testLocker1;
  MailItem mail;

  @BeforeEach
  void setUp() {
    testLocker=new Locker(5.0,5.0,5.0);
  }

  @Test
  void getMaxWidth() {
    assertEquals(5.0,testLocker.getMaxWidth());
  }

  @Test
  void setMaxWidth() {
    testLocker.setMaxWidth(5.0);
    assertEquals(5.0,testLocker.getMaxWidth());
  }

  @Test
  void getMaxHeight() {
    assertEquals(5.0,testLocker.getMaxHeight());
  }

  @Test
  void setMaxHeight() {
    testLocker.setMaxHeight(5.0);
    assertEquals(5.0,testLocker.getMaxHeight());
  }

  @Test
  void getMaxDepth() {
    assertEquals(5.0,testLocker.getMaxDepth());
  }

  @Test
  void setMaxDepth() {
    testLocker.setMaxDepth(5.0);
    assertEquals(5.0,testLocker.getMaxDepth());
  }

  @Test
  void getMail() {
    assertEquals(mail,testLocker.getMail());
  }

  @Test
  void setMail() {
    testLocker.setMail(mail);
    assertEquals(mail,testLocker.getMail());
  }

  @Test
   void addMail() throws IllegalAddMail {
    MailItem mail;
    MailItem mail2;
    Recipient recipient, recipient1;
    recipient = new Recipient("Harry", "Potter", "h@gmail.com");
    mail = new MailItem(2.0, 2.0, 2.0, recipient);
    testLocker.addMail(mail);
    assertEquals(mail,testLocker.getMail());

    MailItem finalMail3 = mail;
    Assertions.assertThrows(IllegalAddMail.class, () -> {
      testLocker.addMail(finalMail3);
    });
    mail = new MailItem(2.0, 2.0, 6.0, recipient);
    testLocker1=new Locker(5.0,5.0,5.0);
    MailItem finalMail = mail;
    Assertions.assertThrows(IllegalAddMail.class, () -> {
      testLocker1.addMail(finalMail);
    });
    mail2 = new MailItem(2.0, 6.0, 2.0, recipient);
    MailItem finalMail1 = mail2;
    Assertions.assertThrows(IllegalAddMail.class, () -> {
      testLocker1.addMail(finalMail1);
    });
    mail2 = new MailItem(2.0, 2.0, 6.0, recipient);
    MailItem finalMail2 = mail2;
    Assertions.assertThrows(IllegalAddMail.class, () -> {
      testLocker1.addMail(finalMail2);
    });
  }


  @Test
  void pickupMail() throws IllegalWithdrawMail, IllegalAddMail {
    Recipient recipient, recipient1;
    recipient = new Recipient("Harry", "Potter", "h@gmail.com");
    recipient1 = new Recipient("Harry", "Potter", "h1@gmail.com");
    mail = new MailItem(2.0, 2.0, 2.0, recipient);

    testLocker.addMail(mail);
    testLocker.pickupMail(recipient);
    assertEquals(null,testLocker.getMail());

    Assertions.assertThrows(IllegalWithdrawMail.class, () -> {
      testLocker.pickupMail(recipient1);
    });
  }

  @Test
  void testEquals() {
    assertTrue(testLocker.equals(testLocker));
    assertFalse(testLocker.equals(null));

    Locker testLocker1 = testLocker;
    assertEquals(testLocker1,testLocker);

    MailItem mail,mail1;
    Recipient recipient1,recipient;
    recipient1 = new Recipient("Harry", "Pott", "h@gmail.com");
    recipient = new Recipient("Harry", "Potter", "h@gmail.com");
    mail = new MailItem(2.0, 2.0, 2.0, recipient1);
    mail1= new MailItem (2.0,2.0,2.0,recipient);
    assertFalse(recipient1.equals(mail));

    Locker testLocker3;
    testLocker3 =new Locker(5.0,5.0,4.0);
    assertFalse(testLocker3.equals(testLocker) && testLocker.equals(testLocker3));

    testLocker3 =new Locker(5.0,4.0,5.0);
    assertFalse(testLocker3.equals(testLocker) && testLocker.equals(testLocker3));
    testLocker3 =new Locker(4.0,5.0,5.0);
    assertFalse(testLocker3.equals(testLocker) && testLocker.equals(testLocker3));
    testLocker3 =new Locker(5.0,5.0,4.0);
    assertFalse(testLocker3.equals(testLocker) && testLocker.equals(testLocker3));
    assertFalse(mail.equals(mail1));

  }

  @Test
  void testHashCode() {
    Locker testLocker3;
    testLocker3=new Locker(5.0,5.0,5.0);
    assertEquals(testLocker3.hashCode(),testLocker.hashCode());
  }

}