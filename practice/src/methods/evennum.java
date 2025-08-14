package methods;
import java.util.Scanner;

public class evennum {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter the no.");
		int num=s.nextInt();
		evennum d1=new evennum();
		d1.odd(num);
		s.close();

	}

}
