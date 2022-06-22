import java.util.Objects;

/**
 * class System implements interface of ISystem
 * it contains information about property Address, number of Services,
 * whether its monthly services and the size of the property
 * */

public abstract class System implements ISystem{
  private String propertyAddress;
  private boolean monthlyService;
  private Integer numberServices;
  protected Size size;
  private static final double HALF_DISCOUNT=0.5;
  private static final double noDiscount=1.0;
  private static final double DISCOUNT=0.9;

  /**
   * Constructs a new System, based upon the provided input parameters.
   * @param propertyAddress - Property address;
   * @param monthlyService - A boolean that indicates whether or not the service is carried out monthly.
   * @param numberServices - The number of services previously carried out at the address
   * @param size -Property size
   */
  public System(String propertyAddress, boolean monthlyService, Integer numberServices, Size size) {
    this.propertyAddress = propertyAddress;
    this.monthlyService = monthlyService;
    this.numberServices = numberServices;
    this.size = size;
  }
  /**
   * Returns System's number of services
   * */

  public Integer getNumberServices() {
    return numberServices;
  }

  /**
   * This is a setter method for setting the number of the services
   * @param numberServices
   */
  public void setNumberServices(Integer numberServices) {
    this.numberServices = numberServices;
  }
  /**
   * Returns System's Size of the property
   * */
  public Size getSize() {
    return size;
  }

  /**
   * This is a setter method for setting the size of the property
   * @param size
   */

  public void setSize(Size size) {
    this.size = size;
  }
  /**
   * Returns System's Property Address
   * */
  public String getPropertyAddress() {
    return propertyAddress;
  }

  /**
   * This is a setter method for setting the property Address
   * @param propertyAddress
   */

  public void setPropertyAddress(String propertyAddress) {
    this.propertyAddress = propertyAddress;
  }

  /**
   * Returns System's whether or not the service is carried out monthly
   * */
  public boolean isMonthlyService() {
    return monthlyService;
  }

  /**
   * This is a setter method for setting the whether it is a monthly service
   * @param monthlyService
   */
  public void setMonthlyService(boolean monthlyService) {
    this.monthlyService = monthlyService;
  }

  /**
   * This is a method to calculate how much discount the property can receive for the service
   */
  public double discount(){
    if ((this.numberServices+1)%10==0)
      return HALF_DISCOUNT;
    else if (isMonthlyService())
      return DISCOUNT;
    else
      return noDiscount;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    System system = (System) o;
    return monthlyService == system.monthlyService && propertyAddress.equals(system.propertyAddress)
        && numberServices.equals(system.numberServices) && size == system.size;
  }

  @Override
  public int hashCode() {
    return Objects.hash(propertyAddress, monthlyService, numberServices, size);
  }
}

