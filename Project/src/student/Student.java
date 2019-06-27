package student;
import generalTranscript.*;
import semesterTranscript.*;
import profile.*;

import java.util.ArrayList;

public class Student {
	private static ArrayList<Student> allStudents;
	int admissionYear;
	int currentYear;
	GeneralTranscript generalTranscript;
	SemesterTranscript semesterTranscript;
	Profile profile;
	
	public Student() {
		super();
		this.generalTranscript=new GeneralTranscript();
		this.profile=new Profile();
		this.semesterTranscript=GeneralTranscript.semesterTranscriptCreator();
		this.currentYear=this.profile.getCurrentYear();
		this.admissionYear=this.profile.getAdmissionYear();
			
	}
	
	
	public static ArrayList<Student> getAllStudents() {
		return allStudents;
	}


	public int getAdmissionYear() {
		return admissionYear;
	}


	public int getCurrentYear() {
		return currentYear;
	}


	public GeneralTranscript getGeneralTranscript() {
		return generalTranscript;
	}


	public SemesterTranscript getSemesterTranscript() {
		return semesterTranscript;
	}


	public Profile getProfile() {
		return profile;
	}


	public static void showAllStudents() {
		ArrayList<Student> slist=allStudents;
		for(int i=0;i<slist.size();i++) {
			int listCount=i+1;
			System.out.println(listCount+")   "+slist.get(i).getProfile().getName()+": "+slist.get(i).getProfile().getStudentId());
		}
	}
	public void printEnrollmentCertificate() {
		String studentName = this.getProfile().getName();
		char genderSyn = this.getProfile().getGender();
		if ( genderSyn == "M") {
			String gender = "Mr. ";
		} else if ( genderSyn == "F") {
			String gender = "Ms. ";
		} else {
			String gender = "Mr./Ms. ";
		}
		String studentName = this.getProfile().getAddress();
		
		System.out.println("Dear Sir/Madam,");
		System.out.println("");
		System.out.println("This is to certify that "+ gender + studentName +" with student id " + studentID +" is a student at semester "+ semesterNumber+" at CICCC. ");
		System.out.println("He was admitted to our college in " + this.admissionYear + " and has taken 1 course(s) so far. Currently he resides at " + studentAddress+ ".");
		System.out.println("");
		System.out.println("If you have any question, please don’t hesitate to contact us.");
		System.out.println("Thanks,");
//		System.out.println("[Manager’s name: ??? ],");
		System.out.println("");
	}
	public void printMyCourses() {
		
	}
	
}
		