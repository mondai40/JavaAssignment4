import java.util.HashMap;
import java.util.Scanner;

import account.Account;
import student.Student;
//import studentObjectsCreator.*;


public class ApplicationDriver {
	public static void main(String[] args) {
		loginView();
	}
	
	
	public static void loginView() {
		boolean passLoginView=false;
		while(passLoginView==false) {
		System.out.println("***************************************************************");
		System.out.println("Please enter your account to login:");
		System.out.println("***************************************************************");
		Scanner s=new Scanner(System.in);
		System.out.println("Please enter your account to login:  *if you dont have an user type 'register'");
		System.out.println("Username:");
		String username=s.nextLine();
		if(username=="register") {
			//String studentObjName=StudentObjectsCreator.createName();
			//Student StudentObjectsCreator.createName()=new Student();
			new Student();
		}
		else {
		System.out.println("Password:");
		String password=s.nextLine();
		//Create hashMap just to see the available methods
		HashMap<String,Student> accountsAndPasswords=Account.getUsernameStudentsMap();
		Student logingStudent=accountsAndPasswords.get(username);
		if (accountsAndPasswords.containsKey(username)&&logingStudent.getAccount().getPassWord()==password) {
			passLoginView=true;
		}
		else {
			System.out.println("Username of password are wrong.Please try againg");
		}
		}
		}
		System.out.println("***************************************************************");
		System.out.println("Welcome to Cornestone International College of Canada");
		System.out.println("***************************************************************");
		tenOptionsView();
		
		//}
	}
	public static void tenOptionsView() {
		System.out.println("the next is not implemented so far");
		
	}
}
