package problem2;

import java.util.Objects;

/**
 * Class Recipient contains information about firstName, lastName and emailAddress.
 * */

public class Recipient {

  protected String firstName;
  protected String lastName;
  protected String emailAddress;
  /**
   * Constructs a new Recipient, based upon all of the provided input parameters.
   * @param firstName - Recipient's firstName,
   * @param lastName - Recipient's lastname,
   * @param emailAddress - Recipient's emailAddress,
   */
  public Recipient(String firstName, String lastName, String emailAddress) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.emailAddress = emailAddress;
  }

  /**
   * @return Recipient's firstname
   * */

  public String getFirstName() {
    return firstName;
  }

  /**
   * @return Recipient's lastname
   * */

  public String getLastName() {
    return lastName;
  }

  /**
   * @return Recipient's email address
   * */

  public String getEmailAddress() {
    return emailAddress;
  }

  /**
   * This is a setter method for setting the Recipient's firstname
   * @param firstName
   */

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  /**
   * This is a setter method for setting the Recipient's lastname
   * @param lastName
   */

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  /**
   * This is a setter method for setting the Recipient's email address
   * @param emailAddress
   */

  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }

  /**
     * Override the equals
   */

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Recipient recipient = (Recipient) o;
    return firstName.equals(recipient.firstName) && lastName.equals(recipient.lastName)
        && emailAddress.equals(recipient.emailAddress);
  }

  /**
   * Override the hashcode
   */

  @Override
  public int hashCode() {
    return Objects.hash(firstName, lastName, emailAddress);
  }

}
