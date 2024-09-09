/*Create a class "Top1" with "disp1()" method.
From this class Derive "Bottom1", "Bottom2" and "Bottom3" classes ,override the "disp1()".
Now show how will u achieve dynamic polymorphism.*/


class Top1{
    void disp1(){
        System.out.println("inside top1");

    }
}
class Bottom1 extends Top1{
    void disp1(){
        System.out.println("inside bottom1");

    }    
}
class Bottom2 extends Top1{
    void disp1(){
        System.out.println("inside bottom2");

    }
}
class Bottom3 extends Top1{
    void disp1(){
        System.out.println("inside bottom3");

    }

}
public class Top4 {
    static void perform(Top1 ob){
        ob.disp1();
    }
    public static void main(String[] args) {
        perform(new Bottom1());
        perform(new Bottom2());
        perform(new Bottom3());
    }
}
