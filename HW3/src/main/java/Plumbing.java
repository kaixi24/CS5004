/**
 * Class Plumbing is inherited from Specialist class,
 */

public class Plumbing extends Specialist{
  private final static Integer PERMIT_FEE=20;

  /**
   * Constructs a new Interior class, based upon the provided input parameters.
   * @param propertyAddress - Property address;
   * @param monthlyService - A boolean that indicates whether or not the service is carried out monthly.
   * @param numberServices - The number of services previously carried out at the address
   * @param size -Property size
   * @param employeeNumber number of employees
   * @param isComplex to tell whether it is complex work
   */
  public Plumbing(String propertyAddress, boolean monthlyService, Integer numberServices, Size size,
      Integer employeeNumber, boolean isComplex) {
    super(propertyAddress, monthlyService, numberServices, size, employeeNumber, isComplex);
  }

  /**
   * @override calculateprice(), calculate the price for the Plumbing services
   */
  @Override
  public double calculatePrice() {
    return this.employeeNumber*rate+PERMIT_FEE;
  }
}
