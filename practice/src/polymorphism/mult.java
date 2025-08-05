package polymorphism;

public class mult {
	int a,b;
	public int multiply(int a,int b) {
		int res=a*b;
		return res;
	}
	public int multiply(int a,int b,int c) {
		int res=a*b*c;
		return res;
	}
	public int multiply(double a,int b) {
		int res=(int) (a*b);
		return (int) res;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mult m=new mult();
		System.out.println("int 1 and int2 is "+m.multiply(1, 6));
		System.out.println("int 1 and int2  "+m.multiply(1, 6,5));
		System.out.println("double 1 and int2  "+m.multiply(1l, 6));
	}

}
