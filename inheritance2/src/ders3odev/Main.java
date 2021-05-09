package ders3odev;

import ders3odev.model.Instructor;
import ders3odev.model.Student;
import ders3odev.service.UserManager;

public class Main {

	public static void main(String[] args) {

		Instructor instructor1 = new Instructor();
		instructor1.setId(1);
		instructor1.setFirstName("Engin");
		instructor1.setLastName("Demiroð");
		instructor1.setDateOfBirth(1990);
		instructor1.setPhoneNumber("05555555555");
		instructor1.setNationalIdenty("11111111111");

		Instructor instructor2 = new Instructor();
		instructor2.setId(2);
		instructor2.setFirstName("Kerem");
		instructor2.setLastName("Varýþ");
		instructor2.setDateOfBirth(1989);
		instructor2.setPhoneNumber("06666666666");
		instructor2.setNationalIdenty("22222222222");

		Student student1 = new Student();
		student1.setId(0);
		student1.setFirstName("Ali");
		student1.setLastName("Kaya");
		student1.setDateOfBirth(1998);
		student1.setPhoneNumber("07777777777");
		student1.setNationalIdenty("33333333333");

		UserManager userManager = new UserManager();
		userManager.add(instructor1);
		userManager.update(student1);
		userManager.delete(instructor2);

	}

}
