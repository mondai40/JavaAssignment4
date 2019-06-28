package account;

import java.util.HashMap;

public class Account {
	private String userName;
	private String passWord;
	HashMap<String, String> studentAccounts = new HashMap<String, String>();
	
	public Account(String userName, String passWord) {
		super();
		this.userName = userName;
		this.passWord = passWord;
	}

	String getUserName() {
		return userName;
	}

	String getPassWord() {
		return passWord;
	}
	
	
}