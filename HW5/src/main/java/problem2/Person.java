package problem2;

import java.util.Objects;

/**
 * class Person is inheritaed from class Creator
 * which contains information of name
 */
public abstract class Person extends Creator {
  Name name;

  /**
   * Person constructor
   * @param name name of the person
   */
  public Person(Name name) {
    this.name = name;
  }

  /**
   * get name
   * @return name name of the person
   */
  public Name getName() {
    return this.name;
  }

  /**
   * set name name of the person
   * @param name name of the Name
   */
  public void setName(Name name) {
    this.name = name;
  }

  /**
   * abstract method isSameRecordingArtist
   * @param artist check the artist
   * @return whether is the same recordingArtist
   */
  protected abstract boolean isSameRecordingArtist(RecordingArtist artist);

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Person person = (Person) o;
    return name.equals(person.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name);
  }

  @Override
  public String toString() {
    return "Person{" +
        "name=" + name +
        '}';
  }
}
