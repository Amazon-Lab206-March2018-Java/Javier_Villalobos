
import java.util.*;
public class BankAccount {

	private String accountNumber;
	private double checkingBalance;
	private double savingsBalance;
	public static int numberOfAccounts = 0;
	public static int totalAmountOfMoney = 0;

	public BankAccount() {
		numberOfAccounts++;
		accountNumber= Integer.toString(this.accountNumber());
	}
	
	private int accountNumber() {
		Random rnd = new Random();
		return rnd.nextInt(9000000) + 1000000000;
	}
	
	public void depositMoney(String account, int money) {
		if(account == "savings") 
			savingsBalance+=money;
		else 
			checkingBalance+=money;
		totalAmountOfMoney+=money;
		
	}
	public void withdrawMoney(String account, int money) {
		if(account == "savings") 
			savingsBalance-=money;
		else 
			checkingBalance-=money;
		totalAmountOfMoney-=money;
		
	}
	public void totalAmounts() {
		System.out.println("Total checking balance: "+checkingBalance);
		System.out.println("Total savings balance: "+savingsBalance);
		System.out.println("Total amount: "+totalAmountOfMoney);
	}
	
	
	
	//Getters and Setters

	public String getAccountNumber() {
		return accountNumber;
	}

	public double getCheckingBalance() {
		return checkingBalance;
	}

	public double getSavingsBalance() {
		return savingsBalance;
	}

	public static int getNumberOfAccounts() {
		return numberOfAccounts;
	}

	public static int getTotalAmountOfMoney() {
		return totalAmountOfMoney;
	}

}
