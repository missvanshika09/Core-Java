/*6)	Show the example of hierarchical inheritance with constructor invocation.*/

class Parent {
    public Parent(){
        System.out.println("Constructor of Parent");
    }
}
class Child1 extends Parent{
    public Child1(){
        System.out.println("Constructor of Child1 class");
    }
}

class Child2 extends Parent{
    public Child2(){
        System.out.println("Constructor of Child2");
    }
}

class Child3 extends Parent{
    public Child3(){
        System.out.println("Constructor of Child3");
    }
}

class Child4 extends Parent{
    public Child4(){
        System.out.println("Constructor of Child4");
    }
}

public class HierarchicalQ7
{
    public static void main(String[] args)
    {
        //Creating object of all child classes
        Child1 child1 = new Child1();
        Child2 child2 = new Child2();
        Child3 child3 = new Child3();
        Child4 child4 = new Child4();

    }
}
