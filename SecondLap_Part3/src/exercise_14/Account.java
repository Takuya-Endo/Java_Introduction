package exercise_14;

public class Account {
	
	private String accountNumber;
	private int balance;
	
	public Account(String accountNumber, int balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	public String toString() {
		return "\\" + this.balance + "（口座番号：" +  this.accountNumber + "）";
	}

}
