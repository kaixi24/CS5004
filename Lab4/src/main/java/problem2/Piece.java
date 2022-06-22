package problem2;

import java.util.Objects;

public abstract class Piece {
  private String firstName;
  private String lastName;
  private int age;
  final int MAX_AGE=128;

  public Piece(String firstName, String lastName, int age) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Piece piece = (Piece) o;
    return age == piece.age && MAX_AGE == piece.MAX_AGE && firstName.equals(piece.firstName)
        && lastName.equals(piece.lastName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, lastName, age, MAX_AGE);
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) throws IncorrectAge {
    if (age>MAX_AGE||age<0) throw new IncorrectAge("Error, wrong input");
    else this.age = age;
  }
}
