package problem2;

import java.util.Objects;
import problem2.Piece;

public abstract class Civilian extends Piece{
  int wealth;

  public Civilian(String firstName, String lastName, int age, int wealth) {
    super(firstName, lastName, age);
    this.wealth = wealth;
  }


  public int getWealth() {
    return wealth;
  }

  public void setWealth(int wealth) throws IncorrectInput {
    if (wealth>0) this.wealth = wealth;
    else
      throw new IncorrectInput("Wrong input");
  }

  public int increase_wealth(int amount) {
    return getWealth()+amount;
  }

  public int decrease_wealth(int amount) throws IncorrectDecreaseWealth {
      if (getWealth()-amount>0)
        return getWealth()-amount;
      else
        throw new IncorrectDecreaseWealth("Error, you don't have enough money");
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    Civilian civilian = (Civilian) o;
    return wealth == civilian.wealth;
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), wealth);
  }
}

