package problem1;
/**
 * if the course is not found in the CourseCatalog then a
 * CourseNotFoundException will be thrown
 *
 */

public class CourseNotFoundException extends Exception{
  /**
   * if the course is not found in the CourseCatalog then a
   * CourseNotFoundException will be thrown
   * @param message the message of the exception
   */
  public CourseNotFoundException(String message) {
    super(message);
  }
}
