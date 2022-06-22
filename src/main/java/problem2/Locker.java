package problem2;

import java.util.Objects;
import problem1.IllegalBooking;

/**
 * Class Locker contains information about max Width, max Height, max Depth and a MailItem
 * */
public class Locker {
  protected double maxWidth;
  protected double maxHeight;
  protected double maxDepth;
  protected MailItem mail1;
  /**
   * Constructs a new Locker, based upon the provided input parameters.
   * @param maxWidth - A maximum width in inches, an integer greater than or equal to 1.
   * @param maxHeight- A maximum height in inches, an integer greater than or equal to 1.
   * @param maxDepth - A maximum depth in inches, an integer greater than or equal to 1.
   */
  public Locker(double maxWidth, double maxHeight, double maxDepth) {
    this.maxWidth = maxWidth;
    this.maxHeight = maxHeight;
    this.maxDepth = maxDepth;
  }
  /**
   * @return  Locker's max width
   * */
  public double getMaxWidth() {
    return maxWidth;
  }

  /**
   * This is a setter method for setting the Locker's max width
   * @param maxWidth
   */

  public void setMaxWidth(double maxWidth) {
    this.maxWidth = maxWidth;
  }

  /**
   * @return  Locker's max height
   * */
  public double getMaxHeight() {
    return maxHeight;
  }

  /**
   * This is a setter method for setting the Locker's max height
   * @param maxHeight
   */
  public void setMaxHeight(double maxHeight) {
    this.maxHeight = maxHeight;
  }

  /**
   * @return  Locker's max depth
   * */
  public double getMaxDepth() {
    return maxDepth;
  }

  /**
   * This is a setter method for setting the Locker's max depth
   * @param maxDepth
   */
  public void setMaxDepth(double maxDepth) {
    this.maxDepth = maxDepth;
  }

  /**
   * @return  Locker's mail
   * */

  public MailItem getMail() {
    return mail1;
  }

  /**
   * This is a setter method for setting the Locker's mail
   * @param mail
   */
  public void setMail(MailItem mail) {
    this.mail1 = mail;
  }

  /**
   * This is a method for setting the Locker's mail, a void method, addMail, that consumes a mail item and stores it in a locker
   * with two exceptions: if the locker is occupied (it already contains a mail item) or the mail item exceeds the dimensions of the locker
   * (any single dimension of the mail item is bigger than the locker), the mail item should not be added to the locker.
   * @param mail
   */
  MailItem addMail(MailItem mail) throws IllegalAddMail{
    if (mail1!=null || mail.getDepth()>getMaxDepth() || mail.getWidth()>getMaxWidth() || mail.getHeight()>getMaxHeight()){
      throw new IllegalAddMail("Adding error");
    }
    else {
      mail1=mail;
      return mail;
    }
  }
/**
 * This is a method for setting the Locker's mail, a void method, pickupMail, that takes one parameter, a recipient.
 * This method will remove and return the mail item from the locker under the following conditions:
 * there is a mail item in the locker AND the recipient passed to pickupMail matches the recipient of the mail item.
 */
  void pickupMail (Recipient name) throws IllegalWithdrawMail {
    if (mail1!=null && mail1.getRecipient()==name){
      mail1=null;
    }
    else
      throw new IllegalWithdrawMail("Unsuccessful withdraw");
  }

  /**
   * Override Equals
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Locker locker = (Locker) o;
    return Double.compare(locker.maxWidth, maxWidth) == 0
        && Double.compare(locker.maxHeight, maxHeight) == 0
        && Double.compare(locker.maxDepth, maxDepth) == 0 && mail1.equals(locker.mail1);
  }
  /**
   * Override hashcode
   */
  @Override
  public int hashCode() {
    return Objects.hash(maxWidth, maxHeight, maxDepth, mail1);
  }
}
