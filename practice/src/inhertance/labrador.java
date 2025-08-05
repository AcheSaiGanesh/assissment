package inhertance;
class animal
{
	public void eat() {
	System.out.println("eaat");
}
	
}
class dog extends animal
{
	public void bark() {
		System.out.println("bark");
	}
}


public class labrador extends dog {
	
	public void displaycolour() {
		System.out.println("dog colour");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		labrador l=new labrador();
		l.eat();
		l.bark();
		l.displaycolour();
		

	}

}
