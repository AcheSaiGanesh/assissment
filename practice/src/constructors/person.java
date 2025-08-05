package constructors;


public class person {
	  String name;
	  int age;
	person(String name,int age){
		this.name=name;
		this.age=age;
		
	}
	public void display() {
		System.out.println("i am "+name+" and my age is "+age);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		person p=new person("sunny",21);
		p.display();

	}

}
