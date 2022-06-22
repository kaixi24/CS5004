package problem1;

import java.util.Objects;

/**
 * Class SingleRoom is inherited from Room class,
 * For the single boom, MAX_OCCUPANCY is set to 1 as a constant value.
 */

public class SingleRoom extends Room{
  private static final int MAX_OCCUPANCY=1;
  public SingleRoom(int maxOccupancy, int price, int numberGuest) {
    super(MAX_OCCUPANCY, price, numberGuest);
  }

}
