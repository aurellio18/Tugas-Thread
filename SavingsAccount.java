/**
 *  @author Group 5 - PBO 02
 * @version 02/06/2021
 * Class Savings Account
 */

public class SavingsAccount
{
    private float balance;

    public SavingsAccount(float balance){
        this.balance = balance;
    }

    /**
     * 
     * @param anAmount
     */

    public void withdraw(float anAmount)
    {
        if (anAmount<0.0){
        throw new IllegalArgumentException("Withdraw amount negative");
        }
        /**
         * synchronized(this) {
        if (anAmount<=balance){balance = balance - anAmount;}
        }

         */
        if (anAmount<=balance) {
            synchronized(this){balance = balance - anAmount;}
        }
                
    }


    /**
     * 
     * @param anAmount
     */
    public void deposit(float anAmount)
    {
        if (anAmount<0.0){
        throw new IllegalArgumentException("Deposit amount negative");
        }
        synchronized(this)
        {
        balance = balance + anAmount;
        }
    }

    /**
     * 
     * @return balance
     */
    public float getBalance(){
        return balance;
    }

}
