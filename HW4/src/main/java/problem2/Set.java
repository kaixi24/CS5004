package problem2;

import java.sql.Array;
import java.util.Arrays;
import java.util.Objects;
import javax.swing.TransferHandler;
import problem1.Course;
import problem1.CourseNotFoundException;

/**
 * class Set implements interface of ISet
 * it contains information about count (how many elements inside), an array to store the information
 * and a constant number of 10 as the array size
 * */
public final class Set implements ISet{
  private static final Integer SIZE=10;
  private Integer count;
  private Integer []arr;

  /**
   * Constructs a new Set, based upon the provided input parameters.
   * initialize an array of fixed size of 10,
   * count is initialized to be 0;
   */
  public Set() {
    this.arr = new Integer [SIZE];
    count=0;
  }

  /**
   *@override Create an empty set
   * @return an empty set
   */

  @Override
  public Set emptySet() {
    return new Set();
  }

  /**
   *@override check whether a set is empty or not
   * @return  true if the Set contains no items, false otherwise.
   */

  @Override
  public boolean isEmpty() {
    if (count.equals(0))
      return true;
    else return false;
  }
  /**
   *@override  add an integer n into a set if and only if that Integer is
   * not already in the Set.
   * @return a set
   */

  @Override
  public Set add(Integer n) {
    Set set = emptySet();//create an empty set
    if (this.contains(n))
      return this;
    else {
      if (this.count < this.arr.length) { //when the set still has room to store
        for (int i = 0; i < this.arr.length; i++) {
          set.arr[i] = this.arr[i];
        }
        set.count=this.count;
        set.arr[count] = n;
        set.count++;
      } else {//the set is full
        for (int i = 0; i < this.arr.length; i++) { //copy the array
          set.arr[i] = this.arr[i];
        }
        set.count=this.count; //copy the count
        Integer [] arr1= set.arr; //resize the array
        set.arr=new Integer[arr.length*2];
        for (Integer i=0; i<arr.length; i++) {
          set.arr[i] = arr1[i];
        }
        set.arr[count] = n;
        set.count++;
      }
      return set;
    }
  }

  /**
   *@override  check whether an integer is inside in the set
   * @return Returns true if the given Integer is in the Set, false
   * otherwise.
   */

  @Override
  public boolean contains(Integer n) {
    for (int i=0; i<this.arr.length; i++) {
      if (this.arr[i]==n)
        return true;
    }
    return false;
  }

  /**
   *@override  remove an integer
   * @return Returns a copy of the Set with the given Integer removed.
   * If the given Integer is not in the Set, returns the Set as is.
   * otherwise.
   */

  @Override
  public Set remove(Integer n) {
    Set set = emptySet();
    if (this.contains(n)){
      for (int i = 0; i < this.arr.length; i++) {
        set.arr[i] = this.arr[i];
      }
      set.count=this.count;
      for (int i = 0; i < this.arr.length; i++) {
        if (n==set.arr[i]) {
          set.count--;
          for (int j = i; j < set.arr.length-1; j++)
            set.arr[j] = set.arr[j + 1];
          break;
        }
      }
    }
    else { //when the element is not inside the set, just return the orginal set
      for (int i = 0; i < this.arr.length; i++) {
        set.arr[i] = this.arr[i];
      }
    }
    return set;
  }

  /**
   *@override  Gets the number of items in the Set.
   * @return the size of the set
   */
  @Override
  public Integer size() {
    return this.count;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Set set = (Set) o;
    return count == set.count && Arrays.equals(arr, set.arr);
  }

  @Override
  public int hashCode() {
    int result = Objects.hash(count);
    result = 31 * result + Arrays.hashCode(arr);
    return result;
  }

}
