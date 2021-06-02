/**
 * Class DepositThread - pembuatan thread dengan meng-extend Thread
 * 
 * @author Group 5 - PBO 02
 * @version 02/06/2021
 */

public class DepositThread extends Thread {
    SavingsAccount savingsAccount;
    float amount;

    /**
     * constructor
     * @param savingsAccount
     * @param amount
     */
    DepositThread(SavingsAccount savingsAccount, float amount) {
        this.savingsAccount = savingsAccount;
        this.amount = amount;
    }

    /**
     * code yang dijalankan di dalam thread
     */
    public void run() {
        savingsAccount.deposit(amount);
        System.out.println("After Deposit : " + savingsAccount.getBalance());
    }
}