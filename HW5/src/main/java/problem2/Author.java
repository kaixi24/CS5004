package problem2;

/**
 *  Class Author is inherited from Person class,
 *  it contains the name information
 */
public class Author extends Person{

  /**
   * Constructs a new Author class, based upon the provided input parameters.
   * @param name name of the author
   */
  public Author(Name name) {
    super(name);
  }

  /**
   * @param artist artist whether the same or not
   * @return whether the artist is the same.
   */

  @Override
  protected boolean isSameRecordingArtist(RecordingArtist artist) {
    return false;
  }
}
