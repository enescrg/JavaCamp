package ders3odev.model;

public class Student extends User{
	String firstName;
	String lastName;
	int dateOfBirth;
	 String nationalIdenty;
	 
	 public Student() {
		 
	 }
	 
	public Student(int id, String phoneNumber, String firstName, String lastName, int dateOfBirth,
			String nationalIdenty) {
		super(id, phoneNumber);
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.nationalIdenty = nationalIdenty;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(int dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getNationalIdenty() {
		return nationalIdenty;
	}

	public void setNationalIdenty(String nationalIdenty) {
		this.nationalIdenty = nationalIdenty;
	}
	
}
