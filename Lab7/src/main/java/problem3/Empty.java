package problem3;

import problem1.List;

public class Empty implements ListofList{

  @Override
  public Integer size() {
    return 0;
  }

  @Override
  public Integer length() {
    return 0;
  }

  @Override
  public Integer sum() {
    return 0;
  }

  @Override
  public Boolean isEmpty() {
    return true;
  }

  @Override
  public ListofList add(List listToAdd) {
    return new Cons(listToAdd,this);
  }

  @Override
  public ListofList removeInteger(int intToRemove) {
    return this;
  }

  @Override
  public ListofList removeAllInteger(int intToRemove) {
    return this;
  }
}
