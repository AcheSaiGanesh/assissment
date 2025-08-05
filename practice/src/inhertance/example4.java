package inhertance;
class Product
{
	private String name;
	private double price;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		
		return price;
	}
	public void setPrice(double price) {
		
		this.price = price;
	}
	public void display() {
		System.out.println("name of the product "+name);
		
		
	}
}

public class example4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p=new Product();
		
		p.setName("laptop");
		p.setPrice(-9999);
		p.display();
		if (p.getPrice()>=0) {
			System.out.println("price of the product is  "+p.getPrice());
		}else {
			p.setPrice(0);
			System.out.println("price should be in positive"+p.getPrice());
		}
	}

}
