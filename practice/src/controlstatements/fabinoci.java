package controlstatements;
import java.util.Scanner;

public class fabinoci {
public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter the value:");
		int a=s.nextInt();
		int f=0;
	    int f1=0,f2=1;
	    
	          System.out.println("0");
	          System.out.println("1");
	          
		for(int i=0;i<a;i++) {
			
			
			int n=f1+f2;
			f1=f2;
			f2=n;
			 System.out.println(n);
			 
		
			
		}
		
s.close();
	}
     
}
