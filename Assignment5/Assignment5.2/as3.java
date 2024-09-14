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
public class as3 {
public static void main(String[] args) {
Course1[] arr=new Course1[3];
arr[0]=new DACDBDACourse1();
arr[1]=new MSCIT();
arr[2]=new BASIC();
for(int i=0;i<arr.length;i++) 
{
arr[i].start();
if(arr[i] instanceof DACDBDACourse1) {
DACDBDACourse1 d=(DACDBDACourse1)arr[i];
d.orientation();
}
arr[i].stop();
}
}
}
