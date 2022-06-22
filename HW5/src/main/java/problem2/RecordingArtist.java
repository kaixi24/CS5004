package problem2;

/**
 * class RecordingArtist is inherited from class Person
 * which contains information of name
 */
public class RecordingArtist extends Person{

  /**
   * Constructor which contains the information of name
   * @param name name of the RecordingArtist
   */
  public RecordingArtist(Name name) {
    super(name);
  }

  @Override
  public String toString() {
    return "RecordingArtist{}";
  }

  @Override
  protected boolean isSameRecordingArtist(RecordingArtist artist){
    return this.equals(artist);
  }
}
