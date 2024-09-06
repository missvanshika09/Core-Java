/*Define a class “Shape” with “draw()” function . Now derive  classes like “Circle”, “Polygon”,”Rectangle” etc. from “Shape” and override “draw()” function. Define a class “ShapeDemo” in which  write  main()  function. In the main function create a reference to Shape class referring to any of the sub class. Using this reference, call “draw()” and check the result
*/
class Shape{
	void draw() {
		System.out.println("The Shape is being drawn ");
	}
}

class Circle extends Shape{
	void draw() {
		System.out.println("The Shape is circle ");
	}
}

class Polygon extends Shape{
	void draw() {
		System.out.println("The shape is Polygon");
	}
}

class Rectangle extends Shape{
	void draw() {
		System.out.println("the shape is Rectangle ");
	}
}

public class ShapeQ9 {

	public static void main(String[] args) {
		
		Shape s1=new Circle();
		s1.draw();
		Shape s2=new Polygon();
		s2.draw();
		Shape s3=new Rectangle();
		s3.draw();

	}

}

