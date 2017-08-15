package baleden.models;

import java.util.ArrayList;
import java.util.List;

public class Player {
	
	private String name;
	private Float money;
	
	private List<Store> stores;
	
	
	public Player() {
		stores = new ArrayList<Store>();
	}
	
	public Player(String name, Float money) {
		stores = new ArrayList<Store>();
		this.name = name;
		this.money = money;
	}
	
	public void addStore(Store store) {
		this.stores.add(store);
	}
	
	public void addStore(String name, Float cash) {
		this.stores.add(new Store(name, cash));
		this.money = this.money - cash;
	}
	
	public List<Store> getStores() {
		return stores;
	}

	public void setStores(List<Store> stores) {
		this.stores = stores;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Float getMoney() {
		return money;
	}
	public void setMoney(Float money) {
		this.money = money;
	}
	
	
	
}
