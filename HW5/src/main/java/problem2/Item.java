package problem2;

import java.util.Objects;

/**
 *  Class Item is created based on the below information
 *  it contains the information of creator, title and year
 */
public abstract class Item {
  private Creator creator;
  private String title;
  private int year;

  /**
   * Contructs Item, based on the below parameters
   * @param creator creator of the item
   * @param title title of the item
   * @param year year of the item
   * @throws IllegalArgumentException when the input is not valid
   */
  public Item(Creator creator, String title, int year) throws IllegalArgumentException{
    this.creator = creator;
    this.title = title;
    if (year>=0)
      this.year = year;
    else
      throw new IllegalArgumentException("Invalid year input");
  }

  /**
   * get the creator
   * @return Creator
   */
  public Creator getCreator() {
    return this.creator;
  }
/**
 * set the creator
 * @param creator creator of the item
 */
  public void setCreator(Creator creator) {
    this.creator = creator;
  }

  /**
   * get the title
   * @return title of the item
   */

  public String getTitle() {
    return this.title;
  }

  /**
   * set the title
   * @param title title of the item
   */
  public void setTitle(String title) {
    this.title = title;
  }

  /**
   * get the year
   * @return year
   */

  public int getYear() {
    return this.year;
  }

  /**
   * set the year
   * @param year year of the item
   * @throws IllegalArgumentException invalid year input
   */

  public void setYear(int year) throws IllegalArgumentException {
    if (year>=0)
      this.year = year;
    else
      throw new IllegalArgumentException("Invalid year input");
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Item item = (Item) o;
    return year == item.year && creator.equals(item.creator) && title.equals(item.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creator, title, year);
  }

  @Override
  public String toString() {
    return "Item{" +
        "creator=" + creator +
        ", title='" + title + '\'' +
        ", year=" + year +
        '}';
  }
}
