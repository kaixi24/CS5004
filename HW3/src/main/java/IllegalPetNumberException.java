/**
 * if the number of the  pet numbers exceed the limit, then a
 * IllegalPetNumberException will be thrown
 */

public class IllegalPetNumberException extends Exception{

  /**
   * if the number of the pet numbers exceed the limit, then a
   * IllegalPetNumberException will be thrown
   *
   * @param message the message of the exception
   */
  public IllegalPetNumberException(String message) {
    super(message);
  }
}
