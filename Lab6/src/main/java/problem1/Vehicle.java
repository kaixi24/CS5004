package problem1;

public class Vehicle {
  private String ID;
  private float averageSpeed;
  private float maxSpeed;

  public Vehicle(String ID, float averageSpeed, float maxSpeed) {
    this.ID = ID;
    this.averageSpeed = averageSpeed;
    this.maxSpeed = maxSpeed;
  }

  public String getID() {
    return ID;
  }

  public void setID(String ID) {
    this.ID = ID;
  }

  public float getAverageSpeed() {
    return averageSpeed;
  }

  public void setAverageSpeed(float averageSpeed) {
    this.averageSpeed = averageSpeed;
  }

  public float getMaxSpeed() {
    return maxSpeed;
  }

  public void setMaxSpeed(float maxSpeed) {
    this.maxSpeed = maxSpeed;
  }
}
