package problem1;
import problem1.PerishableFoodItem;

public class Meat extends PerishableFoodItem{

  public Meat(String name, Double current_price_per_unit,
      Integer available_quantity, Integer max_allowed_quantity, OrderDate d1,
      ExpirationDate d2) {
    super(name, current_price_per_unit, available_quantity, max_allowed_quantity, d1, d2);
  }
}
