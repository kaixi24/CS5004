package problem1;

import java.util.Objects;

/**
 * Class Room contains information about maxOccupancy, price and numberGust.
 * */

public abstract class Room {
  protected int maxOccupancy;
  protected int price;
  protected int numberGuest;

  /**
   * Constructs a new Room, based upon all of the provided input parameters.
   * @param maxOccupancy - Room's maxOccupany,
   * @param price - Room's price,
   * @param numberGuest - Room's numberGuest,
   */

  public Room(int maxOccupancy, int price, int numberGuest) {
    this.maxOccupancy = maxOccupancy;
    this.price = price;
    this.numberGuest = 0;
  }
  /**
   * This is a setter method for setting the Room
   * @param maxOccupancy
   */
  public void setMaxOccupancy(int maxOccupancy) {
    this.maxOccupancy = maxOccupancy;
  }

  /**
   * Returns Room's maxOccupancy.
   * */

  public int getMaxOccupancy() {
    return maxOccupancy;
  }

  /**
   * Returns Room's price.
   * */

  public int getPrice() {
    return price;
  }

  /**
   * This is a setter method for setting the Room
   * @param price
   * when the price is below 0, throw an exception.
   */

  public void setPrice(int price) throws IllegalArgument {
    if (price>0) this.price = price;
    else throw new IllegalArgument("Error");
  }

  /**
   * Returns Room's numberGuest
   * */

  public int getNumberGuest() {
    return numberGuest;
  }

  /**
   * This is a setter method for setting the Room
   * @param numberGuest
   */

  public void setNumberGuest(int numberGuest) throws IllegalArgument {
    if (numberGuest>=0)  this.numberGuest = numberGuest;
    else throw new IllegalArgument("Error");
  }

  /**
   * This is a boolean method for setting the Room to tell whether the room is available or not
   */

  public boolean isAvailable() {
    if (this.getNumberGuest()>0) return false;
    else return true;
  }

  /**
   * This is a boolean method to book the room
   * if the room is available and numberGuest>0 and <= axOccupany, then book is successful
   * else booking is not successful
   */
  public void bookRoom(int numberGuest) throws IllegalBooking{
    if (isAvailable() && numberGuest>0 && numberGuest<=maxOccupancy)
      this.numberGuest=numberGuest;
    else
      throw new IllegalBooking("Unsuccessful booking");
  }

  /**
   * Override the Equals
   */

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Room room = (Room) o;
    return maxOccupancy == room.maxOccupancy && price == room.price
        && numberGuest == room.numberGuest;
  }

  /**
   * Override the Hashcode
   */

  @Override
  public int hashCode() {
    return Objects.hash(maxOccupancy, price, numberGuest);
  }
}
