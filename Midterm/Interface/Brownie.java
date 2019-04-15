package interfaces;

public class Brownie implements BakedGoods {
	private int price;
	private String description;
	private String sellByDate;
	
	public Brownie(int price, String description, String sellByDate) {
		this.price = price;
		this.description = description;
		this.sellByDate = sellByDate;
	}
	public int getPrice() {
		return  price;
	}
	public String getDescription() {
		return description;
	}
	public String getSellByDate() {
		return sellByDate;
	}
}