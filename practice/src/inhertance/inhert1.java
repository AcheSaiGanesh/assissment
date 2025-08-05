package inhertance;
class Dog{
	private String name;
	private String breed;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public void bark()
	{
		System.out.println("woof my name is "+getName());
	}
	
	
}
public class inhert1 {

	public static void main(String[] args) {
		Dog d=new Dog();
		
		d.setName("rushi");
		d.bark();
		// TODO Auto-generated method stub

	}

}
