package Assignment_7;

public class BankAccount {
	private double balance;
	public void deposit(double amount) {
		if(amount>0) {
			balance += amount;
		}
	}
	public double getBalance() {
		return balance;
	}
}
class TestBankAccount{
	public static void main(String[] args) {
		BankAccount b = new BankAccount();
		b.deposit(2000);
		System.out.println("Balance :" + b.getBalance());
	}
}