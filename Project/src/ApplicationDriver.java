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
		Student logingStudent = null;
		boolean passLoginView=false;
		while(passLoginView==false) {
			System.out.println("***************************************************************");
			System.out.println("Please enter your account to login:");
			System.out.println("***************************************************************");
			Scanner s=new Scanner(System.in);
			System.out.println("Please enter your account to login:  *if you dont have an user type 'register'");
			System.out.println("Username:");
			String username=s.nextLine();

			String register="register";
				boolean b1=username.equalsIgnoreCase(register);
				System.out.println("username is register: "+b1);
				if(b1) {
				//String studentObjName=StudentObjectsCreator.createName();
				//Student StudentObjectsCreator.createName()=new Student();
				System.out.println("follow the instructions to register.");
				new Student();
				}
				else {
					System.out.println("Password:");
					String password=s.nextLine();
					//Create hashMap just to see the available methods
					HashMap<String,Student> accountsAndPasswords=Account.getUsernameStudentsMap();
					logingStudent=accountsAndPasswords.get(username);
//					//boolean test start
//					System.out.println("username in map: "+accountsAndPasswords.containsKey(username));
//					System.out.println(password.contentEquals(logingStudent.getAccount().getPassWord()));
//					//boolean test end*******
					boolean b2=accountsAndPasswords.containsKey(username);
					boolean b3=password.contentEquals(logingStudent.getAccount().getPassWord());
					
					if (b2 && b3) {
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
		tenOptionsView(logingStudent);
		
		//}
	}
	public static void tenOptionsView(Student student) {
		Scanner s = new Scanner(System.in);
		boolean flag = false;
		while (!(flag)) {
			System.out.println("************************************************************");
			System.out.println("Select from the options:");
			System.out.println("************************************************************");
			System.out.println("—-[1] Print my enrolment certificate");
			System.out.println("—-[2] Print my courses");
			System.out.println("—-[3] Print my transcript");
			System.out.println("—-[4] Print my GPA");
			System.out.println("—-[5] Print my ranking among all students in the college");
			System.out.println("—-[6] List all available courses");
			System.out.println("—-[7] List all students");
			System.out.println("—-[8] Show My Profile");
			System.out.println("-—[9] Logout");
			System.out.println("-—[10] Exit");
			System.out.println("************************************************************");
			System.out.println("Enter the number corresponding to each item to proceed:");
			int chosenNumber = s.nextInt();
			switch(chosenNumber) {
				case 1:
					//call printEnrollmentCertificate()
					switchcase1(student);
					break;
				case 2:
					//call printMyCourses()
					switchcase2(student);
					break;
				case 3:
					//call printGeneralTranscript()
					switchcase3(student);
					break;
				case 4:
					//call printGPA()
					switchcase4(student);
					break;
				case 5:
					//call printMyRanking()
					switchcase5(student);
					break;
				case 6:
					//call printAvailableCourses()
					switchcase6(student);
					break;
				case 7:
					//call printAllStrudens()
					switchcase7(student);
					break;
				case 8:
					//call printMyProfile()
					switchcase8(student);
					break;
				case 9:
					flag = true;
					break;
				case 10:
					System.out.println("Bye");
					System.exit(0);
			}
		}
		loginView();
	}
	public static void switchcase1(Student student) {
		System.out.println("===========================================");
		student.printEnrollmentCertificate();
		Scanner s=new Scanner(System.in);
		System.out.println();
		System.out.println("===========================================");
		System.out.println("Plz Press any key to return");
		String case8=s.nextLine();
	}
	public static void switchcase2(Student student) {
		System.out.println("===========================================");
		student.printMyCourses();
		Scanner s=new Scanner(System.in);
		System.out.println();
		System.out.println("===========================================");
		System.out.println("Plz Press any key to return");
		String case8=s.nextLine();
	}
	public static void switchcase3(Student student) {
		System.out.println("===========================================");
		student.printGeneralTranscript();
		Scanner s=new Scanner(System.in);
		System.out.println();
		System.out.println("===========================================");
		System.out.println("Plz Press any key to return");
		String case8=s.nextLine();
	}
	public static void switchcase4(Student student) {
		System.out.println("===========================================");
		student.printGPA();
		Scanner s=new Scanner(System.in);
		System.out.println();
		System.out.println("===========================================");
		System.out.println("Plz Press any key to return");
		String case8=s.nextLine();
	}
	public static void switchcase5(Student student) {
		System.out.println("===========================================");
		student.printMyRanking();
		Scanner s=new Scanner(System.in);
		System.out.println();
		System.out.println("===========================================");
		System.out.println("Plz Press any key to return");
		String case8=s.nextLine();
	}
	public static void switchcase6(Student student) {
		System.out.println("===========================================");
		student.printAvailableCourses();
		Scanner s=new Scanner(System.in);
		System.out.println();
		System.out.println("===========================================");
		System.out.println("Plz Press any key to return");
		String case8=s.nextLine();
	}
	public static void switchcase7(Student student) {
		System.out.println("===========================================");
		student.printAllStrudens();
		Scanner s=new Scanner(System.in);
		System.out.println();
		System.out.println("===========================================");
		System.out.println("Plz Press any key to return");
		String case8=s.nextLine();
	}
	public static void switchcase8(Student student) {
		System.out.println("===========================================");
		student.printMyProfile();
		Scanner s=new Scanner(System.in);
		System.out.println();
		System.out.println("===========================================");
		System.out.println("Plz Press any key to return");
		String case8=s.nextLine();
	}
}

















