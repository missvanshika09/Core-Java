abstract class Shape{
public void show() {
System.out.println("Show Shape");
}
abstract void draw();
}
class Triangle extends Shape{
void draw() {
System.out.println("Draw Triangle");
}
}
class Polygon extends Shape{
void draw() {
System.out.println("Draw Polygon");
}
}
class Circle extends Shape{
void draw() {
System.out.println("Draw Circle");
}
}
public class ShapeDemo {
public static void main(String[] args) {
Shape[] arr=new Shape[3];
arr[0]=new Triangle();
arr[1]=new Polygon();
arr[2]=new Circle();
for(int i=0;i<arr.length;i++) {
arr[i].draw();
arr[i].show();
}
}
}
