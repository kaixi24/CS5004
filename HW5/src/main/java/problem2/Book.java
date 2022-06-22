package problem2;

/**
 * Class Band is inherited from Item class,
 *  it contains the information of creator, title and year
 */
public class Book extends Item{

  /**
   * Constructs a new Book class, based on the provided input parameters
   * @param creator creator of the Book class
   * @param title title of the Book class
   * @param year year of the Book class
   */
  public Book(Creator creator, String title, int year) {
    super(creator, title, year);
  }

}
