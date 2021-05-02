package kampDay3Homework;

import model.Instructor;
import model.Student;
import service.InstructorManager;
import service.StudentManager;

public class Main {

	public static void main(String[] args) {

		Student student = new Student(1, "Ahmet", "Kaya", "email", "u", "password", "avatar.jpg");
		StudentManager studentManager = new StudentManager();
		studentManager.add(student);

		
		
		studentManager.getCourses(0);

		
		
		Instructor instructor = new Instructor(2, "Engin", "Demiroð", "engindemirog@gmail.com", "avatar.jpg", "engin",
				"demirog");
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.add(instructor);

		
		
		
		instructorManager.getCourses(0);
	}

}
