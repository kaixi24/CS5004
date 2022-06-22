package problem2;

/**
 * Trip is a simple object that has StartLocation,endLocation, startTime, endTime;
 */
public class Trip {
    private String startLocation;
    private String endLocation;
    private Time startTime;
    private Time endTime;
    private final Integer CONVERSION_NUMBER_HtS=3600;
    private final Integer CONVERISON_NUMBER_MtS=60;

    /**
     * Constructor that creates a new Time object with hour, minutes and seconds
     *
     * @param startLocation -startLocation of the Trip object.
     * @param endLocation- endLocation of the Trip object.
     * @param startTime - startTime of the Trip object.
     * @param endTime - endTime of the Trip object.
     */


    public Trip(String startLocation, String endLocation, Time startTime, Time endTime) {
        this.startLocation = startLocation;
        this.endLocation = endLocation;
        this.startTime = startTime;
        this.endTime = endTime;

    }

    /**
     * Returns the  start location of the Trip Object.
     * @return the  start location of the Trip Object.
     */

    public String getStartLocation() {
        return this.startLocation;
    }

    /**
     * Returns the end location of the Trip Object.
     * @return the end location of the Trip Object.
     */

    public String getEndLocation() {
        return this.endLocation;
    }

    /**
     * Returns the start time of the Trip Object.
     * @return the start time of the Trip Object.
     */


    public Time getStartTime() {
        return this.startTime;
    }


    /**
     * Returns the end time of the Trip Object.
     * @return the end time of the Trip Object.
     */

    public Time getEndTime() {
        return this.endTime;
    }

    /**
     * Returns the duration of the Trip Object.
     * @return the duration of the Trip Object.
     */


    public Time getDuration(Time startTime, Time endTime) {
        Integer t1_seconds = startTime.getTimeSeconds();
        Integer t2_seconds = endTime.getTimeSeconds();
        Integer count = t2_seconds - t1_seconds;
        Time record=new Time(0,0,0);
        record.setHour(count / CONVERSION_NUMBER_HtS);
        count %= CONVERSION_NUMBER_HtS;
        record.setMinutes(count / CONVERISON_NUMBER_MtS);
        count %= CONVERISON_NUMBER_MtS;
        record.setSeconds(count);
        return record;
    }

}