package problem1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OwnerTest {
    private Owner testOwner;

    @BeforeEach
    void setUp() {
        testOwner = new Owner("Harry", "Potter","1223476900");
    }

    @Test
    void getFirstName() {
        assertEquals("Harry",testOwner.getFirstName());
    }

    @Test
    void getLastName() {
        assertEquals("Potter",testOwner.getLastName());
    }

    @Test
    void getNumber() {
        assertEquals("1223476900",testOwner.getNumber());
    }

    @Test
    void setNumber() {
        testOwner.setNumber("1223476900");
        assertEquals("1223476900",testOwner.getNumber());
        testOwner.setNumber("12234769");
        assertEquals("1223476900",testOwner.getNumber());
    }
}