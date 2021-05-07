package oopÝntro;

public class Product { //özellik tutucu class
	
	//constructor bloðu , yapýcý blok
	//encapsulation
	//bunlarý sadece içeriden okumaya kapatýyoruz. get ile setle kontrol edicez
	private int id;
	private String name;
	private double unitPrice;
	private String detail;
	private double discount; //indirim
	
	
	public Product() {
		
	}
	
	public Product(int id, String name, double unitPrice, String detail, double discount, double unitPriceAfterDiscount) {
		super(); //parametresiz olaný da çalýþtýr
		this.id = id;
		this.name = name;
		this.unitPrice = unitPrice;
		this.detail = detail;
		this.discount = discount;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name; //return, bu method bir deðer döndürüyor ve bne bir yere atayacaðým
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public double getUnitPriceAfterDiscount() {
		return this.unitPrice - (this.unitPrice * this.discount / 100);
	}
	

	
	
	
}
