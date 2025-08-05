package polymorphism;

public class student {
	public void info(String name,int roll) {
		System.out.println("name od student "+name+"  roll no "+roll);
	}
	public void info(String name,int roll,int marks) {
		System.out.println("name od student "+name+"  roll no "+roll+"  marks are"+marks);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student s=new student();
		s.info("sunny", 21);
		s.info("sunny", 21,98);


	}

}
