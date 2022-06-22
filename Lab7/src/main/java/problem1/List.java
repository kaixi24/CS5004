package problem1;

public interface List {

  Integer size();

  Boolean isEmpty();

  List add(Integer element);

  List remove(Integer element);

  Integer last() throws InvalidCallException;

  Boolean contains(Integer element);

  Integer elementAt(Integer index) throws IndexOutOfBoundsException;

  Integer sum();

}
