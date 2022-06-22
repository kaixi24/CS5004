package problem1;

/**
 * Class DoubleRoom is inherited from Room class,
 * For the double boom, MAX_OCCUPANCY is set to 2 as a constant value.
 */
public class DoubleRoom extends Room{
  private final static int MAX_OCCUPANCY=2;

  public DoubleRoom(int maxOccupancy, int price, int numberGuest) {
    super(MAX_OCCUPANCY, price, numberGuest);
  }

}

