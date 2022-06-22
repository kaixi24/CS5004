import java.util.Objects;

/**
 * Class Specialist is inherited from System class,
 */
public abstract class Specialist extends System{

  protected Integer employeeNumber;
  private boolean isComplex;
  private static final Integer MIN_EMPLOYEE_NUMBER=1;
  private static final Integer SMALL_MEDIUM_EMPLOYEE_NUMBER=2;
  private static final Integer LARGE_EMPLOYEE_NUMBER=3;
  protected static final Integer rate=200;

  /**
   * Constructs a new Interior class, based upon the provided input parameters.
   * @param propertyAddress - Property address;
   * @param monthlyService - A boolean that indicates whether or not the service is carried out monthly.
   * @param numberServices - The number of services previously carried out at the address
   * @param size -Property size
   * @param employeeNumber the number of licensed employees required to complete the work,
   * @param isComplex- a boolean that indicates if the work to be done is complex.
   */
  public Specialist(String propertyAddress, boolean monthlyService, Integer numberServices,
      Size size,
      Integer employeeNumber, boolean isComplex) {
    super(propertyAddress, monthlyService, numberServices, size);
    this.isComplex = isComplex;
    this.validateEmployeeNumber(employeeNumber);
  }
  /**
   * A method to validate whether the Employee Number is valid or not
   * */

  public void validateEmployeeNumber(Integer employeeNumber){
    if (employeeNumber>=MIN_EMPLOYEE_NUMBER)
      this.employeeNumber = employeeNumber;
    else
      this.employeeNumber = MIN_EMPLOYEE_NUMBER;
    if (this.isComplex()) {
      if (size == Size.small || size == Size.medium) {
        if (this.employeeNumber < SMALL_MEDIUM_EMPLOYEE_NUMBER)
          this.employeeNumber = SMALL_MEDIUM_EMPLOYEE_NUMBER;
      } else if (this.employeeNumber < LARGE_EMPLOYEE_NUMBER)
        this.employeeNumber = LARGE_EMPLOYEE_NUMBER;
    }
  }
  /**
   * Returns EmployeeNumber
   * */

  public Integer getEmployeeNumber() {
    return employeeNumber;
  }

  /**
   * This is a setter method for setting the number of the employees needed
   * @param employeeNumber
   */
  public void setEmployeeNumber(Integer employeeNumber){
    this.validateEmployeeNumber(employeeNumber);
  }

  /**
   * Returns a boolean that indicates if the work to be done is complex.
   * */

  public boolean isComplex() {
    return isComplex;
  }

  /**
   * This is a setter method for setting the work to be done is complex or not
   */
  public void setComplex(boolean complex) {
    isComplex = complex;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    Specialist that = (Specialist) o;
    return isComplex == that.isComplex && employeeNumber.equals(that.employeeNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), employeeNumber, isComplex);
  }
}
