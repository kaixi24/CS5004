package problem3;

import java.util.Objects;
import problem1.List;

public class Cons implements ListofList{
  private List headList;
  private ListofList rest;

  public Cons(List headlist, ListofList rest) {
    this.headList = headlist;
    this.rest = rest;
  }

  public List getHeadList() {
    return this.headList;
  }

  public ListofList getRest() {
    return this.rest;
  }


  @Override
  public Integer size() {
    return 1+this.rest.size();
  }

  @Override
  public Integer length() {
    return this.headList.size()+this.rest.size();
  }

  @Override
  public Integer sum() {
    return this.headList.sum()+this.rest.sum();
  }

  @Override
  public Boolean isEmpty() {
    return false;
  }

  @Override
  public ListofList add(List listToAdd) {
    return new Cons(listToAdd,this);
  }

  @Override
  public ListofList removeInteger(int intToRemove) {
    Integer sizeFirst=this.headList.size();
    List afterRemove=this.headList.remove(intToRemove);
    if(!sizeFirst.equals(afterRemove.size())){
      return new Cons(afterRemove,this.rest);
      }
    return new Cons(headList,this.rest.removeInteger(intToRemove)) ;
    }

  @Override
  public ListofList removeAllInteger(int intToRemove) {
    return new Cons(this.headList.remove(intToRemove),this.rest.removeAllInteger(intToRemove));
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Cons cons = (Cons) o;
    return headList.equals(cons.headList) && rest.equals(cons.rest);
  }

  @Override
  public int hashCode() {
    return Objects.hash(headList, rest);
  }

  @Override
  public String toString() {
    return "Cons{" +
        "headlist=" + headList +
        ", rest=" + rest +
        '}';
  }
}
