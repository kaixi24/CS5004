/**
 * Class WindowCleaning is inherited from Exterior class,
 */

public class WindowCleaning extends Exterior {

  private Integer floorNumber;
  private Double RATE_GREATERWITHONEFLOOR = 1.05;
  private Integer ONE_FLOOR_NUMBER = 1;
  private static final Integer THREE_FLOOR_NUMBER = 3;

  /**
   * Constructs a new Interior class, based upon the provided input parameters.
   * @param propertyAddress - Property address;
   * @param monthlyService - A boolean that indicates whether or not the service is carried out monthly.
   * @param numberServices - The number of services previously carried out at the address
   * @param size -Property size
   * @param floorNumber number of the floors
   */
  public WindowCleaning(String propertyAddress, boolean monthlyService,
      Integer numberServices, Size size, Integer floorNumber) throws IllegalFloorNumberException {
    super(propertyAddress, monthlyService, numberServices, size);
    this.validateFloorNumber(floorNumber);
  }
  /**
   * A method to validate the floor number
   */
  private void validateFloorNumber(Integer floorNumber) throws IllegalFloorNumberException {
    if (floorNumber <= THREE_FLOOR_NUMBER && floorNumber > 0) {
      this.floorNumber = floorNumber;
    } else
      throw new IllegalFloorNumberException("Error, wrong floor information");
  }
  /**
   * Returns the floor number
   * */

  public Integer getFloorNumber() {
    return floorNumber;
  }

  /**
   * This is a setter method for setting the floorNumber
   * @param floorNumber
   */

  public void setFloorNumber(Integer floorNumber) throws IllegalFloorNumberException {
    this.validateFloorNumber(floorNumber);
  }
  /**
   * @override calculateprice(), calculate the price for the Window Cleaning services
   */
  @Override
  public double calculatePrice() {
    double money;
    if (floorNumber > ONE_FLOOR_NUMBER) {
      money = this.getMoney() * RATE_GREATERWITHONEFLOOR * this.discount();
      return Math.round(money * 100.0) / 100.0;
    } else {
      money = this.getMoney() * this.discount();
      return Math.round(money * 100.0) / 100.0;
    }
  }
}
