package com.poi;

public class Login {

	public String LoginSwiggy(String EX) {
		
		if (EX.equals("Pass")) {
			return "LoginPass";
		}
		else{
			return "LoginFail";
		}

	}
}
