package constructors;

public class student {
	String name;
	int age;
	float gpa;
	student(String name,int age,float gpa){
		this.name=name;
		this.age=age;
		this.gpa=gpa;
	}
	student(String name,int age){
		this.name=name;
		this.age=age;
		
	}
    public void displaygpa() {
    	System.out.println(gpa);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student s1=new student("a",21,9);
		student s2=new student("b",22);
		s1.displaygpa();
		s2.displaygpa();

	}

}
