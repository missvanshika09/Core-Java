/*create abstract class Shape. declare "draw()" function as abstract. From this class define "Triangle","Polygon" and "Circle" .
create an array of Shape having 3 elements.
store child objects into this array . and call
their draw function.*/
abstract class Shape {
    abstract void draw();    
}
class Triangle extends Shape{
    void draw(){
        System.out.println("drawing triangle");
    }
}
class Polygon extends Shape{
    void draw(){
        System.out.println("drawing Polygon");
    }
}
class Circle extends Shape{
    void draw(){
        System.out.println("drawing Circle");
    }
}
public class Abstract5 {
    public static void main(String[] args) {
        Shape arr[]=new Shape[3];
        arr[0]=new Triangle();
        arr[1]=new Polygon();
        arr[2]=new Circle();
        for (int i = 0; i < arr.length; i++) {
            Shape s = arr[i]; 
            s.draw(); 
        }
    
    }
}
