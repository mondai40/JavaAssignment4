package semesterTranscript;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import course.Course;
import generalTranscript.*;

	

public class SemesterTranscript extends GeneralTranscript {
	ArrayList<Course> courseList;
	HashMap<Course,Float> coursesGradeMap;
	
	public SemesterTranscript() {
		super();
		this.courseList=new ArrayList<Course>();
		this.coursesGradeMap=new HashMap<Course,Float>();
	}

	@Override
	public void inputCourseInfo(Course course, float courseGrade, int courseIntakeSemester) {
		// TODO Auto-generated method stub
		//super.inputCourseInfo(course, courseGrade, courseIntakeSemester);
		this.courseList.add(course);
		this.coursesGradeMap.put(course, courseGrade);
	}

	@Override
	public float calculateGPA() {
		float sumOfGrades=0;
		float sumOfCredits=0;
		float gpa=0;
		Iterator<Course> it=this.coursesGradeMap.keySet().iterator();
		while(it.hasNext()) {
			Course course=it.next();
			float grade=this.coursesGradeMap.get(course);
			sumOfGrades=sumOfGrades+(course.getCourseUnit()*grade);
			sumOfCredits=sumOfCredits+course.getCourseUnit();
		}
		if(sumOfGrades==0) {
			gpa=0;
		}
		else {
			gpa=sumOfGrades/sumOfCredits;
		}
		return gpa;
	}
	
	
	

}
