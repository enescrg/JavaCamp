package inheritance; //mülakatta ne diye sorulur

public class Main { //****bir class ne yapabiliyorsa sadece onlarý yapabilmeli, bugfree: bugsuz demek

	public static void main(String[] args) {
		
		individualCustomer engin = new individualCustomer();
		engin.customerNumber="12345";
		
		CorporateCustomer hepsiBurada = new CorporateCustomer();
		hepsiBurada.customerNumber="78910";
		
		SendikaCostumer abc = new SendikaCostumer();
		abc.customerNumber="99999";
		
		CustomerManager customerManager = new CustomerManager();
		customerManager.add(hepsiBurada);
		customerManager.add(engin);
		customerManager.add(abc);
		
		System.out.println("--------------");
		
		Customer[] customers = {engin,hepsiBurada,abc};
		
		customerManager.addMultiple(customers);

	}

}
