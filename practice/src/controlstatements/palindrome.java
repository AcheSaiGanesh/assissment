package controlstatements;
import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter the value:");
		int a=s.nextInt();
		int o=a;
		int r=0;
		
		for(;a!=0;a/=10) {
			int d=a%10;
			r=r*10+d;
		}
		if(o==r) {
			System.out.println("palindrome");
		}
		else
			System.out.println("not a palndrome");
		s.close();
	}

}
