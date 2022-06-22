package problem1;

import java.time.LocalDateTime;

/**
 * Class OneTimeDonation is inherited from Donation class,
 */

public class OneTimeDonation extends Donation{
  /**
   * Constructs a new OneTimeDonation class, based upon the provided input parameters.
   * @param amount amount to donate
   * @param donationTime the time to donate
   * @throws IllegalArgumentException illegal input for the year
   */

  public OneTimeDonation(Double amount, LocalDateTime donationTime)
      throws IllegalArgumentException {
    super(amount, donationTime);
  }

  /**
   * get the donation amount for a specific year
   * @param year the year to do the calculation
   * @return the amount
   */
  @Override
  public Double getDonationForYear(int year){
    if (year==this.donationTime.getYear())
      return this.amount;
    else
      return 0.0;
  }


  @Override
  public String toString() {
    return "OneTimeDonation{" +
        "amount=" + amount +
        ", donationTime=" + donationTime +
        '}';
  }
}
