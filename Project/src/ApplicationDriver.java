import java.util.Scanner;

public class ApplicationDriver {
	public static void main(String[] args) {
		System.out.println("Shin make che \n"
				+ " esy code again");
	}
	
	public void loginView() {
		boolean passLoginView=true;
		System.out.println("***************************************************************");
		System.out.println("Please enter your account to login:");
		System.out.println("***************************************************************");
		Scanner s=new Scanner(System.in);
		System.out.println("Please enter your account to login:");
		System.out.println("Username:");
		String username=s.nextLine();
		System.out.println("Password:");
		String password=s.nextLine();
		
	}
}
