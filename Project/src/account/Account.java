package account;
import student.*;

import java.util.HashMap;
import java.util.Scanner;

public class Account {
	private String userName;
	private String passWord;
	public static HashMap<String, Student> accountsAndPasswords = new HashMap<String, Student>();
	//static HashMap<Student,HashMap<String,String>> studentAccountPasswordMap;
	
	public Account(Student student) {
		super();
		Scanner s=new Scanner(System.in);
		System.out.println("Please username");
		String userName=s.nextLine();
		this.userName = userName;
		System.out.println("Please enter your password");
		String passWord=s.nextLine();
		this.passWord = passWord;
		accountsAndPasswords.put(userName, student);
//		HashMap<String,String> accountPasswordPair=new HashMap<String,String>();
//		accountPasswordPair.put(userName, passWord);
		//studentAccountPasswordMap.put(student, accountPasswordPair);
		
		
	}

	String getUserName() {
		return userName;
	}

	String getPassWord() {
		return passWord;
	}
	
	
}