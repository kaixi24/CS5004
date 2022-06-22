
/**
 * Class Gardening is inherited from Exterior class,
 */
public class Gardening extends Exterior {
  private static final Integer WASTE_REMOVAL_FEE=20;

  /**
   * Constructs a new ElectricalSpe class, based upon the provided input parameters.
   * @param propertyAddress - Property address;
   * @param monthlyService - A boolean that indicates whether or not the service is carried out monthly.
   * @param numberServices - The number of services previously carried out at the address
   * @param size -Property size
   */
  public Gardening(String propertyAddress, boolean monthlyService, Integer numberServices,
      Size size) {
    super(propertyAddress, monthlyService, numberServices, size);
  }

  /**
   * @override calculateprice(), calculate the price for the Gardening service
   */
  @Override
  public double calculatePrice() {
    return (this.getMoney()+WASTE_REMOVAL_FEE)*this.discount();
  }
}

