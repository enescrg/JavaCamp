package ders2odev;

public class Main {

	public static void main(String[] args) {
		
		Course course = new Course(2,"Yaz�l�m geli�tirici ve yeti�tirme kamp�(C# + ANGULAR)");
		course.getId();
		course.getName();
		
		Course course2 = new Course(3,"Yaz�l�m geli�tirici ve yeti�tirme kamp�(JAVA + REACT)");
		course2.getName();
		
		
		CourseManager courseManager = new CourseManager();
		courseManager.add();
	}

}
