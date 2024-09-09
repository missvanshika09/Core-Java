/*1) Create a multi-level inheritance , instantiate the child class and observe constructor invocation.
Also show, if needed how will u invoke parent class constructor from child class ?*/
class Vehicle {
	public Vehicle() {
		System.out.println("inside vehicle constructor:");
	}

}
class FourWheeler extends Vehicle {
	public FourWheeler() {
		super();
		System.out.println("inside four wheeler constructor:");
	}

}

class Car extends FourWheeler {
	public Car() {
		super();
		System.out.println("inside car constructor:");
	}

}

public class MultiIn1 {
	public static void main(String[] args) {
		Car c= new Car();
	}

}
