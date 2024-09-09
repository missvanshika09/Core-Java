/* Define a class "base1" with only parameterized constructor.
Derive a class "sub1" from "base1". This class should have following constructors
	a) Default
	b) one parameter
	c) two parameter
Now try to instantiate "sub1" , using any of the above mentioned constructors.
*/

class Base1{
    Base1(int k){
        System.out.println("value of k: "+k);
    }
}
class sub1 extends Base1{
    sub1(){
        super(10);
        System.out.println("default constructor of sub1");
    }
    sub1(int n){
        super(n);
        System.out.println("1 param constructor in sub1:");
    }
    sub1(int n, int z){
        super(n+z);
        System.out.println("2 param constructor in sub1:");
    }
}
public Parameter8 {
    public static void main(String[] args) {
        sub1 s=new sub1(4,8);
        
    }
    
}
