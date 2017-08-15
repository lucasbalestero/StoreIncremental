package baleden.models;

import java.util.ArrayList;
import java.util.List;

public class Store {

	private String name;
	private Float cash;
	
	
	private List<Product> products = new ArrayList<Product>();
	
	public Store() {
		
	}
	
	public Store(String name, Float cash) {
		this.name = name;
		this.cash = cash;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Float getCash() {
		return cash;
	}
	public void setCash(Float cash) {
		this.cash = cash;
	}
	
	public void addProduct(String name, Float price, Integer amount) {
		products.add(new Product(name, price, amount));
	}
	
	public Integer getAmountOfProduct(String name) {
		return products.get(products.indexOf(new Product(name, null, 0))).getAmount();
	}
	
		
	
}
