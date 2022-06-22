package problem1;

public class FleetManager {
  public static TripReport drive(Float distance, Vehicle vehicle){
    if(distance<=0) throw new IllegalArgumentException("The distance should be positive");
    Float duration;
    if(vehicle.getAverageSpeed()>0){
      duration=distance/vehicle.getAverageSpeed();
    }
    else throw new IllegalArgumentException("The speed of a vehicle should be positive");
    return new TripReport(vehicle,vehicle.getAverageSpeed(),distance,Math.round(duration));
  }

  public static TripReport drive(Float distance, Boat boat){
    if(distance<=0) throw new IllegalArgumentException("distance should be positive");
    Float duration;
    if(boat.getAverageSpeed()>0){
      duration=distance/boat.getAverageSpeed();
    }
    else throw new IllegalArgumentException("The speed of a vehicle should be positive");
    return new TripReport(boat,boat.getAverageSpeed(),distance,Math.round(duration));
  }

  public static TripReport drive(Float distance, Bus bus){
    if(distance<=0) throw new IllegalArgumentException("the distance should be positive");
    Float duration;
    if(bus.getAverageSpeed()>0){
      duration=distance/bus.getAverageSpeed();
    }
    else throw new IllegalArgumentException("The speed of a vehicle should be positive");
    return new TripReport(bus,bus.getAverageSpeed(),distance,Math.round(duration));
  }

  public static TripReport drive(Float distance, Train train){
    if(distance<=0) throw new IllegalArgumentException("distance should be greater than 0");
    Float duration;
    if(train.getAverageSpeed()>0){
      duration=distance/train.getAverageSpeed();
    }
    else throw new IllegalArgumentException("The speed of a vehicle should be positive");
    return new TripReport(train,train.getAverageSpeed(),distance,Math.round(duration));
  }

}
