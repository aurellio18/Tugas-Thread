/**
 * Class CobaThread
 * 
 * @author Group 5 - PBO 02
 * @version 02/06/2021
 */

public class CobaThread {
	public static void main(String args[]) {
		SavingsAccount savingsAccount = new SavingsAccount(2000);

		WithdrawThread t1 = new WithdrawThread(savingsAccount, 500);
		DepositThread t2 = new DepositThread(savingsAccount, 1000);

		t1.start();
		t2.start();

		System.out.println("Current balance: " + savingsAccount.getBalance());

	}
}