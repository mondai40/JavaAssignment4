package semesterTranscript;

import java.util.ArrayList;

import course.Course;
import generalTranscript.*;

	

public class SemesterTranscript extends GeneralTranscript {
	ArrayList<Course> courseList;
	
	public SemesterTranscript() {
		super();
		this.courseList=new ArrayList<Course>();
	}

	@Override
	public void inputCourseInfo(Course course, float courseGrade, int courseIntakeSemester) {
		// TODO Auto-generated method stub
		//super.inputCourseInfo(course, courseGrade, courseIntakeSemester);
		this.courseList.add(course);
	}
	
	
	

}
