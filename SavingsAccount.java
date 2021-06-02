/**
 * Class SavingsAccount template untuk membuat akun baru yang berisikan balance dari nasabah
 * 
 * @author Group 5 - PBO 02
 * @version 02/06/2021
 */

public class SavingsAccount {
    private float balance;

    /**
     * Constructor yang dimana value dari balance akan di save
     * 
     * @param balance
     */
    public SavingsAccount(float balance) {
        this.balance = balance;
    }

    /**
     * Merupakan method untuk proses pengeluaran uang dari balance
     * @param anAmount
     */
    public void withdraw(float anAmount) {
        if (anAmount < 0.0) {
            throw new IllegalArgumentException("Withdraw amount negative");
        }
        synchronized (this) {
            if (anAmount <= balance) {
                balance = balance - anAmount;
            }
        }
        // if (anAmount <= balance) {
        // synchronized (this) {
        // balance = balance - anAmount;
        // }
        // }
    }

    /**
     * Merupakan method untuk proses pemasukkan uang dari balance
     * @param anAmount
     */
    public void deposit(float anAmount) {
        if (anAmount < 0.0) {
            throw new IllegalArgumentException("Deposit amount negative");
        }
        synchronized (this) {
            balance = balance + anAmount;
        }
    }

    /**
     * Berfungsi untuk menampilkan value dari balance
     * @return balance
     */
    public float getBalance() {
        return balance;
    }

}
