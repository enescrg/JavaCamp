package ders2odev;

public class Course {
	
	private int id;
	private String name;
	
	
	public Course() {
		
	}


	public Course(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	

	
	public int getId() {
		System.out.println("Id getirildi: "+id);
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		System.out.println("Ýsim getirildi: "+name);
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
