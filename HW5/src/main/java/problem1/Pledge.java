package problem1;

import java.time.LocalDateTime;
import java.util.Objects;

/**
 * Class Pledge is inherited from Donation class,
 */
public class Pledge extends Donation {
  private LocalDateTime processingDate;
  /**
   * Constructs a new Pledge class, based upon the provided input parameters.
   * @param amount amount of the money
   * @param donationTime the time for the donation
   * @param processingDate the processing time for the donation
   * @throws IllegalArgumentException illegal year input
   */
  public Pledge(Double amount, LocalDateTime donationTime, LocalDateTime processingDate)
      throws IllegalArgumentException {
    super(amount, donationTime);
    this.processingDate = processingDate;
  }

  /**
   * set processing date
   * @param processingDate1 the processing date
   * @throws IllegalArgumentException invalid year input
   */
  public void setProcessingDate(LocalDateTime processingDate1) throws IllegalArgumentException {
    boolean Date1isBeforeDate2;
    if (processingDate1==null) //if to remove the processing date;
      this.processingDate=null;
    else if (Date1isBeforeDate2=processingDate1.isBefore(donationTime))
      throw new IllegalArgumentException("Processing time cannot be before creation time");
    else
      this.processingDate=processingDate1;
  }
/**
 * get the processing date
 * @return processingDate
 */
  public LocalDateTime getProcessingDate() {
    return this.processingDate;
  }

  /**
   *  the method getDonationForYear
   * @param year the year to check
   * @return the amount for the year
   */
  @Override
  public Double getDonationForYear(int year){
    if (processingDate.getYear()==year){
      return this.amount;
    }
    else
      return 0.0;
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
    Pledge pledge = (Pledge) o;
    return processingDate.equals(pledge.processingDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(processingDate);
  }

  @Override
  public String toString() {
    return "Pledge{" +
        "amount=" + amount +
        ", donationTime=" + donationTime +
        ", processingDate=" + processingDate +
        '}';
  }
}
