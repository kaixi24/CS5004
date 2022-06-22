package problem1;
/**
 * An Interface called ICourseCatalog
 */
public interface ICourseCatalog {

  /**
   * append a course
   * @param course
   */

  void append(Course course);

  /**
   * Removes a specified Course from the CourseCatalog.
   * @throws CourseNotFoundException if the Course doesn’t exist.
   * @param course
   * If the CourseCatalog contains multiple instances of the same Course,
   * the instance with the lowest index is removed.
   * The CourseCatalog should not have any empty slots/nodes (from the public perspective)
   * after a Course is removed.
   * For example, if the CourseCatalog contains 5 items and the Course at index 0 is removed,
   * then the indices of the remaining Courses should be shifted down by 1—the Course that was at index 1
   * should be moved to index 0 and the index of the last Course in the catalog should be 3.
   */

  void remove(Course course) throws CourseNotFoundException;

  /**
   * Checks if the specified course exists in the CourseCatalog.
   * @param course
   * @return bool true or false
   */
  boolean contains(Course course);

  /**
   * Returns the index of the specified Course in the CourseCatalog,
   * if it exists. If the Course doesn’t exist, returns -1.
   * @param course
   * @return an int index
   */

  int indexOf(Course course);

  /**
   * Gets the number of Courses in the CourseCatalog.
   * @return the count
   */

  int count();
  /**
   *   Returns the Course at the given index in the CourseCatalog.
   *   @throws InvalidIndexException if the index doesn’t exist.
   * @param index
   * @return the course
   */

  Course get(int index) throws InvalidIndexException;

  /**
   *   Checks if the Course Catalog is empty.
   * @return boolean true of false
   */

  boolean isEmpty();

}
