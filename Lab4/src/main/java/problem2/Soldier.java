package problem2;

import java.util.Objects;

public abstract  class Soldier extends Piece{
  final double MAX_STAMINA_NUMBER=100;
  Double stamina;

  public Soldier(String firstName, String lastName, int age, Double stamina) {
    super(firstName, lastName, age);
    this.stamina = stamina;
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
    Soldier soldier = (Soldier) o;
    return Double.compare(soldier.MAX_STAMINA_NUMBER, MAX_STAMINA_NUMBER) == 0
        && stamina.equals(soldier.stamina);
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), MAX_STAMINA_NUMBER, stamina);
  }

  public Double getStamina() {
    return stamina;
  }

  public void setStamina(double stamina) throws IncorrectInput {
    if (stamina>MAX_STAMINA_NUMBER || stamina<0) {
      throw new IncorrectInput("Wrong input");
    }
    else {
      this.stamina = stamina;
    }
  }

  public double increase_stamina(double amount){
    if (getStamina()+amount>MAX_STAMINA_NUMBER)
      return MAX_STAMINA_NUMBER;
    else
      return getStamina()+amount;
  }

  public double decrease_stamina(double amount) throws IncorrectStamina {
    if (getStamina()-amount<0)
      throw new IncorrectStamina("Error, you don't have enough stamina");
    else
      return getStamina()-amount;
  }

}
