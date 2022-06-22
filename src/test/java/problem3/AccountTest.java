package problem3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import problem2.Time;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {
    private Account testAccount;
    private Amount testAmount;

    @BeforeEach
    void setUp() {
        this.testAmount = new Amount(500, 40);
        this.testAccount = new Account("Harry", "Potter", testAmount);
    }

    @Test
    void getFirstname() {
        assertEquals("Harry", testAccount.getFirstname());
    }

    @Test
    void getLastname() {
        assertEquals("Potter", testAccount.getLastname());
    }

    @Test
    void getBalance() {
        Amount expectedBalance = new Amount(500, 40);
        assertEquals(expectedBalance.getDollar(), testAccount.getBalance().getDollar());
        assertEquals(expectedBalance.getCent(), testAccount.getBalance().getCent());
    }

    @Test
    void deposit() {
        Amount expectedDeposit=new Amount (100,10);
        Account finalDeposit= new Account("Harry","Potter",expectedDeposit);
        assertEquals(finalDeposit.getFirstname(),testAccount.getFirstname());
        assertEquals(finalDeposit.getLastname(),testAccount.getLastname());
        assertEquals(600,testAccount.deposit(expectedDeposit).getBalance().getDollar());
        assertEquals(50,testAccount.deposit(expectedDeposit).getBalance().getCent());
    }

    @Test
    void withdraw() {
        Amount expectedDeposit=new Amount (100,10);
        Account finalDeposit= new Account("Harry","Potter",expectedDeposit);
        assertEquals(finalDeposit.getFirstname(),testAccount.getFirstname());
        assertEquals(finalDeposit.getLastname(),testAccount.getLastname());
        assertEquals(400,testAccount.withdraw(expectedDeposit).getBalance().getDollar());
        assertEquals(30,testAccount.withdraw(expectedDeposit).getBalance().getCent());
    }
}

