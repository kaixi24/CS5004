package problem2;


public class FleetManager {
  public static TripReport drive(Float distance, Vehicle vehicle){
    if(distance<0)
      throw new IllegalArgumentException("Distance should not be less than 0");
    Float duration;
    if(vehicle.getAverageSpeed()>0){
      duration=distance/vehicle.getAverageSpeed();
    }
    else throw new IllegalArgumentException("The speed of a vehicle is positive");
    return new TripReport(vehicle,vehicle.getAverageSpeed(),distance,Math.round(duration));
  }

  public static TripReport drive(Float distance, Vehicle vehicle, Float speed, Float duration){
    if (distance<=0) throw new IllegalArgumentException("Distance should be a positive number");
    if (speed<=0) throw new IllegalArgumentException("Speed should be a positive number");
    if (duration<=0) throw new IllegalArgumentException("Duration should be positive number");
    return new TripReport(vehicle,speed,distance,Math.round(duration));
  }

  public static TripReport drive(Float distance, Vehicle vehicle, Float speed){
    if (distance<=0) throw new IllegalArgumentException("Distance should be a positive number");
    Float duration;
    if (speed>0) duration=distance/speed;
    else throw new IllegalArgumentException("Duration should be a positive number");
    return new TripReport(vehicle,speed,distance,Math.round(duration));
  }

  public static TripReport drive(Vehicle vehicle, Float speed, Integer duration){
    if (speed<=0) throw new IllegalArgumentException("Distance should be a positive number");
    if (duration<=0) throw new IllegalArgumentException("Duration should be a positive number");
    Float distance=duration*speed;
    return new TripReport(vehicle,speed,distance,duration);
  }

  public static TripReport drive(Float distance, Boat boat){
    if(distance<=0) throw new IllegalArgumentException("The distance should be positive");
    Float duration;
    if(boat.getAverageSpeed()>0){
      duration=distance/boat.getAverageSpeed();
    }
    else throw new IllegalArgumentException("The speed of a vehicle cannot be zero");
    return new TripReport(boat,boat.getAverageSpeed(),distance,Math.round(duration));
  }

  public static TripReport drive(Float distance, Bus bus){
    if(distance<=0) throw new IllegalArgumentException("distance should be positive");
    Float duration;
    if(bus.getAverageSpeed()>0){
      duration=distance/bus.getAverageSpeed();
    }
    else throw new IllegalArgumentException("The speed of a vehicle cannot be zero");
    return new TripReport(bus,bus.getAverageSpeed(),distance,Math.round(duration));
  }


}
