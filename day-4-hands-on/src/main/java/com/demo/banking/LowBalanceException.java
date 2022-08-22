package com.demo.banking;

public class LowBalanceException extends Exception {

	public LowBalanceException(String string) {
		super(string);
	}
	
	@Override
	public String toString() {
		return getClass().getName()+" : "+super.getMessage();
	}

}
