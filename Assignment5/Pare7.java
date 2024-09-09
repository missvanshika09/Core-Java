/*Define class "Parent1" with some data.
Define interface "Parent2" with some methods.
Derive a class "Child" from "Parent1" and "Parent2", instantiate it and call the members.*/

class Parent1{
    int k=10;
    void disp2(){
        System.out.println("value of k: "+k);
    }
}
interface Parent2{
    abstract void disp1();
}
class Child extends Parent1 implements Parent2{
    public void disp1(){
        System.out.println("in interface parent2");
    }
}

public class Pare7 {
    public static void main(String[] args) {
        Child ch=new Child();
        ch.disp2();
        ch.disp1();
}
}
