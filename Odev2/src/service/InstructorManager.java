package service;

import model.Course;
import model.Instructor;

public class InstructorManager extends UserManager {

	public void add(Instructor instructor) {
		if (!this.requiredFirstName(instructor.getFirstName()) || !this.requiredLastName(instructor.getLastName())) {
			return;
		}
		super.add(instructor);
	}

	public void update(Instructor instructor) {
		if (!this.requiredFirstName(instructor.getFirstName()) || !this.requiredLastName(instructor.getLastName())) {
			return;
		}

		super.update(instructor);
	}

	
	//Override
	public Course[] getCourses(int instructorId) {
		System.out.println("Kurslar listelendi.");
		return new Course[] {};
	}

	private boolean requiredFirstName(String firstName) {
		if (firstName == null || firstName.trim().isEmpty()) {
			System.out.println("Bulunamadý.");
			return false;
		}

		return true;
	}

	private boolean requiredLastName(String lastName) {
		if (lastName == null || lastName.trim().isEmpty()) {
			System.out.println("Bulunamadý.");
			return false;
		}

		return true;
	}
}
