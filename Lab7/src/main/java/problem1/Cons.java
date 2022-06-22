package problem1;

import java.util.Objects;

public class Cons implements List{
  private Integer first;
  private List rest;

  public Cons(Integer first, List rest) {
    this.first = first;
    this.rest = rest;
  }

  public Integer getFirst() {
    return this.first;
  }

  public List getRest() {
    return this.rest;
  }

  @Override
  public List remove(Integer element) {
    if (!this.contains(element))
      return this;
    else if (this.first.equals(element))
      return this.rest;
   return new Cons(first,this.rest.remove(element));
  }

  @Override
  public Integer size() {
    return 1+this.getRest().size();
  }

  @Override
  public Boolean isEmpty() {
    return false;
  }

  @Override
  public List add(Integer element) {
    return new Cons(element,this);
  }

  @Override
  public Integer last() throws InvalidCallException {
    if (this.rest.isEmpty())
    return this.first;
    else
      return this.rest.last();
  }

  @Override
  public Boolean contains(Integer element) {
    if (this.first.equals(element))
      return true;
    else if (this.rest.contains(element))
      return true;
    else
      return false;
  }

  @Override
  public Integer elementAt(Integer index) throws IndexOutOfBoundsException {
    if(index<0 || index>=this.rest.size()+1){
      throw new IndexOutOfBoundsException();
    }
    else if (index==0)
      return this.first;
    else
      return this.rest.elementAt(index-1);
  }

  @Override
  public Integer sum() {
    return this.first+this.rest.sum();
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
    return first.equals(cons.first) && rest.equals(cons.rest);
  }

  @Override
  public int hashCode() {
    return Objects.hash(first, rest);
  }

  @Override
  public String toString() {
    return "Cons{" +
        "first=" + first +
        ", rest=" + rest +
        '}';
  }
}
