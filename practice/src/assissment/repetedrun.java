package assissment;
import java.util.Scanner;
public class repetedrun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int p=0,n=0,z=0;
		Scanner s=new Scanner(System.in);
        
		for(int i=1;i>0;) {
			System.out.println("enter ur choice:");
			char c=s.next().charAt(0);
			if(c=='y') {
				System.out.println("enter the no:");
				int a=s.nextInt();
				if(a>0) 
					p++;
				else if(a==0) 
					z++;
				else
				n++;
					
			}
			
			else {
				System.out.println("no positive values:"+p);
				System.out.println("no of zeros:"+z);
				System.out.println("no negative values:"+n);
			}
			
		}
s.close();
	}
}
