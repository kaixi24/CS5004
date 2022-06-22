/**
 * if the number of the floor numbers exceed the limit, then a
 * IllegalFloorNumber will be thrown
 *
 */

public class IllegalFloorNumberException extends Exception{

  /**
   * if the number of the floor numbers exceed the limit, then a
   * IllegalFloorNumber will be thrown
   *
   * @param message the message of the exception
   */
  public IllegalFloorNumberException(String message) {
    super(message);
  }
}
