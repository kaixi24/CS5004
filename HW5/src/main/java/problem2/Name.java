package problem2;

import java.util.Objects;

/**
 *  Class Name
 *  it contains the information of firstName, lastName
 */
public class Name {
  private String firstName;
  private String lastName;

  /**
   * Name constructor
   * @param firstName firstname of the Name
   * @param lastName last name of the Name
   */
  public Name(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
  }

  /**
   * getFirstName
   * @return firstname
   */
  public String getFirstName() {
    return this.firstName;
  }

  /**
   * set first name
   * @param firstName firstName of the name
   */
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  /**
   * get last name
   * @return lastName last Name of the name
   */
  public String getLastName() {
    return this.lastName;
  }

  /**
   * set the last name
   * @param lastName lastName of the name
   */
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  @Override
  public String toString() {
    return "Name{" +
        "firstName='" + firstName + '\'' +
        ", lastName='" + lastName + '\'' +
        '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Name name = (Name) o;
    return firstName.equals(name.firstName) && lastName.equals(name.lastName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, lastName);
  }

}
