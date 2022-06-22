package problem2;

import java.util.Objects;

/**
 *  Class Music is inherited from Item class
 *  it contains the information of creator, title, year
 */
public class Music extends Item{

  /**
   * Constructing Music class
   * @param creator the creator of the Music
   * @param title the title of the Music
   * @param year the year of the Music
   */
  public Music(Creator creator, String title, int year) {
    super(creator, title, year);
  }

}
