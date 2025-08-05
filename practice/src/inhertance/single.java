package inhertance;
class vehicle{
	String type;
	public void displaytype(String type) {
		System.out.println("type of vehicle "+type);
	}
}
class car extends vehicle
{
	String type;
	public void displaycartype(String  type) {
		System.out.println("type of car "+type);
	}
}
public class single {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    car c=new car();
    c.displaytype("car");
    c.displaycartype("benz");
	}

}
