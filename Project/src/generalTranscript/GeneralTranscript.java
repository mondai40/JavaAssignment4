package generalTranscript;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import course.Course;
import semesterTranscript.SemesterTranscript;
import student.Student;

public class GeneralTranscript {
	
	HashMap<Course, Integer> courseIntakeSemester;
	ArrayList<Course> courseList;
	HashMap<Course, Float> takenCoursesGradeMap;
	static HashMap<Student,Float> allStudentsGpaMap=new HashMap<Student,Float>();
	
	public GeneralTranscript() {
		super();
		this.courseIntakeSemester=new HashMap<Course, Integer>();
		this.courseList=new ArrayList<Course>();
		this.takenCoursesGradeMap=new HashMap<Course, Float>();
		
	}
	
	public void inputCourseInfo(Course course, float courseGrade,int courseIntakeSemester) {
		this.courseList.add(course);
		if(courseGrade>0) {
				this.takenCoursesGradeMap.put(course, courseGrade);
		}
		this.courseIntakeSemester.put(course, courseIntakeSemester);
		
			
	}

//	public  void semesterTranscriptUpdater(Course courseName, Student student) {
//		if(this.courseIntakeSemester.get(courseName)==2019) {
//			//TODO use setter of SemesterTranscript.
//			student.getSemesterTranscript().updater(courseName);
//		}
		


	public ArrayList<Course> getCourseList() {
		return this.courseList;
	}

	public HashMap<Course, Integer> getCourseIntakeSemester() {
		return this.courseIntakeSemester;
	}

	public HashMap<Course, Float> getCourseGradeMap() {
		return this.takenCoursesGradeMap;
	}

	public String getMyGPARanking(Student student) {
		// TODO Auto-generated method stub
		return null;
	}
	

	

}
