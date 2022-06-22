
/**
 * Class Painting is inherited from Interior class,
 */
public class Painting extends Interior {

  private final static Integer HOURS_SMALL_MEDIUM = 16;
  private final static Integer HOURS_LARGE = 24;
  private static final Integer THREE_PETS = 3;
  private static final Integer ONE_PET = 1;
  private static final Double Rate_THREE_PETS = 1.07;
  private static final Double Rate_ONE_TWO_PET = 1.05;

  /**
   * Constructs a new Interior class, based upon the provided input parameters.
   * @param propertyAddress - Property address;
   * @param monthlyService - A boolean that indicates whether or not the service is carried out monthly.
   * @param numberServices - The number of services previously carried out at the address
   * @param size -Property size
   * @param petNumber pet numbers
   */
  public Painting(String propertyAddress, boolean monthlyService, Integer numberServices, Size size,
      Integer petNumber) throws IllegalPetNumberException {
    super(propertyAddress, monthlyService, numberServices, size, petNumber);
  }

  /**
   * @override calculateprice(), calculate the price for the painting services
   */
  @Override
  public double calculatePrice() {
    double money;
    if (petNumber >= THREE_PETS) {
      if (size == Size.large){
        money=Rate_THREE_PETS * HOURS_LARGE * RATE * this.discount();
        return Math.round(money*100.0)/100.0;}
      else{
        money=Rate_THREE_PETS * HOURS_SMALL_MEDIUM * RATE * this.discount();
        return Math.round(money*100.0)/100.0; }
    }
    else if (petNumber >= ONE_PET) {
      if (size == Size.large){
        money=Rate_ONE_TWO_PET* HOURS_LARGE * RATE * this.discount();
        return Math.round(money*100.0)/100.0;}
      else {
        money = Rate_ONE_TWO_PET * HOURS_SMALL_MEDIUM * RATE * this.discount();
        return Math.round(money * 100.0) / 100.0;
      }
    }
    else {
        if (size == Size.large){
          money= HOURS_LARGE * RATE * this.discount();
          return Math.round(money*100.0)/100.0;}
        else {
          money = HOURS_SMALL_MEDIUM * RATE * this.discount();
          return Math.round(money * 100.0) / 100.0;
        }

      }
    }
}
