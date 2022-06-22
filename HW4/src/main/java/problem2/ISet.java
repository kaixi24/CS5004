package problem2;

/**
 * A Set interface creation
 */

public interface ISet {
  /**
   * create an empty set
   * @return an empty set
   */
  Set emptySet();

  /**
   * check a set whether is empty or not
   * @return true or false
   */

  boolean isEmpty();

  /**
   * add an integer inside a set
   * @param n the integer to be added
   * @return a set
   */

  Set add(Integer n);
  /**
   * check whether a set contains an integer n or not
   * @param n the integer to be checked whether inside the set
   * @return true or false
   */

  boolean contains(Integer n);
  /**
   * remove an integer inside a set
   * @param n the integer to be removed
   * @return a set
   */
  Set remove(Integer n);

  /**
   * check the size of a set
   * @return the size of the set
   */

  Integer size();

}
