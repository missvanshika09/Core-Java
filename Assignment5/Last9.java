/* create interface "Game" , have an abstract method "play()". from this interface implements classes like "Cricket" , "FootBall" and "Tennis".
Now Define one more class 
public class Demo with main function.
In this class have a static method "perform" which will take interface reference as parameter.inside "perform()" see to it that any child object passed ,
its "play()" method should be invoked. Call "perform()" method from main function.
*/
interface game{
    abstract void play();    
}
class cricket implements game{
    public void play(){
        System.out.println("plays cricket");
    }

}
class football implements game{
    public void play(){
        System.out.println("plays football");
    }

}
class tennis implements game{
    public void play(){
        System.out.println("plays tennis");
    }

}
public class Last9 {
    static void perform(game g){
        g.play();
    }
    public static void main(String[] args) {
        perform(new cricket());
        perform(new football());
        perform(new tennis());
    }
    
}
