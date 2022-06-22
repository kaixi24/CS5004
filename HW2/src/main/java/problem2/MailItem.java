package problem2;

import java.util.Objects;
import problem1.IllegalArgument;

/**
 * Class Recipient contains information about width, height, depth and a recipient.
 * */
public class MailItem {
  protected double width;
  protected double height;
  protected double depth;
  protected Recipient recipient;
  protected static final int DIMENSION_REQUIREMENT = 1;
  /**
   * Constructs a new MailItem, based upon all of the provided input parameters.
   * @param width - A width in inches, an integer greater than or equal to 1
   * @param height- A height in inches, an integer greater than or equal to 1.
   * @param depth - A depth in inches, an integer greater than or equal to 1.
   * @param recipient
   */
  public MailItem(double width, double height, double depth, Recipient recipient) {
    this.width = width;
    this.height = height;
    this.depth = depth;
    this.recipient = recipient;
  }
  /**
   * @return  MailItem's width
   * */
  public double getWidth() {
    return width;
  }

  /**
   * This is a setter method for setting the MailItem's width
   * @param width
   * throw exception when the width of the mail is above the requirement
   */

  public void setWidth(double width) throws IllegalInput {
    if (width >= DIMENSION_REQUIREMENT)
      this.width = width;
    else
      throw new IllegalInput("Error");
  }
  /**
   * @return  MailItem's height
   * */
  public double getHeight() {
    return height;
  }

  /**
   * This is a setter method for setting the MailItem's height
   * @param height
   * throw exception when the height of the mail is above the requirement
   */
  public void setHeight(double height) throws IllegalInput {
    if (height >= DIMENSION_REQUIREMENT)
      this.height = height;
    else
      throw new IllegalInput("Error");
  }

  /**
   * @return  MailItem's depth
   * */

  public double getDepth() {
    return depth;
  }

  /**
   * This is a setter method for setting the MailItem's depth
   * @param depth
   * throw exception when the depth of the mail is above the requirement
   */
  public void setDepth(double depth) throws IllegalInput {
    if (depth >= DIMENSION_REQUIREMENT)
      this.depth = depth;
    else
      throw new IllegalInput("Error");
  }
  /**
   * @return  MailItem's recipient
   * */
  public Recipient getRecipient() {
    return recipient;
  }

  /**
   * This is a setter method for setting the MailItem's Recipient
   * @param recipient
   */

  public void setRecipient(Recipient recipient) {
    this.recipient = recipient;
  }

  /**
   * Override Equals
   * */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MailItem mailItem = (MailItem) o;
    return Double.compare(mailItem.width, width) == 0
        && Double.compare(mailItem.height, height) == 0
        && Double.compare(mailItem.depth, depth) == 0 && recipient.equals(
        mailItem.recipient);
  }

  /**
   * override hashcode
   * */

  @Override
  public int hashCode() {
    return Objects.hash(width, height, depth, recipient);
  }
}



