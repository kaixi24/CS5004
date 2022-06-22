package problem2;

import java.util.Objects;

public class Cons implements RecursiveSet{
private Integer head;
private RecursiveSet rest;

  public Cons(Integer head, RecursiveSet rest) {
    this.head = head;
    this.rest = rest;
  }

  public Integer getHead() {
    return this.head;
  }

  public RecursiveSet getRest() {
    return this.rest;
  }

  @Override
  public RecursiveSet emptySet() {
    return new Empty();
  }

  @Override
  public Boolean isEmpty() {
    return false;
  }

  @Override
  public RecursiveSet add(Integer n) {
    if (this.contains(n))
      return this;
   else
     return new Cons(n, this);
  }

  @Override
  public Boolean contains(Integer n) {
    if(this.head.equals(n)){
      return true;
    }
    else
      return this.rest.contains(n);
  }

  @Override
  public RecursiveSet remove(Integer ele) {
    if (this.contains(ele))
      return this;
    else if (this.head.equals(ele)){
      return this.rest;
    }
    else
      return new Cons(head,this.rest.remove(ele));
  }

  @Override
  public Integer size() {
    return 1+ this.rest.size();
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
    return head.equals(cons.head) && rest.equals(cons.rest);
  }

  @Override
  public int hashCode() {
    return Objects.hash(head, rest);
  }

  @Override
  public String toString() {
    return "Cons{" +
        "head=" + head +
        ", rest=" + rest +
        '}';
  }
}
