package exercise_14;

public class BankAccount {
	
	private String accountNumber;
	private int balance;
	
	public BankAccount(String accountNumber, int balance) {
		
		this.accountNumber = accountNumber;
		this.balance = balance;
		
	}
	
	public String toString() {
		
		return "\\" + this.balance + "（口座番号：" + this.accountNumber + "）";
		
	}

}
