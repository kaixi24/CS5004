package problem2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FleetManagerTest {
  FleetManager testFleetManager;
  TripReport tripReportTest,tripReportTest1,tripReportTest2,tripReportTest3;
  Bus bus;
  Boat boat;
  Train train;

  @BeforeEach
  void setUp() {
    bus=new Bus("12345",60.0f,150.0f);
    train=new Train("12345",60.0f,150.0f);
    boat=new Boat("12345",60.0f,150.0f);
    tripReportTest=new TripReport(bus,60.0f,3600.0f,60);
    tripReportTest1=new TripReport(boat,60.0f,3600.0f,60);
    tripReportTest2=new TripReport(train,60.0f,3600.0f,60);
    testFleetManager.drive(3600.0f,boat);
    testFleetManager.drive(3600.0f,train);
  }

  @Test
  void drive() {
    assertEquals(tripReportTest,testFleetManager.drive(3600.0f,bus,60.0f));
  }

  @Test
  void testDrive() {
    assertEquals(tripReportTest,testFleetManager.drive(3600.0f,bus));
  }

  @Test
  void testDrive1() {
    assertEquals(tripReportTest1,testFleetManager.drive(3600.0f,boat));

  }

  @Test
  void testDrive2() {

  }

  @Test
  void testDrive3() {
    assertEquals(tripReportTest2,testFleetManager.drive(3600.0f,train));

  }

  @Test
  void testDrive4() {
    assertEquals(tripReportTest,testFleetManager.drive(bus,60.0f,60));
  }

  @Test
  void testDrive5() {
    assertEquals(tripReportTest,testFleetManager.drive(3600.0f,bus,60.0f,60.0f));
  }
}