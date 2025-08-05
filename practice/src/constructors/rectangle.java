package constructors;

public class rectangle {
	int length;
	int width;
	rectangle(int length,int width){
		this.length=length;
		this.width=width;
	}
	public void area(){
		System.out.println("area of rectangle:"+(length*width));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
rectangle r=new rectangle(4,6);
r.area();
	}

}
