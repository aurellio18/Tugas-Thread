/**
 *  @author Group 5 - PBO 02
 * @version 02/06/2021
 * Class CobaThread
 */

class WithdrawThread extends Thread{  
	SavingsAccount savingsAccount;
	float amount;
	/**
	 * 
	 * @param savingsAccount
	 * @param amount
	 */
	WithdrawThread(SavingsAccount savingsAccount, float amount){
		this.savingsAccount = savingsAccount;
		this.amount = amount;
	}
	public void run() {  
		savingsAccount.withdraw(amount);
        System.out.println("Setelah Withdraw : "  + savingsAccount.getBalance());
	}
}

//pembuatan thread dengan meng-extend Thread
class DepositThread extends Thread{  
	SavingsAccount savingsAccount;
	float amount;
	/**
	 * 
	 * @param savingsAccount
	 * @param amount
	 */
	DepositThread(SavingsAccount savingsAccount, float amount){
		this.savingsAccount = savingsAccount;
		this.amount = amount;
	}
	public void run() {  
		savingsAccount.deposit(amount);
        System.out.println("Setelah Deposit : "  + savingsAccount.getBalance());
	}
}

public class CobaThread{
	/**
	 * 
	 * @param args
	 */
	public static void main(String args[]){
		SavingsAccount savingsAccount = new SavingsAccount(2000);
				
		WithdrawThread t1 = new WithdrawThread(savingsAccount, 500);
		DepositThread t2 = new DepositThread(savingsAccount, 1000);
		
		t1.start();
		t2.start();
		
		System.out.println(" Saldo: " + savingsAccount.getBalance());
		

	}
}