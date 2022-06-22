package problem2;

import java.util.Objects;

public class TripReport {
  private Vehicle vehicle;
  private Float speed;
  private Float distance;
  private Integer tripDuration;

  public TripReport(Vehicle vehicle, Float speed, Float distance, Integer tripDuration) {
    this.vehicle = vehicle;
    this.speed = speed;
    this.distance = distance;
    this.tripDuration = tripDuration;
  }

  public Vehicle getVehicle() {
    return vehicle;
  }

  public void setVehicle(Vehicle vehicle) {
    this.vehicle = vehicle;
  }

  public float getSpeed() {
    return speed;
  }

  public void setSpeed(float speed) {
    this.speed = speed;
  }

  public float getDistance() {
    return distance;
  }

  public void setDistance(float distance) {
    this.distance = distance;
  }

  public Integer getTripDuration() {
    return tripDuration;
  }

  public void setTripDuration(Integer tripDuration) {
    this.tripDuration = tripDuration;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TripReport that = (TripReport) o;
    return Objects.equals(vehicle, that.vehicle) && Objects.equals(speed,
        that.speed) && Objects.equals(distance, that.distance) && Objects.equals(
        tripDuration, that.tripDuration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vehicle, speed, distance, tripDuration);
  }
}
