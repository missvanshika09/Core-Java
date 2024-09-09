/* Define interface "A" with "disp1()" method.
Derive from "A", interface "B" with "disp2" method.
Derive class "C" , from "B".
Instantiate class "C" and call its members as well as derived from parent interfaces.*/
interface A{
    abstract void disp1();
}
interface B extends A{
    abstract void disp2();
}
class C implements B{
    public void disp1(){
        System.out.println("in interface a");
    }
    public void disp2(){
        System.out.println("in interface b");
    }
    public void disp3(){
        System.out.println("in class c");
    }
}
public class Interface6 {
    public static void main(String[] args) {
        C ob=new C();
        ob.disp1();
        ob.disp2();
        ob.disp3();
}
}
