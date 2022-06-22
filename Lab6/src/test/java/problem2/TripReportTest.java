package problem2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TripReportTest {
  TripReport tripReportTest;
  Vehicle vehicle;

  @BeforeEach
  void setUp() {
    tripReportTest=new TripReport(vehicle,60.0f,3600.0f,60);
  }

  @Test
  void getVehicle() {
    assertEquals(vehicle,tripReportTest.getVehicle());

  }

  @Test
  void setVehicle() {
    tripReportTest.setVehicle(vehicle);
    assertEquals(vehicle,tripReportTest.getVehicle());
  }

  @Test
  void getSpeed() {
    assertEquals(60.0f,tripReportTest.getSpeed());
  }

  @Test
  void setSpeed() {
    tripReportTest.setSpeed(60.0f);
    assertEquals(60.0f,tripReportTest.getSpeed());
  }

  @Test
  void getDistance() {
    assertEquals(3600.0f,tripReportTest.getDistance());
  }

  @Test
  void setDistance() {
    tripReportTest.setDistance(3600.0f);
    assertEquals(3600.0f,tripReportTest.getDistance());
  }

  @Test
  void getTripDuration() {
    assertEquals(60,tripReportTest.getTripDuration());
  }

  @Test
  void setTripDuration() {
    tripReportTest.setTripDuration(60);
    assertEquals(60,tripReportTest.getTripDuration());
  }
}