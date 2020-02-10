package ie.tudublin;

public class Animal {
    
    private String name; // 3 access modifier: private(local to the class), public,
    
    // create constructor 
    // Same name as the class
    // No return type 
    // If you don't add one, you get a default one 
    public Animal(String name) {
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void speak() {
        System.out.println("I can't speak!");
    }
}