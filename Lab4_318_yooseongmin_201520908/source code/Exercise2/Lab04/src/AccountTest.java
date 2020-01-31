import java.util.Scanner;
public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account account1 = new Account("AAA", 500);
		Account account2 = new Account("BBB", 200);
		Scanner input = new Scanner(System.in);
		
		System.out.printf("%s balance is : $%.2f    account number : %d%n", account1.getName(), account1.getBalance(), account1.getAccountNo());
		System.out.printf("%s balance is : $%.2f    account number : %d%n", account2.getName(), account2.getBalance(), account2.getAccountNo());
		System.out.println("After transfer");
		account1.transfer(account2, 100);
		
		System.out.printf("%s balance is : $%.2f    account number : %d%n", account1.getName(), account1.getBalance(), account1.getAccountNo());
		System.out.printf("%s balance is : $%.2f    account number : %d%n", account2.getName(), account2.getBalance(), account2.getAccountNo());
		System.out.println();
		System.out.printf("Enter deposit amount for account1 : ");
		double depositAmount = input.nextDouble();
		System.out.printf("%nadding %.2f to account1 balance%n%n", depositAmount);
		account1.deposit(depositAmount);
		
		System.out.printf("%s balance is : $%.2f%n", account1.getName(), account1.getBalance());
		System.out.printf("%s balance is : $%.2f%n", account2.getName(), account2.getBalance());
		System.out.println();
		System.out.printf("Enter deposit amount for account2 : ");
		depositAmount = input.nextDouble();
		System.out.printf("%nadding %.2f to account2 balance%n%n", depositAmount);
		account2.deposit(depositAmount);

		System.out.printf("%s balance is : $%.2f%n", account1.getName(), account1.getBalance());
		System.out.printf("%s balance is : $%.2f%n", account2.getName(), account2.getBalance());
		
	}

}