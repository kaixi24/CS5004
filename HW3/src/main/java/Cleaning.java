/**
 * Class Interior is inherited from System class,
 */
public class Cleaning extends Interior{
  protected static final Integer HOUR_SMALL=1;
  protected static final Integer HOUR_MEDIUM=2;
  protected static final Integer HOUR_LARGE=4;
  private static final Integer THREE_PETS=3;
  private static final Integer ONE_PET=1;
  private static final Double Rate_THREE_PETS=1.07;
  private static final Double Rate_ONE_TWO_PET=1.05;
  private static final Double Rate_NO_PET=1.0;

  /**
   * Constructs a new Cleaning class, based upon the provided input parameters.
   * @param propertyAddress - Property address;
   * @param monthlyService - A boolean that indicates whether or not the service is carried out monthly.
   * @param numberServices - The number of services previously carried out at the address
   * @param size -Property size
   * @param petNumber the number of the pets
   */
  public Cleaning(String propertyAddress, boolean monthlyService, Integer numberServices, Size size,
      Integer petNumber) throws IllegalPetNumberException {
    super(propertyAddress, monthlyService, numberServices, size, petNumber);
  }

  /**
   * @override calculateprice(), calculate the price for the cleaning services
   */
  @Override
  public double calculatePrice() {
    double money;
    if (petNumber>=THREE_PETS){
      if (size==Size.large){
        money=Rate_THREE_PETS*HOUR_LARGE*RATE*this.discount();
        return Math.round(money*100.0)/100.0;
      }
      else if (size==Size.medium){
        money=Rate_THREE_PETS*HOUR_MEDIUM*RATE*this.discount();
        return Math.round(money*100.0)/100.0;
      }
      else {
        money=Rate_THREE_PETS*HOUR_SMALL*RATE*this.discount();
        return money;
      }}
    else if (petNumber>=ONE_PET){
      if (size==Size.large){
        money= Rate_ONE_TWO_PET*HOUR_LARGE*RATE*this.discount();
        return Math.round(money*100.0)/100.0;}
      else if (size==Size.medium){
        money= Rate_ONE_TWO_PET*HOUR_MEDIUM*RATE*this.discount();
        return Math.round(money*100.0)/100.0;
      }
      else {
        money=Rate_ONE_TWO_PET*HOUR_SMALL*RATE*this.discount();
        return Math.round(money*100.0)/100.0;
      }
    }
    else
    if (size==Size.large){
      money= Rate_NO_PET*HOUR_LARGE*RATE*this.discount();
      return money;
    }
    else if (size==Size.medium){
      money= Rate_NO_PET*HOUR_MEDIUM*RATE*this.discount();
      return money;
    }
    else {
      money= Rate_NO_PET*HOUR_SMALL*RATE*this.discount();
      return money;
    }
    }

}
