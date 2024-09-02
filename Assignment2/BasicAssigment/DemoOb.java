class A {

	public static int staticVarA = 10;

	public int nonStaticVarA = 20;
	public static void staticMethodA() {
		System.out.println("Static Method of Class A");
	}

	public void nonStaticMethodA() {
		System.out.println("Non-Static Method of Class A");
	}
}
class B {
	public static int staticVarB = 50;

	public int nonStaticVarB = 20;

	public static void staticMethodB() {
		System.out.println("Static Method of Class B");
	}

	public void nonStaticMethodB() {
		System.out.println("Non-Static Method of Class B");
	}
}
class C {

	public static int staticVarC = 150;

	public int nonStaticVarC = 160;

	public static void staticMethodC() {
		System.out.println("Static Method of Class C");
	}

	public void nonStaticMethodC() {
		System.out.println("Non-Static Method of Class C");
	}

}
public class DemoOb {
	public static void main(String args[]) {

		System.out.println("Accessing static members:");
		System.out.println("Class A staticVarA: " + A.staticVarA);
		A.staticMethodA();

		System.out.println("Class B staticVarB: " + B.staticVarB);
		B.staticMethodB();

		System.out.println("Class C staticVarC: " + C.staticVarC);
		C.staticMethodC();


		System.out.println("\nAccessing non-static members:");


		A aInstance = new A();
		B bInstance = new B();
		C cInstance = new C();

		System.out.println("Class A nonStaticVarA: " + aInstance.nonStaticVarA);
		aInstance.nonStaticMethodA();

		System.out.println("Class B nonStaticVarB: " + bInstance.nonStaticVarB);
		bInstance.nonStaticMethodB();

		System.out.println("Class C nonStaticVarC: " + cInstance.nonStaticVarC);
		cInstance.nonStaticMethodC();
	}
}
