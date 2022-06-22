package problem1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {
    private Vehicle testVehicle;
    private Owner testOwner;

    @BeforeEach
    void setUp() {
        testOwner= new Owner("Harry", "Potter", "1223476900");
        testVehicle = new Vehicle(12345, "AB123",testOwner);
    }

    @Test
    void getVIN() {
        assertEquals(12345,testVehicle.getVIN());
    }

    @Test
    void getLicensePlate() {
        assertEquals("AB123",testVehicle.getLicensePlate());
    }

    @Test
    void getOwner() {
        Owner expectedOwner=new Owner("Harry","Potter", "1223476900");
        //assertEquals(expectedName,testPerson.getName()); --when compare, return address, so this fails
        assertEquals(expectedOwner.getFirstName(),testVehicle.getOwner().getFirstName());
        assertEquals(expectedOwner.getLastName(),testVehicle.getOwner().getLastName());
        assertEquals(expectedOwner.getNumber(),testVehicle.getOwner().getNumber());
    }

    @Test
    void setVIN() {
        testVehicle.setVIN(1223476900);
        assertEquals(1223476900,testVehicle.getVIN());
    }


    @Test
    void setLicensePlate() {
        testVehicle.setLicensePlate("AB123");
        assertEquals("AB123",testVehicle.getLicensePlate());
    }
}