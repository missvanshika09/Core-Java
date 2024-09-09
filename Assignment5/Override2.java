//2) create a class "Vehicle", define a method "public void start()" in it. From this class derive a class FourWheeler. How will u override "start()" method of parent class ?

class Vehicle{
    public void start(){
        System.out.println("inside vehicle");
    }
}
class FourWheeler extends Vehicle{
    public void start(){
        System.out.println("inside fourwheeler");
    }
}

public class Override2 {
    public static void main(String[] args) {
        
        Vehicle v=new FourWheeler();
        v.start();
    }
}
