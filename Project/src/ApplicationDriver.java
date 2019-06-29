import java.util.HashMap;
import java.util.Scanner;

public class ApplicationDriver {
	public static void main(String[] args) {
		System.out.println("Shin make che \n"
				+ " esy code again");
	}
	
	public void loginView() {
		boolean passLoginView=false;
		while(passLoginView==false) {
		System.out.println("***************************************************************");
		System.out.println("Please enter your account to login:");
		System.out.println("***************************************************************");
		Scanner s=new Scanner(System.in);
		System.out.println("Please enter your account to login:");
		System.out.println("Username:");
		String username=s.nextLine();
		System.out.println("Password:");
		String password=s.nextLine();
		//Create hashMap just to see the availabe methods
		HashMap<String,String> accountsAndPasswords=new HashMap<String,String>();
		if (accountsAndPasswords.containsKey(username)&&accountsAndPasswords.get(username)==password) {
			passLoginView=true;
		}
		else {
			System.out.println("Username of password are wrong.Please try againg");
		}
		}
		System.out.println("***************************************************************");
		System.out.println("Welcome to Cornestone International College of Canada");
		System.out.println("***************************************************************");
		tenOptionsView();
		
	}
	public void tenOptionsView() {
		
	}
}
