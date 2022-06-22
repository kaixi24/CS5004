package problem2;

public class Empty implements RecursiveSet {


  @Override
  public RecursiveSet emptySet() {
    return new Empty();
  }

  @Override
  public Boolean isEmpty() {
    return true;
  }

  @Override
  public RecursiveSet add(Integer n) {
    return new Cons(n,this);
  }

  @Override
  public Boolean contains(Integer n) {
    return false;
  }

  @Override
  public RecursiveSet remove(Integer ele) {
    return this;
  }

  @Override
  public Integer size() {
    return 0;
  }
}
