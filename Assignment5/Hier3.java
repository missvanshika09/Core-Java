//3) Go for Hierarchical inheritance, create instances of child class and observe constructor invocation.
class Animal {
    String name;
    public Animal(String name) {
        this.name = name;
        System.out.println("Animal constructor called. Name: " + this.name);
    }
}

class Dog extends Animal {
    String breed;
    public Dog(String name, String breed) {
        super(name); 
        this.breed = breed;
        System.out.println("Dog constructor called. Breed: " + this.breed);
    }
}

class Cat extends Animal {
    String color;

    public Cat(String name, String color) {
        super(name); 
        this.color = color;
        System.out.println("Cat constructor called. Color: " + this.color);
    }
}

public class Hier3 {
    public static void main(String[] args) {
 
        Dog myDog = new Dog("Buddy", "Golden Retriever");
        System.out.println(); 

        Cat myCat = new Cat("Whiskers", "White");
    }
