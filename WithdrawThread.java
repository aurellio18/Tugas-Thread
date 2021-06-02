/**
 * Class WithdrawThread - pembuatan thread dengan meng-extend Thread
 * 
 * @author Group 5 - PBO 02
 * @version 02/06/2021
 */

public class WithdrawThread extends Thread {
    SavingsAccount savingsAccount;
    float amount;

    /**
     * 
     * @param savingsAccount
     * @param amount
     */
    WithdrawThread(SavingsAccount savingsAccount, float amount) {
        this.savingsAccount = savingsAccount;
        this.amount = amount;
    }

    /**
     * code yang dijalankan di dalam thread
     */
    public void run() {
        savingsAccount.withdraw(amount);
        System.out.println("After Withdraw : " + savingsAccount.getBalance());
    }
}