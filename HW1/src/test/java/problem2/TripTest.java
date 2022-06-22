package problem2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import problem1.Owner;

import static org.junit.jupiter.api.Assertions.*;

class TripTest {
    private Trip tripTest;
    private Time timeTest1;
    private Time timeTest2;

    @BeforeEach
    void setUp() {
        timeTest1= new Time(12,24,36);
        timeTest2= new Time (15,30,45);
        tripTest=new Trip("New York", "Seattle", timeTest1, timeTest2);
    }

    @Test
    void getStartLocation() {
        assertEquals("New York",tripTest.getStartLocation());
    }

    @Test
    void getEndLocation() {
        assertEquals("Seattle",tripTest.getEndLocation());
    }

    @Test
    void getStartTime() {
        Time expectedTime=new Time(12,24,36);
        //assertEquals(expectedName,testPerson.getName()); --when compare, return address, so this fails
        assertEquals(expectedTime.getHour(),tripTest.getStartTime().getHour());
        assertEquals(expectedTime.getMinutes(),tripTest.getStartTime().getMinutes());
        assertEquals(expectedTime.getSeconds(),tripTest.getStartTime().getSeconds());
    }

    @Test
    void getEndTime() {
        Time expectedTime=new Time(15,30,45);
        //assertEquals(expectedName,testPerson.getName()); --when compare, return address, so this fails
        assertEquals(expectedTime.getHour(),tripTest.getEndTime().getHour());
        assertEquals(expectedTime.getMinutes(),tripTest.getEndTime().getMinutes());
        assertEquals(expectedTime.getSeconds(),tripTest.getEndTime().getSeconds());
    }


    @Test
    void getDuration() {
        Time expectedDuration=new Time(3,6,9);
        assertEquals(expectedDuration.getHour(),tripTest.getDuration(timeTest1,timeTest2).getHour());
        assertEquals(expectedDuration.getMinutes(),tripTest.getDuration(timeTest1,timeTest2).getMinutes());
        assertEquals(expectedDuration.getSeconds(),tripTest.getDuration(timeTest1,timeTest2).getSeconds());
    }
}