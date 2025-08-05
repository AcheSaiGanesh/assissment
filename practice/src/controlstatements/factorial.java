package controlstatements;
import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("enter the no:");
int a=s.nextInt();
int f=1;

for (;a>0;)
		{
	f=f*a;
	a--;
}
		System.out.println("factorial value:"+f);
		s.close();
	}

}