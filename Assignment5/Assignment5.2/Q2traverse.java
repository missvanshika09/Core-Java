abstract class Beverages {
public void addMilk() {
System.out.println("Add milk");
}
abstract void addIngredients();
}
class Coffee extends Beverages
{
void addIngredients()
{
System.out.println("Coffee ingredients added");
}
}
class Tea extends Beverages
{
void addIngredients()
{
System.out.println("Tea ingredients added");
}
}
class FruitJuice extends Beverages
{
void addIngredients()
{
System.out.println("FruitJuice ingredients added");
}
}
public class Q2traverse {
public static void main(String[] args) {
Beverages[] arr=new Beverages[3];
arr[0]=new Coffee();
arr[1]=new Tea();
arr[2]=new FruitJuice();
for(int i=0;i<arr.length;i++) {
arr[i].addIngredients();
arr[i].addMilk();
}
}
}
