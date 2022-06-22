package problem1;

import java.time.LocalDateTime;
import java.util.Objects;

/**
 * Class MonthlyDonation is inherited from Donation class,
 */
public class MonthlyDonation extends Donation{
  private final static int NUM_OF_MONTHS=12;
  private LocalDateTime cancelDate;
  /**
   * Constructs a new MonthlyDonation class, based upon the provided input parameters.
   * @param amount donation amount
   * @param donationTime donation time
   */
  public MonthlyDonation(Double amount, LocalDateTime donationTime)
      throws IllegalArgumentException {
    super(amount, donationTime);
  }

  /**
   * set the time to cancel Monthly Donation
   * @param time time of the cancel time
   * @throws IllegalArgumentException
   */

  void setCancelMonthlyDonation (LocalDateTime time) throws IllegalArgumentException {
    LocalDateTime cancelDate = time;
    boolean Date1isBeforeDate2;
    if (time==null)
      this.cancelDate=null;
    else if (Date1isBeforeDate2 = cancelDate.isBefore(donationTime))
      throw new IllegalArgumentException("Cancellation time cannot be before creation time");
    else {
      this.cancelDate = time;
    }
  }

  /**
   * get the cancelation time
   * @return cancelDate
   */
  public LocalDateTime getCancelDate() {
    return this.cancelDate;
  }

  /**
   *  calculate the donation for this year
   * @param year the year of the donation
   * @return the donation amount for the year;
   */
  @Override
    public Double getDonationForYear (int year){
    if (this.cancelDate==null){
      if (year< this.getDonationTime().getYear()){
        return 0.0;
      }
      else if (year>this.getDonationTime().getYear())
        return NUM_OF_MONTHS*this.amount;
      else
        return (NUM_OF_MONTHS - this.donationTime.getMonthValue() + 1) * this.amount;
    }
    else {
      if (year < this.getDonationTime().getYear())
        return 0.0;
      else if (year > this.getCancelDate().getYear())
        return 0.0;
      else {
        if (year == this.getDonationTime().getYear() && year < this.getCancelDate().getYear()) {
          return (NUM_OF_MONTHS - this.donationTime.getMonthValue() + 1) * this.amount;
        } else if (year == this.getDonationTime().getYear() && year == this.getCancelDate()
            .getYear()) {
          if (this.donationTime.getDayOfMonth()>this.cancelDate.getDayOfMonth()){
            return (this.cancelDate.getMonthValue() - this.donationTime.getMonthValue() )
                * this.amount;
          }
          else
            return (this.cancelDate.getMonthValue() - this.donationTime.getMonthValue() +1 )
                * this.amount;
        } else if (year > this.getDonationTime().getYear() && year < this.getCancelDate().getYear())
          return NUM_OF_MONTHS * this.amount;
        else
          return (this.cancelDate.getMonthValue() - 1) * this.amount;
      }
    }
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
    MonthlyDonation that = (MonthlyDonation) o;
    return cancelDate.equals(that.cancelDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cancelDate);
  }

  @Override
  public String toString() {
    return "MonthlyDonation{" +
        "amount=" + amount +
        ", donationTime=" + donationTime +
        ", cancelDate=" + cancelDate +
        '}';
  }
}


