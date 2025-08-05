package assissment;
import java.util.Scanner;
public class game {
public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int lvl1=100,lvl2=200,lvl3=300;
		System.out.println("enter the no.of coins u have:");
		int a=s.nextInt();
		if(a<lvl1) 
			System.out.println("no of coins need to reach lvl1:"+(lvl1-a));
		else if(a>lvl1&&a<lvl2)
			System.out.println("u reached lvl1 and no of coins need to reach lvl1:"+(lvl2-a));
		else if(a>lvl2&&a<lvl3)
			System.out.println("u reached lvl2 and no of coins need to reach lvl3:"+(lvl3-a));
		else
			System.out.println("u reached lvl3 and u reached max lvl");
	}
}
