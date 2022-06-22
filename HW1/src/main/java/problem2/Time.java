package problem2;

/**
 * Time is a simple object that has hour, minutes and seconds;
 */
public class Time {
    private Integer hour;
    private Integer minutes;
    private Integer seconds;
    private final Integer EXCEPTIONCHECK_HOUR = 23;
    private final Integer EXCEPTIONCHECK_MIN = 59;
    private final Integer EXCEPTIONCHECK_LOW = 0;
    private final Integer CONVERSION_NUMBER_HtS=3600;
    private final Integer CONVERISON_NUMBER_MtS=60;

    /**
     * Constructor that creates a new Time object with hour, minutes and seconds
     *
     * @param hour - hour of the new Time object.
     * @param minutes - minutes of the new Time object.
     * @param seconds - seconds of the Time object.
     */
public Time(Integer hour, Integer minutes, Integer seconds){
    this.hour=hour;
    this.minutes=minutes;
    this.seconds=seconds;
}
    /**
     * Returns the hour of the Time. * @return the hour of the Time object.
     */

    public Integer getHour() {return this.hour;
    }
    /**
     * Returns the minutes of the Time. * @return the minutes of the Time object.
     */
    public Integer getMinutes(){return this.minutes;}

    /**
     * Returns the seconds of the Time. * @return the seconds of the Time object.
     */
    public Integer getSeconds(){return this.seconds;}
    /**
     * Returns the time in seconds for the Time Object. * @return the time in seconds for the Time Object
     */
    public Integer getTimeSeconds(){
    return this.hour*CONVERSION_NUMBER_HtS+this.minutes *CONVERISON_NUMBER_MtS+this.seconds;
    }

    /**
     * Sets the hour of the Time Object. print out error message if the input is not in the range of 0-23
     */

    public void setHour(Integer hour){
        if (hour<EXCEPTIONCHECK_LOW || hour>EXCEPTIONCHECK_HOUR)
            System.out.println("error");
        else
            this.hour = hour;
    }
    /**
     * Sets the minutes of the Time Object. Print out error message if the input is not in the range of 0-59
     */

    public void setMinutes(Integer minutes){
        if (minutes<EXCEPTIONCHECK_LOW || minutes>EXCEPTIONCHECK_MIN)
            System.out.println("error");
        else
            this.minutes=minutes;
    }

    /**
     * Sets the seconds of the Time Object. print out error message if the input is not in the range of 0-59
     */

    public void setSeconds(Integer seconds){
        if (seconds<EXCEPTIONCHECK_LOW || seconds>EXCEPTIONCHECK_MIN)
            System.out.println("error");
        else
            this.seconds=seconds;
    }

}
