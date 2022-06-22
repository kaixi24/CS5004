package problem1;

import java.util.ArrayList;
import java.util.Objects;
import problem2.Item;

/**
 * Class NonProfit is created
 * it contains organization name as a string and donation ArrayList
 */
public class NonProfit {
  private String orgName;
  private ArrayList<Donation> donation;

  /**
   * Constructs a new NonProfit class, based upon the provided input parameters.
   * @param orgName organization name
   * @param donation1 arraylist to initalize the clas
   */
  public NonProfit(String orgName, ArrayList<Donation> donation1) {
    this.orgName = orgName;
    this.donation=new ArrayList<Donation>();
    for (int i=0; i<donation1.size(); i++){
      this.donation.add(donation1.get(i));
    }
  }

  /**
   * @Override getTotalDonationForYear
   * @param year year for the check
   * @return total Donations for that specific year
   * @throws IllegalArgumentException
   */

  Double getTotalDonationsForYear(int year) throws IllegalArgumentException{
    Double sum=0.0;
    if (year>=0) {
      for (int i = 0; i < this.donation.size(); i++) {
        sum += this.donation.get(i).getDonationForYear(year);
      }
      return sum;
    }
    else {
      throw new IllegalArgumentException("Invalid input of year");
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
    NonProfit nonProfit = (NonProfit) o;
    return orgName.equals(nonProfit.orgName) && donation.equals(nonProfit.donation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orgName, donation);
  }

  @Override
  public String toString() {
    return "NonProfit{" +
        "orgName='" + orgName + '\'' +
        ", donation=" + donation +
        '}';
  }
}
