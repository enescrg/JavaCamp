package ders3odev.model;

public class User {

	private int id;
	private String phoneNumber;

	public User() {

	}

	public User(int id, String phoneNumber) {
		super();
		this.id = id;
		this.phoneNumber = phoneNumber;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

}
