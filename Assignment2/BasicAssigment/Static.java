class Emp {
  private static int cnt = 11;

    public static int getCnt() {
        return cnt;
    }
}
public class Static {
    public static void main(String[] args) {

        Emp emp1 = new Emp();
        
        System.out.println("Value of count: " + Emp.getCnt()); 
    }
}
