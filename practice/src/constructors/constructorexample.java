package constructors;

public class constructorexample {
	String billtype;
	int amt;
	float net;
	String name;
	int service_no;
	int phn_no;
	constructorexample(String billtype,String name,int amt){
		System.out.println(" online bill payment for electricity ");
		this.billtype=billtype;
		this.name=name;
		this.amt=amt;
		System.out.println("  bill for electricity: "+amt);
	}
	constructorexample(String billtype,String name,int amt,int service_no){
		System.out.println(" online bill payment for water ");
		this.billtype=billtype;
		this.name=name;
		this.amt=amt;
		this.service_no=service_no;
		System.out.println("  bill for water: "+amt);
	}
	constructorexample(String billtype,String name,int amt,float net){
		System.out.println(" online bill payment for water ");
		this.billtype=billtype;
		this.name=name;
		this.amt=amt;
		this.net=net;
		System.out.println("  bill for internet: "+amt);
	}
	constructorexample(String name,int amt,int phn_no,String billtype){
		System.out.println(" online bill payment for electricity ");
		this.billtype=billtype;
		this.name=name;
		this.amt=amt;
		this.phn_no=phn_no;
		System.out.println("  bill for recharge: "+amt);
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		constructorexample e=new constructorexample ("online","a",350);
		constructorexample e1=new constructorexample ("online","b",500,1234);
		constructorexample e2=new constructorexample ("online","c",450,36);
		constructorexample e3=new constructorexample ("online","d",299,1234567890);
		

	}

}
