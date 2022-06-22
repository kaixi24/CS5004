package problem1;

/**
 * Class FamilyRoom is inherited from Room class,
 * For the family boom, MAX_OCCUPANCY is set to 4 as a constant value.
 */
public class FamilyRoom extends Room{
  private static final int MAX_OCCUPANCY=4;

  public FamilyRoom(int maxOccupancy, int price, int numberGuest) {
    super(MAX_OCCUPANCY, price, numberGuest);
  }
}
