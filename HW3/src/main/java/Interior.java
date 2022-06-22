import java.util.Objects;

/**
 * Class Interior is inherited from System class,
 */
public abstract class Interior extends System{
  protected Integer petNumber;
  protected final static Integer RATE=80;
  private final static Integer HOUR_SMALL=1;
  private final static Integer HOUR_MEDIUM=2;
  private final static Integer HOUR_LARGE=4;

  /**
   * Constructs a new Interior class, based upon the provided input parameters.
   * @param propertyAddress - Property address;
   * @param monthlyService - A boolean that indicates whether or not the service is carried out monthly.
   * @param numberServices - The number of services previously carried out at the address
   * @param size -Property size
   * @param petNumber -petNumbers
   */
  public Interior(String propertyAddress, boolean monthlyService, Integer numberServices, Size size,
      Integer petNumber) throws IllegalPetNumberException {
    super(propertyAddress, monthlyService, numberServices, size);
    this.validatePetNumber(petNumber);
  }
  /**
   * a method to validate the pet number;
   */
  public void validatePetNumber(Integer petNumber) throws IllegalPetNumberException{
    if (petNumber>=0)
      this.petNumber = petNumber;
    else
      throw new IllegalPetNumberException("Wrong pet number");
  }
  /**
   * Returns petNumber
   * */
  public Integer getPetNumber() {
    return petNumber;
  }

  /**
   * This is a setter method for setting the number of the pets
   * @param petNumber
   */
  public void setPetNumber(Integer petNumber) throws IllegalPetNumberException{
    this.validatePetNumber(petNumber);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Interior interior = (Interior) o;
    return petNumber.equals(interior.petNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(petNumber);
  }
}
