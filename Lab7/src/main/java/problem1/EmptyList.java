package problem1;

public class EmptyList implements List{

  @Override
  public Integer size() {
    return 0;
  }

  @Override
  public Boolean isEmpty() {
    return true;
  }

  @Override
  public List add(Integer element) {
    return new Cons(element,this);
  }

  @Override
  public Integer last() throws InvalidCallException{
    throw new InvalidCallException("Invalid call last() on empty linked list");
  }

  @Override
  public List remove(Integer element) {
    return this;
  }

  @Override
  public Boolean contains(Integer element) {
    return false;
  }

  @Override
  public Integer elementAt(Integer index) throws IndexOutOfBoundsException {
    throw new IndexOutOfBoundsException();
  }

  @Override
  public Integer sum() {
    return 0;
  }

}
