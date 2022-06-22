package problem2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TimeTest {
    private Time timeTest;

    @BeforeEach
    void setUp() {
        timeTest= new Time (1,25,25);
    }

    @Test
    void getHour() {
        assertEquals(1,timeTest.getHour());
    }

    @Test
    void getMinutes() {
        assertEquals(25,timeTest.getMinutes());
    }

    @Test
    void getSeconds() {
        assertEquals(25,timeTest.getSeconds());
    }

    @Test
    void setHour() {
        timeTest.setHour(1);
        assertEquals(1,timeTest.getHour());
        timeTest.setHour(25);
        assertEquals(1,timeTest.getHour());
    }

    @Test
    void setMinutes() {
        timeTest.setMinutes(25);
        assertEquals(25,timeTest.getMinutes());
        timeTest.setMinutes(100);
        assertEquals(25,timeTest.getMinutes());
    }

    @Test
    void setSeconds() {
        timeTest.setSeconds(25);
        assertEquals(25,timeTest.getSeconds());
        timeTest.setSeconds(100);
        assertEquals(25,timeTest.getSeconds());
    }
}