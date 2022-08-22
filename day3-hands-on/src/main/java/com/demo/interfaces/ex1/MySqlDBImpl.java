package com.demo.interfaces.ex1;

public class MySqlDBImpl implements MyConnection {

	@Override
	public String getConnectionInfo() {

		return "MySql DB Connected...";
	}

	@Override
	public String getDBDetails() {
 
		return "MySql DB 11g";
	}

}
