package problem1;
import problem1.FoodItem;

public abstract class NPerishableFoodItem extends FoodItem{
  private final static int MAX_ALLOWED_QUANTITY=250;
  public NPerishableFoodItem(String name, Double current_price_per_unit, Integer available_quantity,
      Integer max_allowed_quantity) {
    super(name, current_price_per_unit, available_quantity, MAX_ALLOWED_QUANTITY);
  }

  @Override
  public boolean equals(Object o) {
    return super.equals(o);
  }

  @Override
  public int hashCode() {
    return super.hashCode();
  }
}
