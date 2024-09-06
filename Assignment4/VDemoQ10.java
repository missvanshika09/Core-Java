/*10)	Define an interface “Vechicle” with “start()” function . Now derive  classes like “TwoWheeler”, “ThreeWheeler”,”FourWheeler” etc. from “Vehicle” and override “start()” function. Define a class “VDemo” in which  write  main()  function.
In the main function create a reference to Vehicle  class referring to any of the sub class. Using this reference, call “start" method.
*/
interface vehicle{
	void start();
}

class TwoWheeler implements vehicle{
	public void start() {
		System.out.println("Two Wheeler has started");
	}
}

class ThreeWheeler implements vehicle{
	public void start() {
		System.out.println("Three wheeler has started");
	}
}

class FourWheeler implements vehicle{
	public void start() {
		System.out.println("four wheeler has started ");
	}
}
public class VDemoQ10 {
	static void perform(vehicle ref) {
		ref.start();
	}

	public static void main(String[] args) {
		
		perform(new TwoWheeler());
		perform(new ThreeWheeler());
		perform(new FourWheeler());
		

	}

}
