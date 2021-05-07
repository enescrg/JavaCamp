package ders2odev;

public class Main {

	public static void main(String[] args) {
		
		Course course = new Course(2,"Yazýlým geliþtirici ve yetiþtirme kampý(C# + ANGULAR)");
		course.getId();
		course.getName();
		
		Course course2 = new Course(3,"Yazýlým geliþtirici ve yetiþtirme kampý(JAVA + REACT)");
		course2.getName();
		
		
		CourseManager courseManager = new CourseManager();
		courseManager.add();
	}

}
