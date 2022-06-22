package problem1;

import java.util.Objects;
/**
 * FoodItem is a simple object that has a name, current Price per unit, available quantity,max allowed quantity
 */

public abstract class FoodItem {
  private String name;
  private Double current_price_per_unit;
  private Integer available_quantity;
  private Integer max_allowed_quantity;

  /**
   * Constructor that creates a new Owner object with the specified name, current_price_per unit,available_quantity,max_allowed_quantity
   *
   * @param name - name of the  object.
   * @param current_price_per_unit - current price per unit of the FoodItem object.
   * @param available_quantity - phone number of the FoodItem object.
   * @param max_allowed_quantity - max allowed quantity
   */
  public FoodItem(String name, Double current_price_per_unit, Integer available_quantity,
      Integer max_allowed_quantity) {
    this.name = name;
    this.current_price_per_unit = current_price_per_unit;
    this.available_quantity = available_quantity;
    this.max_allowed_quantity = max_allowed_quantity;
  }

  /**
   * Returns the name of the FoodItem. * @return the name of the FoodItem.
   */

  public String getName() {
    return name;
  }

  /**
   * set the name of the FoodItem.
   */

  public void setName(String name) {
    this.name = name;
  }

  /**
   * Returns the current price per unit of the FoodItem * @return the current_price_per_unit of the FoodItem object.
   */

  public Double getCurrent_price_per_unit() {
    return current_price_per_unit;
  }
  /**
   * set the Current_price_per_unit of the FoodItem.
   */
  public void setCurrent_price_per_unit(Double current_price_per_unit) {
    this.current_price_per_unit = current_price_per_unit;
  }

  /**
   * Returns the available quantity of the FoodItem. * @return the available_quantity of the FoodItem object.
   */

  public Integer getAvailable_quantity() {
    return available_quantity;
  }
  /**
   * set the available_quantity of the FoodItem.
   */
  public void setAvailable_quantity(Integer available_quantity) {
    this.available_quantity = available_quantity;
  }
  /**
   * Returns the max_allowed_quantity of the FoodItem object * @return the max_allowed_quantity of the FoodItem object.
   */

  public Integer getMax_allowed_quantity() {
    return max_allowed_quantity;
  }

  /**
   * set the max_allowed_quantity of the FoodItem.
   */
  public void setMax_allowed_quantity(Integer max_allowed_quantity) {
    this.max_allowed_quantity = max_allowed_quantity;
  }
  /**
   * override the Equal
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FoodItem foodItem = (FoodItem) o;
    return name.equals(foodItem.name) && current_price_per_unit.equals(
        foodItem.current_price_per_unit) && available_quantity.equals(foodItem.available_quantity)
        && max_allowed_quantity.equals(foodItem.max_allowed_quantity);
  }
  /**
   * override the hashcode
   */
  @Override
  public int hashCode() {
    return Objects.hash(name, current_price_per_unit, available_quantity, max_allowed_quantity);
  }
}




