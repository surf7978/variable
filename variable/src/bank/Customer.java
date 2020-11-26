package bank;

public class Customer {
	private String bankAccount;
	private String owner;
	private int balance;
	
	public Customer(String bankAccount, String owner, int balance) {
		super();
		this.bankAccount = bankAccount;
		this.owner = owner;
		this.balance = balance;
	}

	public String getBankAccount() {
		return bankAccount;
	}

	public void setBankAccount(String bankAccount) {
		this.bankAccount = bankAccount;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public void showAccountInfo() {
		System.out.println("계좌번호 : "+this.bankAccount+", 예금주 : "+this.owner+", 잔액 : "+this.balance);
	}
	
	public void showAccNoInfo() {
		System.out.print(this.bankAccount+" ");
	}
	
}
