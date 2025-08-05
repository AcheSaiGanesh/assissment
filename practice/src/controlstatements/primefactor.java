package controlstatements;
import java.util.Scanner;

public class primefactor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter the no:");
		int a=s.nextInt();
		
		for(int i=1;i<=a;i++) {
			if(a%i==0) {
				int count=0;
				for(int j=1;j<=i;j++) {
					if(i%j==0) {
						count++;
					}
				}
			if (count==2)
				System.out.println(i);
					
			}
		}
		s.close();
	}

}
