package com.demo.interfaces.ex0;

public class NoInterfaceMain {

	public static void main(String[] args) {
		OracleImpl oracle = new OracleImpl();
		System.out.println(oracle.getOracleConnectionInfo());
		System.out.println(oracle.getOracleDBDetails());
	}

}
