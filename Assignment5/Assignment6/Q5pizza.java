class Dough{
Dough(){
System.out.println("US Dough added");
}
Dough(int i){
System.out.println("Indian Dough added");
}
}
class Sauce{
Sauce(){
System.out.println("US Sauce added");
}
Sauce(int i){
System.out.println("Indian Sauce added");
}
}
class Cheese{
Cheese(){
System.out.println("US Cheese added");
}
Cheese(int i){
System.out.println("Indian Cheese added");
}
}
class Pepperoni{
Pepperoni(){
System.out.println("US Pepperoni added");
}
Pepperoni(int i){
System.out.println("Indian Pepperoni added");
}
}
class Clams{
Clams(){
System.out.println("US Clams added");
}
Clams(int i){
System.out.println("Indian Clams added");
}
}
interface PizzaIngredientFactory
{
public Dough createDough();
public Sauce createSauce();
public Cheese createCheese();
public Pepperoni createPepperoni();
public Clams createClams();
}
class USPizzaIngredientFactory implements PizzaIngredientFactory{
public Dough createDough() {
return new Dough();
}
public Sauce createSauce() {
return new Sauce();
}
public Cheese createCheese() {
return new Cheese();
}
public Pepperoni createPepperoni() {
return new Pepperoni();
}
public Clams createClams() {
return new Clams();
}
}
class IndianPizzaIngredientFactory implements PizzaIngredientFactory{
public Dough createDough() {
return new Dough(1);
}
public Sauce createSauce() {
return new Sauce(1);
}
public Cheese createCheese() {
return new Cheese(1);
}
public Pepperoni createPepperoni() {
return new Pepperoni(1);
}
public Clams createClams() {
return new Clams(1);
}
}
public class Q5pizza {
public static void main(String[] args) {
PizzaIngredientFactory []arr=new PizzaIngredientFactory[2];
arr[0]=new USPizzaIngredientFactory();
arr[1]=new IndianPizzaIngredientFactory();
for(int i=0;i<arr.length;i++) {
arr[i].createDough();
arr[i].createSauce();
arr[i].createCheese();
arr[i].createPepperoni();
arr[i].createClams();
}
}
}
