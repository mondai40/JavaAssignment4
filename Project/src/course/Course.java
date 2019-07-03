package course;


import java.util.ArrayList;

public class Course {
	private String name;
	private String code;
	private int numberOfUnits;
	private int studentGrade;
	private int numberOfSemester;
	public static ArrayList<Course> allCourses = new ArrayList<Course>();

	public Course(String name, String code, int numberOfUnits) {
		super();
		this.name = name;
		this.code = code;
		this.numberOfUnits = numberOfUnits;
		this.studentGrade = 0;
		this.numberOfSemester = -1;
		allCourses.add(this);
	}
	public Course() {
		//This is for first registration
	}
	public static void coursesSimulations() {
	Course c1 = new Course("Objective-C", "MADP101", 3);
	Course c2 = new Course("Object-Oriented Programming", "MADP102", 2);
	Course c3 = new Course("Problem Solving", "MADP201", 1);
	Course c4 = new Course("Project Management", "MADP202", 3);
	Course c5 = new Course("Java Programming", "MADP301", 3);
	Course c6 = new Course("Web Development:", "MADP302", 2);
	Course c7 = new Course("Android Programming", "MADP401", 2);
	Course c8 = new Course("iOS Applications", "MADP402", 3);
	}
	public String getCourseName() {
		return this.name;
	}

	public String getCourseCode() {
		return this.code;
	}

	public static ArrayList<Course> getAllCourses() {
		return allCourses;
	}

	public int getCourseUnit() {
		return this.numberOfUnits;
	}

}
