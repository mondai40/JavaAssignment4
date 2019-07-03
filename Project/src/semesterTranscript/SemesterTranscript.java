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

	
	
	
	

}
