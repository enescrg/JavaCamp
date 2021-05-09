package interfaces;

//varlýk, özellik tutucu
public class Customer { //customer: müþteri
	private int id;
	private String firstName;
	private String lastName;
	
	//constructor
	public Customer() {
		
	}
	//constructor
	public Customer(int id, String firstName, String lastName) {
		//super(): onu inherit(extends) eden bir class varsa onun parametresiz constructorunu da çalýþtýrýr. 
		//parametreli de ona parametre ekleyerek kullanabilirsiniz
		super(); 
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
	
	
	
	
}
