package account;
import student.*;

import java.util.HashMap;
import java.util.Scanner;

public class Account {
	private String userName;
	private String passWord;
	public static HashMap<String, Student> usernameStudentsMap = new HashMap<String, Student>();
	//static HashMap<Student,HashMap<String,String>> studentAccountPasswordMap;
	
	public Account(Student student) {
		super();
		Scanner s=new Scanner(System.in);
		boolean userNameFlag = false;
		int userNameLeastNum = 6;
		while (!(userNameFlag)) {
			System.out.println("Please enter username");
			String userName=s.nextLine();
			if (userName.length() >= userNameLeastNum) {
				userNameFlag = true;
				this.userName = userName;
			} else {
				System.out.println("The username must be at least 6 characters long.");
			}
		}
		boolean passwordFlag = false;
		int userPasswordNum = 6;
		while (!(passwordFlag)) {
			System.out.println("Please enter your password");
			String passWord=s.nextLine();			
			if (passWord.length() >= userPasswordNum && passWord.matches(".*[0-9].*")) {
				passwordFlag = true;
				this.passWord = passWord;
			} else {
				System.out.println("The password must be at least 6 characters and at least one digit character in it.");
			}
		}
		
		
		
		usernameStudentsMap.put(userName, student);
//		HashMap<String,String> accountPasswordPair=new HashMap<String,String>();
//		accountPasswordPair.put(userName, passWord);
		//studentAccountPasswordMap.put(student, accountPasswordPair);
		
		
	}
	public Account(Student student,String userName) {
		super();		
		this.userName = userName;		
		usernameStudentsMap.put(userName, student);
	}
	public String getUserName() {
		return userName;
	}

	public String getPassWord() {
		return passWord;
	}

	public static HashMap<String, Student> getUsernameStudentsMap() {
		return usernameStudentsMap;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	
	
	
}