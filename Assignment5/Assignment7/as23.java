class Course1
{
public void start()
{
System.out.println("Course starts");
}
public void stop()
{
System.out.println("Course ends");
}
}
class DACDBDACourse1 extends Course1{
public void start()
{
System.out.println("DACDBDACourse starts");
}
public void stop()
{
System.out.println("DACDBDACourse ends");
}
public void orientation() {
System.out.println("DACDBDACourse orientation");
}
}
class MSCIT extends Course1{
public void start()
{
System.out.println("MSCITCourse starts");
}
public void stop()
{
System.out.println("MSCITCourse ends");
}
}
class BASIC extends Course1{
public void start()
{
System.out.println("BASICCourse starts");
}
public void stop()
{
System.out.println("BASICCourse ends");
}
}
public class as23 {
public static void perform(Course1 ref) {
ref.start();
if(ref instanceof DACDBDACourse1) {
DACDBDACourse1 d=(DACDBDACourse1)ref;
d.orientation();
}
ref.stop();
}
public static void main(String[] args) {
perform(new DACDBDACourse1());
perform(new MSCIT());
perform(new BASIC());
}
}

