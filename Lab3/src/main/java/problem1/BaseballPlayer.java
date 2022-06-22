package problem1;

import problem1.Athlete;

/**
 * Class BaseballPlayer is inherited from Athelete class,
 * Besides the parameters from Athelete class, also includes team, average batting, season home runs
 */

public class BaseballPlayer extends Athlete {
  private String team;
  private Double avg_batting;
  private Integer seasonHomeRuns;

  /**
   * Constructs a new BaseballPlayer, based upon all of the provided input parameters.
   * @param athletesName - object Name, containing athlete's first, middle and last
  name
   * @param height - athlete's height, expressed as a Double in cm (e.g., 6'2'' is
  recorded as 187.96cm)
   * @param weight - athlete's weigh, expressed as a Double in pounds (e.g. 125, 155,
  200 pounds)
   * @param league - athelete's league, expressed as String
   * @param team - team,
   * @param avg_batting- average batting
   * @param seasonHomeRuns- season home runs
   */

  public BaseballPlayer(Name athletesName, Double height, Double weight, String league,
      String team, Double avg_batting, Integer seasonHomeRuns) {
    super(athletesName, height, weight, league);
    this.team = team;
    this.avg_batting = avg_batting;
    this.seasonHomeRuns = seasonHomeRuns;
  }
  /**
   * Constructs a new BaseballPlayer, based upon all of the provided input parameters.
   * @param athletesName - object Name, containing athlete's first, middle and last
  name
   * @param height - athlete's height, expressed as a Double in cm (e.g., 6'2'' is
  recorded as 187.96cm)
   * @param weight - athlete's weigh, expressed as a Double in pounds (e.g. 125, 155,
  200 pounds)
   * @param team - team,
   * @param avg_batting- average batting
   * @param seasonHomeRuns- season home runs
   */

  public BaseballPlayer(Name athletesName, Double height, Double weight, String team,
      Double avg_batting, Integer seasonHomeRuns) {
    super(athletesName, height, weight);
    this.team = team;
    this.avg_batting = avg_batting;
    this.seasonHomeRuns = seasonHomeRuns;
  }

  /**
   *
   * @return the team
   */


  public String getTeam() {
    return team;
  }

  /**
   *
   * @return the average batting
   */
  public Double getAvg_batting() {
    return avg_batting;
  }

  /**
   *
   * @return the SeasonHomeRuns
   */

  public Integer getSeasonHomeRuns() {
    return seasonHomeRuns;
  }
  /**
   * This is a setter method for setting the team
   * @param team
   */

  public void setTeam(String team) {
    this.team = team;
  }

  /**
   * This is a setter method for setting the avg batting
   * @param avg_batting
   */

  public void setAvg_batting(Double avg_batting) {
    this.avg_batting = avg_batting;
  }

  /**
   * This is a setter method for setting the SeasonHomeRuns
   * @param seasonHomeRuns
   */

  public void setSeasonHomeRuns(Integer seasonHomeRuns) {
    this.seasonHomeRuns = seasonHomeRuns;
  }
}
