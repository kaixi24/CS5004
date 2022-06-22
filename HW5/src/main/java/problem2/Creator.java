package problem2;

/**
 * abstract class Creator
 */
public abstract class Creator {

  /**
   * Abstract boolean method,
   * @param artist to check whether the artist is the same
   * @return whether the is the same recording artist
   */
  protected abstract boolean isSameRecordingArtist(RecordingArtist artist);
}
