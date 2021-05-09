package ders3odev.model;

public class Instructor extends User{
	private String firstName;
	private String lastName;
	private int dateOfBirth;
	private String nationalIdenty;
	
	public Instructor() {
		
	}
	
	public Instructor(int id, String PhoneNumber, String firstName, String lastName, int dateOfBirth, String nationalIdenty) {
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
