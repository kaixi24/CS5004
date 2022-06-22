package problem1;

import java.util.Objects;
import problem1.FoodItem;

public abstract class PerishableFoodItem extends FoodItem {
  private OrderDate d1;
  private ExpirationDate d2;
  private static final int MAX_ALLOWED_QUANT=100;

  public PerishableFoodItem(String name, Double current_price_per_unit,
      Integer available_quantity, Integer max_allowed_quantity, OrderDate d1,
      ExpirationDate d2) {
    super(name, current_price_per_unit, available_quantity, MAX_ALLOWED_QUANT);
    this.d1 = d1;
    this.d2 = d2;
  }

  public OrderDate getD1() {
    return d1;
  }

  public void setD1(OrderDate d1) {
    this.d1 = d1;
  }

  public ExpirationDate getD2() {
    return d2;
  }

  public void setD2(ExpirationDate d2) {
    this.d2 = d2;
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
    PerishableFoodItem that = (PerishableFoodItem) o;
    return d1.equals(that.d1) && d2.equals(that.d2);
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), d1, d2);
  }


}
