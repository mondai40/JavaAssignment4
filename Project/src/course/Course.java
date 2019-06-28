package course;


import java.util.ArrayList;

public class Course {
	private String name;
	private String code;
	private int numberOfUnits;
	private int studentGrade;
	private int numberOfSemester;
	public static ArrayList<Course> allCourses = new ArrayList<Course>();
	
	public Course(String name, String code, int numberOfUnits, Course Course) {
		super();
		this.name = name;
		this.code = code;
		this.numberOfUnits = numberOfUnits;
		this.studentGrade = 0;
		this.numberOfSemester = -1;
		this.allCourses.add(Course);
	}
	
	public String getCourseName() {
		// TODO Auto-generated method stub
		return this.name;
	}

	public String getCourseCode() {
		// TODO Auto-generated method stub
		return null;
	}

	public static ArrayList<Course> getAllCourses() {
		// TODO Auto-generated method stub
		return allCourses;
	}

	public int getCourseUnit() {
		// TODO Auto-generated method stub
		return 0;
	}

}
