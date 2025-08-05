package controlstatements;
import java.util.Scanner;
public class calc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter the a value:");
		int a=s.nextInt();
		
		System.out.println("enter the  b value:");
		int b=s.nextInt();
		
		System.out.println("enter the operation:");
		char c=s.next().charAt(0);
		
		
		switch(c){
		case '+' :
			System.out.println("addition:"+(a+b));
			break;
		case '-' :
			System.out.println("sub:"+(a-b));
			break;
		case '*' :
			System.out.println("multy:"+(a*b));
			break;
		case '/' :
			System.out.println("div:"+(a/b));
			break;
		case '%' :
			System.out.println("mod:"+(a%b));
			break;
		
	default:
		System.out.println("enter the valid expression:");
		
		}
s.close();
	}
 
}
