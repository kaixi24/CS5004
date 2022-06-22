
/**
 * Class ElectricalSpe is inherited from Specialist class,
 */
public class ElectricalSpe extends Specialist{

  private final static Integer MAX_ELECTRICAL_NUMBER=4;
  private final static Integer PERMIT_FEE=50;

  /**
   * Constructs a new ElectricalSpe class, based upon the provided input parameters.
   * @param propertyAddress - Property address;
   * @param monthlyService - A boolean that indicates whether or not the service is carried out monthly.
   * @param numberServices - The number of services previously carried out at the address
   * @param size -Property size
   * @param employeeNumber -the number of the employees
   * @param isComplex- to tell whether it is complex or not
   */
  public ElectricalSpe(String propertyAddress, boolean monthlyService,
      Integer numberServices, Size size, Integer employeeNumber, boolean isComplex) {
    super(propertyAddress, monthlyService, numberServices, size, employeeNumber, isComplex);
  }
  /**
   * @override setEmployeeNumber,which has additional requirements compared to the parent class
   * Electrical services can require a maximum number of 4 licensed employees. It should not be possible
   * to create an electrical service if more than 4 licensed employees are required.
   */
  @Override
  public void setEmployeeNumber(Integer employeeNumber) {
    if (employeeNumber>MAX_ELECTRICAL_NUMBER)
      this.setEmployeeNumber(MAX_ELECTRICAL_NUMBER);
    else
      super.setEmployeeNumber(employeeNumber);
  }

  /**
   * @override calculateprice(), calculate the price for the Electrical Specialist
   */
  @Override
  public double calculatePrice() {
    return this.employeeNumber*rate+PERMIT_FEE;
  }

}
