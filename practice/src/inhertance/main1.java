package inhertance;
class mathutility{
	static int num;
	public static void  square(int num) {
		int res=num*num;
		System.out.println("square of num "+res);
	}
}
class calc extends mathutility
{
	public static void cube(int num) {
		int cub=num*num*num;
		System.out.println("cube of no is"+cub);
	}
}
public class main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
calc c=new calc();
c.square(2);
c.cube(2);

}

}
