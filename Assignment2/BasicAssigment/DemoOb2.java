public class DemoOb2 {
    // Constructor prints when an object is created
    public DemoOb() {
        System.out.println("DemoOb instance created.");
    }

    public void display() {
        System.out.println("Displaying DemoOb instance.");
    }

    public static void main(String[] args) {
        //  Create an instance of DemoOb
        DemoOb obj1 = new DemoOb(); // obj1 references a new DemoOb object

        // Create a second reference pointing to the same object
        DemoOb obj2 = obj1; // obj2 references the same object as obj1

        // Both obj1 and obj2 refer to the same object
        obj1.display(); // "Displaying DemoOb instance."
        obj2.display(); //  "Displaying DemoOb instance."

        //  a new instance to obj1
        obj1 = new DemoOb(); // obj1 now references a new object

        // Now obj1 and obj2 refer to different objects
        System.out.println("obj1 references a new object:");
        obj1.display(); // Displays the new instance

        System.out.println("obj2 still references the original object:");
        obj2.display(); // Displays the original instance
    }
}
