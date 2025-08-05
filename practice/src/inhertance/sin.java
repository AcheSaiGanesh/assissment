package inhertance;
class person1{
	String  name;
	int age;
	person1(String name,int age)
	{ this.name=name;
	this.age=age;
	}
	public void displayinfo(String name,int age) {
		System.out.println("name"+name+"age is "+age);
	
	}
}
class student extends person1
{
	int roll=24;
	student(String name,int age,int roll){
		super("sunny",21);
	   this.roll=roll;
	}
	public void displaystudentinfo() {
		System.out.println("name="+name+"age"+age+"roll no"+roll);
		
	}
}

public class sin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	student s1=new student(null, 0, 0);
		s1.displayinfo(null, 0);
		s1.displaystudentinfo();

	}

}
