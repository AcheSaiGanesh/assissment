package methods;
import java.util.Scanner;

public class evennum {
	public void odd(int a){


		if(a%2==0)
			System.out.println("even");
		else
			System.out.println("odd");
		
	}

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
