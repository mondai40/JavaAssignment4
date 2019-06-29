package generalTranscript;

import java.util.ArrayList;
import java.util.HashMap;

import course.Course;
import semesterTranscript.SemesterTranscript;
import student.Student;

public class GeneralTranscript {
	
	HashMap<Course, Integer> courseIntakeSemester;
	ArrayList<Course> courseList;
	HashMap<Course, Float> courseGradeMap;
	static HashMap<Student,Float> allStudentsGpaMap=new HashMap<Student,Float>();
	
	public GeneralTranscript() {
		super();
		this.courseIntakeSemester=new HashMap<Course, Integer>();
		this.courseList=new ArrayList<Course>();
		this.courseGradeMap=new HashMap<Course, Float>();
		
	}
	

	public static void semesterTranscriptCreator() {
		
		SemesterTranscript.SemesterTranscript();
	}

	public ArrayList<Course> getCourseList() {
		return this.courseList;
	}

	public HashMap<Course, Integer> getCourseIntakeSemester() {
		return this.courseIntakeSemester;
	}

	public HashMap<Course, Float> getCourseGradeMap() {
		return this.courseGradeMap;
	}

	public String getMyGPARanking(Student student) {
		// TODO Auto-generated method stub
		return null;
	}
	

	

}
