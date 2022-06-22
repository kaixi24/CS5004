package problem2;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Objects;

/**
 * class Catalog is created.
 * it contains information about an Item list stored by ArrayList
 * */

public class Catalog {
  private ArrayList<Item> itemArray;

  /**
   * Catalog constructor, without the items specified in the collection
   */
  public Catalog() {
    this.itemArray=new ArrayList<Item>();
  }

  /**
   * Catalog constructor, with items specified in the collection
   * @param catalog1 the list to initalize the constructor
   */
  public Catalog(ArrayList<Item> catalog1) {
    this.itemArray=new ArrayList<Item>();
    for (int i=0; i<catalog1.size(); i++){
      this.itemArray.add(catalog1.get(i));
    }
  }

  /**
   * adding item inside the Catalog
   * @param item the item to be added in
   */
  public void addItem (Item item) {
    this.itemArray.add(item);
  }

  /**
   * remove item from the Catalog
   * @param item item to be removed
   */
  public void removeItem (Item item) {
    this.itemArray.remove(item);
  }

  /**
   * This should retrieve all items in the catalog,
   * regardless of type, that have a title containing the keyword (case insensitive).
   * @param keyword keyword to search
   * @return  items that have keyword anywhere in the title.
   */
  public ArrayList<Item> search(String keyword) {
    keyword=keyword.toLowerCase();
    ArrayList<Item> arrayList3=new ArrayList<Item>();
    for (int i = 0; i <this.itemArray.size(); i++) {
      String temp= this.itemArray.get(i).getTitle().toLowerCase();
      if (temp.contains(keyword)){
        arrayList3.add(this.itemArray.get(i));
      }
    }
    return arrayList3;
  }

  /**
   * This should retrieve all items in the catalog that have an exact match for the given author.
   * @param author author to search
   * @return the subset of items in the library collection that match the criteria.
   */
    public ArrayList<Item> search(Author author){
      ArrayList<Item> itemArray1=new ArrayList<Item>();
      for (int i=0; i<this.itemArray.size(); i++) {
        if (this.itemArray.get(i).getCreator().equals(author)){
          itemArray1.add(this.itemArray.get(i));
        }
      }
      return itemArray1;
  }

  /**
   * This should retrieve all items in the catalog that have an exact match for the given artist.
   * @param artist artist to search
   * @return the subset of items in the library collection that match the criteria.
   */
    public ArrayList<Item> search(RecordingArtist artist){
      ArrayList <Item> itemArray2 =new ArrayList<Item>();
      for (int i=0; i<this.itemArray.size(); i++) {
        Item item=this.itemArray.get(i);
        Creator creator= item.getCreator();
        if (creator.isSameRecordingArtist(artist)){
          itemArray2.add(this.itemArray.get(i));
        }
      }
      return itemArray2;
  }

  @Override
  public String toString() {
    return "Catalog{" +
        "itemArray=" + itemArray +
        '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Catalog catalog = (Catalog) o;
    return itemArray.equals(catalog.itemArray);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemArray);
  }
}
