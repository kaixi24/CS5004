package problem2;

import java.util.ArrayList;
import java.util.Objects;

/**
 * Class Band is inherited from Creator class,
 *  it contains the information of bandName and RecordingArtist ArrayList
 */
public class Band extends Creator {
  private String bandName;
  private ArrayList<RecordingArtist> list =new ArrayList<RecordingArtist>();

  /**
   * Constructs a new Band class, based on the provided input parameters
   * @param bandName the name for the band
   * @param list1 a list to store the parameters
   */
  public Band(String bandName, ArrayList<RecordingArtist> list1) {
    this.bandName = bandName;
    for (int i=0; i<list1.size(); i++){
      this.list.add(list1.get(i));
    }
  }

  /**
   * addRecordingArtist
   * @param artist the artist
   */
  public void addRecordingArtist(RecordingArtist artist){
    this.list.add(artist);
  }
  /**
   * removeRecordingArtist
   * @param artist the artist
   */
  public void removeRecordingArtist(RecordingArtist artist){
   this.list.remove(artist);
  }

  /**
   * getBandName
   * @return band name
   */
  public String getBandName() {
    return this.bandName;
  }

  /**
   * set the band name
   * @param bandName the name of the band
   */
  public void setBandName(String bandName) {
    this.bandName = bandName;
  }

  /**
   * @param artist the artist
   * @return whether is true or not
   */
  @Override
  public boolean isSameRecordingArtist(RecordingArtist artist){
    for (int i=0; i<this.list.size();i++){
      RecordingArtist artist1=this.list.get(i);
      if (artist1.equals(artist)) return true;
    }
    return false;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Band band = (Band) o;
    return bandName.equals(band.bandName) && list.equals(band.list);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bandName, list);
  }

  @Override
  public String toString() {
    return "Band{" +
        "bandName='" + bandName + '\'' +
        ", list=" + list +
        '}';
  }
}
