import java.util.ArrayList;
import java.util.HashMap;
import student.*;
import course.*;

public class StudentsSimulation {
	public static HashMap<String,Boolean> usedStudentSimulationMap= new HashMap<String,Boolean>();
	static ArrayList<Course> allCourses=Course.getAllCourses();
	static int deployCounter=1;
	
	public static void usedStudentSimulationMapCreator(){
		usedStudentSimulationMap.put("S1", false);
		usedStudentSimulationMap.put("S2", false);
		usedStudentSimulationMap.put("S3", false);
	}
	public static void studentSimulationsDeployer(Student student) {
		if(deployCounter==1){
			s1Simulation(student);
			deployCounter++;
		}
		else if(deployCounter==2){
			s2Simulation(student);
			deployCounter++;
		}
		else if(deployCounter==3){
			s3Simulation(student);
			System.out.println("All simulation used");
		}
		
	}
	
	public static void s1Simulation(Student student) {
		student.getProfile().setStudentId("12345678");
		student.registerCourseInfo(allCourses.get(0), (float)78, 1);
		student.registerCourseInfo(allCourses.get(1), (float)66, 1);
		student.registerCourseInfo(allCourses.get(2), (float)56, 2019);
		usedStudentSimulationMap.replace("S1", true);	
		
	}
	public static void s2Simulation(Student student) {
		student.getProfile().setStudentId("22345678");
		student.registerCourseInfo(allCourses.get(4), (float)60, 2019);
		student.registerCourseInfo(allCourses.get(3), (float)90, 2);
		student.registerCourseInfo(allCourses.get(2), (float)70, 1);
		usedStudentSimulationMap.replace("S2", true);
		
	}
	public static void s3Simulation(Student student) {
		student.getProfile().setStudentId("32345678");
		student.registerCourseInfo(allCourses.get(5), (float)60, 2019);
		student.registerCourseInfo(allCourses.get(6), (float)60, 1);
		student.registerCourseInfo(allCourses.get(0), (float)60, 2);
		usedStudentSimulationMap.replace("S3", true);
	}
}
