package problem1;
import java.time.*;
import java.util.Objects;

/**
 * class Donation is created.
 * it contains information about amount and donationTime
 * */
public abstract class Donation{
  Double amount;
  LocalDateTime donationTime;

  /**
   * Constructs Donation, based upon the provided input parameters.
   * @param amount, donation amount;
   * @param donationTime, the time of the donation
   * @throws IllegalArgumentException invalid amount input
   */
  public Donation(Double amount, LocalDateTime donationTime)throws IllegalArgumentException{
    this.donationTime = donationTime;
    if (amount>=0)
      this.amount = amount;
    else
      throw new IllegalArgumentException("Donation amount cannot be negative");
  }

  /**
   * check the amount for the donation
   * @return the amount of the donation
   */

  public Double getAmount() {
    return this.amount;
  }

  /**
   * set the amount of the donation
   * @param amount the amount to donate
   */
  public void setAmount(Double amount) throws IllegalArgumentException {
    if (amount>=0)
      this.amount = amount;
    else
      throw new IllegalArgumentException("Donation amount cannot be negative");
  }

  /**
   * check the donation time for the donation
   * @return donationTime
   */
  public LocalDateTime getDonationTime() {
    return this.donationTime;
  }

  /**
   * check the donation time for the donation
   * @param donationTime the time for donation
   */
  public void setDonationTime(LocalDateTime donationTime){
    this.donationTime = donationTime;
  }

  /**
   * abstract method getDonationForYear
   * @param year, the year to check
   * @throws IllegalArgumentException illegal year input
   * @return the donation money
   */
  public abstract Double getDonationForYear(int year) throws IllegalArgumentException;

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Donation donation = (Donation) o;
    return amount.equals(donation.amount) && donationTime.equals(donation.donationTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, donationTime);
  }

}
