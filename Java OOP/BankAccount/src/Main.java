
public class Main {

	public static void main(String[] args) {
		BankAccount account = new BankAccount();
		account.depositMoney("checking", 1040000);
		System.out.println(account.getSavingsBalance());
		System.out.println(account.getCheckingBalance());
		System.out.println(BankAccount.getTotalAmountOfMoney());
	}

}
