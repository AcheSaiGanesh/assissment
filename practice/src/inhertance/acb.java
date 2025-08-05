package inhertance;
class person{
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}

public class acb {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		person p =new person();
		p.setAge(-236);
		p.setName("sunny");
		if(p.getAge()>0)
			System.out.println(p.getAge());
		else {
			p.setAge(0);
		System.out.println(p.getAge());
		}

	}

}
