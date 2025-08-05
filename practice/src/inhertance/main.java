package inhertance;
class Shape{
	public void draw(){
		System.out.println("shape");
	}
}
class Circle extends Shape
{
	public void drawcircle() {
		System.out.println("draw circle");
	}
}

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Circle c=new Circle();
      c.draw();
      c.drawcircle();
	}

}
