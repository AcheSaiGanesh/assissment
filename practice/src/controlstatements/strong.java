package controlstatements;
import java.util.Scanner;

public class strong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s =new Scanner(System.in);
		int a=s.nextInt();
		int b=a,f=1,c=1;
		for(;a!=0;a=a%10) {
			for (;a>0;)
			{
		f=f*a;
		c=c+f;
		a--;
			
		}
 if(c==b) 
	 System.out.println("strong no");
 
 else
	 System.out.println("not a strong no.");
	}
s.close();
	}
}