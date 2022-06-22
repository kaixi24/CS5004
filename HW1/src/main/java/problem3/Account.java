package problem3;

/**
 * Account is a simple object that has firstname, lastname, balance;
 */

public final class Account {
    private final String firstname;
    private final String lastname;
    private final Amount balance;
    private final Integer CONVERSION_RATE = 100;

  /**
   * Constructor that creates a new Account object with firstname,lastname and balance,
   *
   * @param firstname - firstname of the new Account object.
   * @param lastname - lastname of the new Account object.
   * @param balance - balance of the Account object.
   */

   public Account(String firstname, String lastname, Amount balance) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.balance = balance;
    }
  /**
   * Returns the  firstname of the Account Object.
   * @return the  firstname of the Account Object.
   */

    public String getFirstname() {
        return this.firstname;
    }
  /**
   * Returns the  lastname of the Account Object.
   * @return the  lastname of the Account Object.
   */

    public String getLastname() {
        return this.lastname;
    }

  /**
   * Returns the balance of the Account Object.
   * @return the balance of the Account Object.
   */

    public Amount getBalance() {
        return balance;
    }
  /**
   * A method to calculate the amount if someone deposits money.
   * input amount of the money to deposit and return the account
   * @return the deposit of the Account Object.
   */

    public Account deposit(Amount amount){
        //计算的方法，可以全部换成分
        Amount balance1=new Amount(this.getBalance().getDollar(),this.getBalance().getCent());
        Account account=new Account("this.firstname", "this.lastname", balance1);
        Integer cents; Integer count;
        cents= amount.getCent()+amount.getDollar()*CONVERSION_RATE;
        count=balance1.getCent()+balance1.getDollar()*CONVERSION_RATE+cents;
        balance1.setDollar(count/CONVERSION_RATE);
        balance1.setCent(count%CONVERSION_RATE);
        return account;
}

  /**
   * A method to calculate the amount if someone withdraws money.
   * input amount of the money to withdraw and return the account
   * @return the balance after the withdraw of the Account Object.
   */

    public Account withdraw(Amount amount){
        Amount balance1=new Amount(this.getBalance().getDollar(),this.getBalance().getCent());
        Account account=new Account("this.firstname", "this.lastname", balance1);
        int cents; int count;
        cents= amount.getCent()+amount.getDollar()*CONVERSION_RATE;
        count=balance1.getCent()+balance1.getDollar()*CONVERSION_RATE-cents;
        balance1.setDollar(count/CONVERSION_RATE);
        balance1.setCent(count%CONVERSION_RATE);
        return account;
    }

}
