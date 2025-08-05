package constructors;

public class personextend {
	String name;
	int age;
	private int salary;
	personextend(String name,int age,int salary){
		this.name=name;
		this.age=age;
		this.salary=salary;
		
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
}
 class employee extends personextend
 {
	 employee(){
		 super("abc",21,30000);
	 }
	 public void display() {
		 System.out.println("salary:"+getSalary());
	 }
 
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		employee e =new employee();
		e.display();
	}

 }
