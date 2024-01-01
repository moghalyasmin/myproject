package com.sdat;

import java.util.ResourceBundle;

public class Userlogin {
	int i=0;
	
	public int userlogin(String uname, String upass) {
		
	ResourceBundle rb=ResourceBundle.getBundle("config");
	String username=rb.getString("username");
	String password= rb.getString("password");
	
	if(uname.equals(username) && upass.equals(password))
		return 1;
	else
		return 0;
		
		
	}

}
