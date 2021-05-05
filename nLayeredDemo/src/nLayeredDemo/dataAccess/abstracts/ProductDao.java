package nLayeredDemo.dataAccess.abstracts;

import java.util.List;

import nLayeredDemo.entities.concretes.Product;

public interface ProductDao {
	//veri eriþim yeri
	void add(Product product);
	void update(Product product);
	void delete(Product product);
	Product get(int id);
	Product[] getAll(int id);
	List<Product> getAll();

}
