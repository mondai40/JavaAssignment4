package profile;

import java.util.Scanner;

public class Profile {

	private int currentYear;
	private int admissionYear;
	private int age;
	private String name;
	private String lastName;
	private String address;
	private String country;
	private char gender;
	private double gpa;
	private String studentId;
	
	
	
	public Profile() {
		super();
		Scanner s=new Scanner(System.in);
		System.out.println("Please Enter Your Name");
		this.name=s.nextLine();
		System.out.println("Please Enter Your Lastname");
		this.lastName=s.nextLine();
		System.out.println("Please Enter Your Gender (M/F/O");
		this.gender=s.nextLine().charAt(0);
		System.out.println("Please Enter Your Country of origin");
		this.country=s.nextLine();
		System.out.println("Please Enter Your year of admission");
		this.admissionYear=s.nextInt();
		System.out.println("Please Enter Your year of age");
		this.age=s.nextInt();
		this.currentYear=-1;
		this.gpa=-1.0;
		this.studentId="-1";
		
	
		
	}



	

	public int getCurrentYear() {
		return currentYear;
	}

	public int getAdmissionYear() {
		return admissionYear;
	}

	public String getName() {
		// TODO Auto-generated method stub
		
		return name;
	}

	public int getStudentId() {
		// TODO Auto-generated method stub
		return 0;
	}

	public char getGender() {
		// TODO Auto-generated method stub
		return gender;
	}
	
	
	public void setCurrentYear(int currentYear) {
		this.currentYear = currentYear;
	}





	public void setGpa(double gpa) {
		this.gpa = gpa;
	}





	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}





	public void getAllProfile() {
		
		System.out.println("Name: "+this.name+" "+this.lastName);
		System.out.println("StudentID: "+this.studentId);
		System.out.println("Gender: "+this.gender);
		System.out.println("Address: "+this.address);
		System.out.println("Country of Origint: "+this.country);
		System.out.println("Age: "+this.age);
		System.out.println("Year of Admission: "+this.admissionYear);
		System.out.println("Overall GPA: "+this.gpa);
		//TODO
		//An Student Class or mainDriver method that call this method has to call the courses list that is on generalTranscript File.		
	}
	
	

}
