package problem3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import problem2.Time;

import static org.junit.jupiter.api.Assertions.*;

class AmountTest {
    private Amount amountTest;

    @BeforeEach
    void setUp() {
        amountTest=new Amount(10,20);
    }

    @Test
    void getDollar() {
        assertEquals(10,amountTest.getDollar());
    }

    @Test
    void setDollar() {
        amountTest.setDollar(10);
        assertEquals(10,amountTest.getDollar());
        amountTest.setDollar(-10);
        assertEquals(10,amountTest.getDollar());

    }

    @Test
    void getCent() {
        assertEquals(20,amountTest.getCent());
    }

    @Test
    void setCent() {
        amountTest.setCent(20);
        assertEquals(20,amountTest.getCent());
        amountTest.setCent(-20);
        assertEquals(20,amountTest.getCent());
    }
}