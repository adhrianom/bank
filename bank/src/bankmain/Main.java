package bankmain;

import java.util.Scanner;

import entities.bankend;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		bankend account;
		
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		
		
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		
		System.out.print("Is there na initial deposit (y/n)? ");
		char response = sc.next().charAt(0);
		
		if (response == 'y') {
			System.out.print("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			account = new bankend(number, holder, initialDeposit);
			
		}
		
		else {
			account = new bankend(number, holder);
		}
		
		System.out.println();
		System.out.println("Account data:");
		System.out.println(account);
		
		System.out.print("Enter the deposit value: ");
		double depositValue = sc.nextDouble();
		account.deposit(depositValue);
		System.out.println("Updated account data:");
		System.out.println(account);
		
		System.out.print("Enter a withdraw value: ");
		double withdrawValue = sc.nextDouble();
		account.withdraw(withdrawValue);
		System.out.println("Updated account data:");
		System.out.println(account);
		
		
			
		
			
	
		
		
		
		
sc.close();
	}

}
