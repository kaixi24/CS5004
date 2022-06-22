package problem3;

/**
 * Amount is a simple object that has dollar, cent;
 */


public class Amount {
    private Integer dollar;
    private Integer cent;
    private final Integer EXCEPTIONCHECK_MIN = 99;
    private final Integer EXCEPTIONCHECK_LOW = 0;

    /**
     * Constructor that creates a new Amount object with dollar, cent.
     *
     * @param dollar - dollar of the new Amount object.
     * @param cent - cent of the new Amount object.
     */
public Amount (Integer dollar, Integer cent){
    this.dollar=dollar;
    this.cent=cent;
}

    /**
     * Returns the dollar of the Amount Object.
     * @return the dollar of the Amount Object.
     */

    public Integer getDollar() {
        return dollar;
    }


    /**
     * Sets the dollar of the Amount Object. print out error message if the input is below 0
     */

    public void setDollar(Integer dollar) {
    if (dollar<EXCEPTIONCHECK_LOW)
        System.out.println("error");
    else
        this.dollar = dollar;
    }

    /**
     * Returns the cent of the Amount Object.
     * @return the cent of the Amount Object.
     */
    public Integer getCent() {
        return cent;
    }
    /**
     * Sets the cent of the Amount Object. print out error message if the input is not in the range of 0-99
     */

    public void setCent(Integer cent) {
        if (cent<EXCEPTIONCHECK_LOW||cent>EXCEPTIONCHECK_MIN)
            System.out.println("error");
        else
            this.cent = cent;
    }
}
