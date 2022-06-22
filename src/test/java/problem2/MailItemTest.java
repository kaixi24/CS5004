package problem2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import problem1.IllegalBooking;

class MailItemTest {
  MailItem testMail;
  Recipient recipient;

  @BeforeEach
  void setUp() {
    testMail=new MailItem(2.0,2.0,2.0,recipient);
  }


  @Test
  void getWidth() {
    assertEquals(2.0,testMail.getWidth());
  }

  @Test
  void setWidth() throws IllegalInput {
    testMail.setWidth(2.0);
    assertEquals(2.0,testMail.getWidth());

    Assertions.assertThrows(IllegalInput.class, () -> {
      testMail.setWidth(0.5);});
  }

  @Test
  void getHeight() {
    assertEquals(2.0,testMail.getHeight());
  }

  @Test
  void setHeight() throws IllegalInput {
    testMail.setHeight(2.0);
    assertEquals(2.0,testMail.getHeight());

    Assertions.assertThrows(IllegalInput.class, () -> {
      testMail.setHeight(0.5);});
  }

  @Test
  void getDepth() {
    assertEquals(2.0,testMail.getDepth());
  }

  @Test
  void setDepth() throws IllegalInput {
    testMail.setDepth(2.0);
    assertEquals(2.0,testMail.getDepth());

    Assertions.assertThrows(IllegalInput.class, () -> {
      testMail.setDepth(0.5);});
  }

  @Test
  void getRecipient() {
    assertEquals(recipient,testMail.getRecipient());
  }

  @Test
  void setRecipient() {
    testMail.setRecipient(recipient);
    assertEquals(recipient,testMail.getRecipient());
  }

  @Test
  void testEquals() {
    assertTrue(testMail.equals(testMail));
    assertFalse(testMail.equals(null));

    MailItem testMail1 = testMail;
    assertEquals(testMail1, testMail);
    MailItem mail;
    Recipient recipient1;
    recipient1 = new Recipient("Harry", "Pott", "h@gmail.com");
    mail = new MailItem(2.0, 2.0, 2.0, recipient1);
    assertFalse(recipient1.equals(mail));

    MailItem testMail3;
    testMail3 =new MailItem(2.0,2.0,1.5,recipient);
    assertFalse(testMail3.equals(testMail) && testMail.equals(testMail3));

    testMail3 =new MailItem (2.0,1.5,2.0,recipient);
    assertFalse(testMail3.equals(testMail) && testMail.equals(testMail3));
    testMail3 =new MailItem (1.5,2.0,2.0,recipient);
    assertFalse(testMail3.equals(testMail) && testMail.equals(testMail3));
    testMail3 =new MailItem (2.0,2.0,2.0,recipient1);
    assertFalse(testMail3.equals(testMail) && testMail.equals(testMail3));


  }

  @Test
  void testHashCode() {
    MailItem testMail3;
    testMail3=new MailItem(2.0,2.0,2.0,recipient);
    assertEquals(testMail3.hashCode(),testMail.hashCode());
  }
}