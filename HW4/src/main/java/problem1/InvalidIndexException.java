package problem1;
/**
 * Returns the Course at the given index in the CourseCatalog.
 * Throws an InvalidIndexException if the index doesn’t exist.
 * InvalidIndexException will be thrown
 *
 */
public class InvalidIndexException extends Exception{
  /**
   * Returns the Course at the given index in the CourseCatalog.
   * Throws an InvalidIndexException if the index doesn’t exist.
   * InvalidIndexException will be thrown
   * @param message the message of the exception
   */
  public InvalidIndexException(String message) {
    super(message);
  }
}
