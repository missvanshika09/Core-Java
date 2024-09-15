public class Demo {
public static void disp(int ...arg) {
int sum=0;
for(int i=0;i<arg.length;i++) {
sum=sum+arg[i];
}
System.out.println("Sum:"+sum);
}
public static void main(String[] args) {
disp(1,2,3,4);
}
}
