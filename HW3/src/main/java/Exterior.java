/**
 * Class Exterior is inherited from System class,
 */

public abstract class Exterior extends System{
  protected static final Integer RATE=80;
  protected static final Integer HOUR_SMALL=1;
  protected static final Integer HOUR_MEDIUM=2;
  protected static final Integer HOUR_LARGE=4;

  /**
   * Constructs a new ElectricalSpe class, based upon the provided input parameters.
   * @param propertyAddress - Property address;
   * @param monthlyService - A boolean that indicates whether or not the service is carried out monthly.
   * @param numberServices - The number of services previously carried out at the address
   * @param size -Property size
   */
  public Exterior(String propertyAddress, boolean monthlyService, Integer numberServices,
      Size size) {
    super(propertyAddress, monthlyService, numberServices, size);
  }
  /**
   * a method getMoney() to calculate the money needed for small/medium/large properties
   */
  public Integer getMoney() {
    if (size==Size.small)
      return RATE*HOUR_SMALL;
    else if (size==Size.medium)
      return RATE*HOUR_MEDIUM;
    else
      return RATE*HOUR_LARGE;
  }

}
