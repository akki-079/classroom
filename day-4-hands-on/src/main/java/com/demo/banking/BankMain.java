package com.demo.banking;

import java.util.Scanner;

public class BankMain {

	public static void main(String[] args) throws LowBalanceException {
		Bank bank1 = new Bank();
		int choice = 1;
		Scanner scanner = new Scanner(System.in);
		while (choice !=0) {
			try {
				System.out.println("\nChoose the appropriate option.\n 1. Get Balance\n 2. Deposit Money\n 3. Withdraw money\n 4. Exit");
				choice = scanner.nextInt();
				if(choice == 1) {
					System.out.println("Your current bank balance is "+bank1.getAccountBalance());
				}
				else if(choice == 2) {
					System.out.println("How much amount would you like to deposit?");
					double amount = scanner.nextDouble();
					bank1.accountDeposit(amount);	
				}else if(choice == 3) {
					System.out.println("How much amount would you like to withdraw?");
					double amount = scanner.nextDouble();
					bank1.accountWithdrawal(amount);
				}else if(choice == 4) {
					break;
				}
			}catch(Exception e) {
				System.out.println(e.toString());
			}
		}
		

	}

}
