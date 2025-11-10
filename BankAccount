public class BankAccount{
	private String accountNumber;
	private String ownerName;
	private double balance;
	private String currency;
	private boolean isActive;
	
	public BankAccount(){
		this("00_00_00", "Name", 0.0, "$", false);
	}
	
	public BankAccount(String accountNumber, String ownerName){
		this(accountNumber, ownerName, 0.0, "$", false); 
	}
	
	public BankAccount(String accountNumber, String ownerName, double balance, String currency, boolean isActive){
		this.accountNumber = accountNumber;
		this.ownerName = ownerName;
		this.balance = balance;
		this.currency = currency;
		this.isActive = isActive;
	}
	
	public String displayInfo(){
		return accountNumber + "\n" +  ownerName + "\n" + balance + "\n" + currency + "\n" + isActive;
	}
	public void deposit(double amount){
		balance = balance + amount;
	}
	public void withdraw(double amount){
		if (balance >= amount){
			balance = balance - amount;
		}
	}
	public void activateAccount(){
		isActive = true;
	}
	public void withdraw(){
		isActive = false;
	}
}
