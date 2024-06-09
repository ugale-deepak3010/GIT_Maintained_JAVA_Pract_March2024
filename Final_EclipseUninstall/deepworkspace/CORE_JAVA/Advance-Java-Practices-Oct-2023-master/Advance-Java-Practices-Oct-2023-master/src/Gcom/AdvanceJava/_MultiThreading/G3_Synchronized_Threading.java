package Gcom.AdvanceJava._MultiThreading;

/*
synchronized is word is allow method to enter one by one.
it will not allow thread to execute parallel 

!try to remove synchronized word!! 
*/

public class G3_Synchronized_Threading {

	static final BankAccount account= new BankAccount(50);
	
	public static void main(String[] args) {
		
		account.topUp(100);
		
		Thread t1= new Thread(() -> {
			ATM.withdraw(account, 100);
		});
		
		Thread t2= new Thread(() -> {
			ATM.withdraw(account, 100);
		});
		
		t1.start();
		t2.start();
		
		
	}

}

class ATM{
	static synchronized void withdraw(BankAccount account, int amount){
		int balance = account.getBalance();
		
		if((balance - amount) <- account.getOverDraft()) {
			System.out.println("Transaction denied!");
		}else {
			account.debit(amount);
			System.out.println("Successfully withdraw "+amount+" rupees !");
		}
		System.out.println("Current balance is: "+account.getBalance());
	}
}

class BankAccount{
	private int balance  = 0;
	private final int overDraft;
	
	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public int getOverDraft() {
		return overDraft;
	}

	public BankAccount(int overdraft) {
		this.overDraft = overdraft;
	}
	
	public void topUp(int amount) {
		balance += amount;
	}
	
	public void debit(int amount) {
		balance -= amount;
	}
}
