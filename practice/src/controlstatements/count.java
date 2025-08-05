package controlstatements;

public class count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=1121,i=1,count=0;
		while(a>0) {
			a=a/10;
			count++;
		}
         System.out.println("no of integers:"+count);
	}
  
}
