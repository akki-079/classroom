package com.demo.banking;


public class Bank {
	Account account1 = new Account();
	
	public double getAccountBalance() {
		return account1.getBalance();
	}
	
	public void accountDeposit(double amount) {
		account1.deposit(amount);
	}
	
	public void accountWithdrawal(double amount) throws LowBalanceException {
		account1.withdraw(amount);
	}
	
}
