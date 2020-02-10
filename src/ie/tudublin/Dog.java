package ie.tudublin;

public class Dog extends Animal {
    
    //same name as class - when we make constructor 
    public Dog(String name) {
        super(name);
    }

    public void speak() {
        System.out.println("Woof!!");
    }
}