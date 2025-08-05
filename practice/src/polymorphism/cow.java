package polymorphism;
class animal{
	public void sound() {
		System.out.println("sound of different animals");
	}
}
class dog extends animal{
	public void sound() {
		System.out.println("sound of dog");
	}
	
}

class cat extends animal{
	public void sound() {
		System.out.println("sound of cat");
	}
	
}

public class cow extends animal {
	public void sound() {
		System.out.println("sound of cow");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cow c=new cow();
		c.sound();

	}

}
