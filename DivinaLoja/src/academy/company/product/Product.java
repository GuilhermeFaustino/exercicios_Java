package academy.company.product;

public class Product {
	
	private String product;
	private double price;
	private String type;
	private String color;
	private String category;
	private String department;	
	
	
	public Product(String product, double price, String type, String color, String category, String department) {
		super();
		this.product = product;
		this.price = price;
		this.type = type;
		this.color = color;
		this.category = category;
		this.department = department;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}	
}
