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
	
	public boolean equals(Object object) {
		Account account = (Account) object;
		if (this.accountNumber == account.accountNumber) {
			return true;
		} else if (this.accountNumber.equals(account.accountNumber.trim())) {
			return true;
		} else {
			return false;
		}
	}

}
