package assissment;
import java.util.Scanner;

public class happyno {
public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter the no.");
		int a=s.nextInt();
		int b=0,c=0, d=0;
		while(a!=0) {
			d=a%10;
			b=d*d;
			c=c+b;
			a=a/10;
			
			if(c==1)
				System.out.println("happy no.");
		}
        System.out.println(c);
	}

}
