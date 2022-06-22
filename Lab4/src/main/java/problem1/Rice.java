package problem1;
import problem1.NPerishableFoodItem;

public class Rice extends NPerishableFoodItem {

  public Rice(String name, Double current_price_per_unit,
      Integer available_quantity, Integer max_allowed_quantity) {
    super(name, current_price_per_unit, available_quantity, max_allowed_quantity);
  }
}
