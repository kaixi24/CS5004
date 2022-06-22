package problem1;

/**
 * Class Runner is inherited from Athelete class,
 * includes best 5K time, best half-marathon time, favorite event
 */
public class Runner extends Athlete {
  private Double best5kTime;
  private Double bestH_M_Time;
  private String favEvent;

  /**
   * Constructs a new runner, based upon all of the provided input parameters.
   * @param athletesName - object Name, containing athlete's first, middle and last
  name
   * @param height - athlete's height, expressed as a Double in cm (e.g., 6'2'' is
  recorded as 187.96cm)
   * @param weight - athlete's weigh, expressed as a Double in pounds (e.g. 125, 155,
  200 pounds)
   * @param league - athelete's league, expressed as String
   * @param best5kTime - best 5K time
   * @param bestH_M_Time - best half-marathon time
   * @param favEvent -favorite event
   */
  public Runner(Name athletesName, Double height, Double weight, String league,
      Double best5kTime, Double bestH_M_Time, String favEvent) {
    super(athletesName, height, weight, league);
    this.best5kTime = best5kTime;
    this.bestH_M_Time = bestH_M_Time;
    this.favEvent = favEvent;
  }
  /**
   * Constructs a new runner, based upon all of the provided input parameters.
   * @param athletesName - object Name, containing athlete's first, middle and last
  name
   * @param height - athlete's height, expressed as a Double in cm (e.g., 6'2'' is
  recorded as 187.96cm)
   * @param weight - athlete's weigh, expressed as a Double in pounds (e.g. 125, 155,
  200 pounds)
   * @param best5kTime - best 5K time
   * @param bestH_M_Time - best half-marathon time
   * @param favEvent -favorite event
   */
  public Runner(Name athletesName, Double height, Double weight, Double best5kTime,
      Double bestH_M_Time, String favEvent) {
    super(athletesName, height, weight);
    this.best5kTime = best5kTime;
    this.bestH_M_Time = bestH_M_Time;
    this.favEvent = favEvent;
  }

  /**
   *
   * @return the best5Ktime
   */
  public Double getBest5kTime() {
    return best5kTime;
  }
  /**
   *
   * @return the bestH_M_Time
   */
  public Double getBestH_M_Time() {
    return bestH_M_Time;
  }
  /**
   *
   * @return the favEvent
   */

  public String getFavEvent() {
    return favEvent;
  }
  /**
   * This is a setter method for setting the best 5K time
   * @param best5kTime
   */
  public void setBest5kTime(Double best5kTime) {
    this.best5kTime = best5kTime;
  }

  /**
   * This is a setter method for setting the half-marathon time
   * @param bestH_M_Time
   */
  public void setBestH_M_Time(Double bestH_M_Time) {
    this.bestH_M_Time = bestH_M_Time;
  }
  /**
   * This is a setter method for setting the favorite event
   * @param favEvent
   */
  public void setFavEvent(String favEvent) {
    this.favEvent = favEvent;
  }
}
