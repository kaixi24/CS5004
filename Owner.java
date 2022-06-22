package problem1;

import javax.swing.plaf.synth.SynthOptionPaneUI;

/**
 * Owner is a simple object that has a firstName, lastName and number;
 */

public class Owner {
    private String firstName;
    private String lastName;
    private String number;
    private final Integer LENGTH= 10;
  /**
   * Constructor that creates a new Owner object with the specified firstname, lastname and number
   *
   * @param firstname - firstName of the new Owner object.
   * @param lastName - lastName of the new Owner object.
   * @param number - phone number of the new Owner object.
   */
public Owner(String firstname, String lastName, String number){
    this.firstName=firstname;
    this.lastName=lastName;
    this.number=number;
}
  /**
   * Returns the firstname of the owner. * @return the firstName of the Owner object.
   */

    public String getFirstName() { return this.firstName;}

  /**
   * Returns the lastName of the owner. * @return the lastName of the Owner object.
   */
    public String getLastName() {return this.lastName;}
  /**
   * Returns the number of the owner . * @return the number of the Owner object.
   */
    public String getNumber(){ return this.number;}

  /**
   * Sets the number for the owner.
   * If the number length is not 10 digits, return error message.
   */
   public void setNumber(String number){
    if (number.length()==LENGTH)
        this.number=number;
    else
        System.out.println("Error, please input again");
    }
}

