package problem1;

import java.util.Arrays;
import java.util.Objects;
/**
 * class CourseCatalog implements interface of ICourseCatalog
 * it contains information about count (how many elements inside), an array to store the information
 * and a constant number of 10 as the array size
 * */
public class CourseCatalog implements ICourseCatalog{
  private static final int SIZE=10;
  protected int count;
  private Course []courseArray;

  /**
   * Constructs a new CourseCatalog, based upon the provided input parameters.
   * initialize an array of fixed size of 10,
   * count is initialized to be 0;
   */
  public CourseCatalog() {
    this.count = 0;
    this.courseArray = new Course[SIZE];
  }

  /**
   * add in a course inside the CourseCatalog
   * @override the append method from interface
   * @param course
   */

  @Override
  public void append(Course course) {
    if (this.count<this.courseArray.length){
      this.courseArray[this.count]=course;
      this.count++;
    }
    else {
      Course[]course1= courseArray; //resize the array
      courseArray=new Course[courseArray.length];
      for (int i=0; i<courseArray.length; i++) {
        courseArray[i] = course1[i];
      }
      this.count=courseArray.length-1;
      this.courseArray[this.count] = course;
      this.count++;
    }
  }

  /**
   * remove a course from the CourseCatalog
   * @override the remove method from interface
   * @param course, to be removed
   * @throws CourseNotFoundException if the course is not inside the CourseCatalog
   */

  @Override
  public void remove(Course course) throws CourseNotFoundException {
    if (this.contains(course)){
      for (int i=0; i< this.courseArray.length; i++){
        if (course.equals(courseArray[i])){
          this.count--;
          for (int j=i;j<this.courseArray.length-1;j++)
            this.courseArray[j]=this.courseArray[j+1];
          break;
        }
      }
    }
   else
     throw new CourseNotFoundException("The course is not inside");
  }

  /**
   * check whether a course inside the CourseCatalog
   * @override the contains method from interface
   * @param course
   * @return bool true or false to see whether inside or not
   */

  @Override
  public boolean contains(Course course) {
    for (int i=0; i<this. courseArray.length; i++){
      if (course.equals(courseArray[i]))
        return true;
    }
    return false;
  }
  /**
   * check the index of the course in the catalog
   * @override the indexOf method from interface
   * @param course
   * @return the index number
   */

  @Override
  public int indexOf(Course course) {
    for (int i=0; i< courseArray.length; i++){
      if (course.equals(courseArray[i])){
        return i;
      }
    }
    return -1;
  }
  /**
   * check the number of courses inside the CourseCatalog
   * @override the count method from interface
   * @return the count number
   */
  @Override
  public int count() {
    return count;
  }
  /**
   * Returns the Course at the given index in the CourseCatalog.
   * @throws InvalidIndexException if the index doesn’t exist.
   * @override the get method from interface
   * @return Course
   */
  @Override
  public Course get(int index) throws InvalidIndexException {
    if (count>=index){
      return courseArray[index];
    }
    else
      throw new InvalidIndexException("The index does not exist");
  }

  /**
   * Checks if the CourseCatalog is empty.
   * @return boolean true or false to see whether is empty or not
   */

  @Override
  public boolean isEmpty() {
    if (count==0) return true;
    else return false;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CourseCatalog that = (CourseCatalog) o;
    return count == that.count && Arrays.equals(courseArray, that.courseArray);
  }

  @Override
  public int hashCode() {
    int result = Objects.hash(count);
    result = 31 * result + Arrays.hashCode(courseArray);
    return result;
  }

  @Override
  public String toString() {
    return "CourseCatalog{" +
        "count=" + count +
        ", courseArray=" + Arrays.toString(courseArray) +
        '}';
  }

}
