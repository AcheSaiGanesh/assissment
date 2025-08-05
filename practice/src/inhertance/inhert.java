package inhertance;
class rectangle{
	private double length;
	private double width;
	public double getLength() {
		return length;
	}
	public void setLength( double length) {
		this.length = length;
	}
	public double Width() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public void getarea() {
		double area;
		area=length*width;
		System.out.println("area"+area);
		
	}
	public void getperimeter() {
		double perimeter;
		perimeter=2*(length+width);
		System.out.println("perimeter"+perimeter);
	}
	
}

public class inhert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		rectangle r=new rectangle();
		r.setLength(4);
		r.setWidth(5);
		
		r.getarea();
		r.getperimeter();

	}

}
