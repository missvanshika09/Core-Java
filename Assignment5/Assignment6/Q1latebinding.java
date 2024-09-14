abstract class Course
{
public void start()
{
System.out.println("Start process");
}
public abstract double getFee();
public abstract void evaluate();
}
class DACDBDACourse extends Course{
public double getFee() {
return 150000.00;
}
public void evaluate() {
System.out.println("DAC DBDA Evaluation");
}
}
class MSCitCourse extends Course{
public double getFee() {
return 15000.00;
}
public void evaluate() {
System.out.println("MSCIT Evaluation");
}
}
public class Q1latebinding {
public static void perform(Course ref) {
ref.start();
System.out.println(ref.getFee());
 ref.evaluate();
}
public static void main(String []args) {
perform(new DACDBDACourse());
perform(new MSCitCourse());
}
}
