package ie.tudublin;

public class Main {
    public static void main (String[] args) {
        System.out.println("Hello world");

        //Animal a = new Animal();

        // The type is a superclass, the instance is a subclass 
        // This is not polymophism 
        Cat topcat = new Cat("TopCat");

        //This is polymophism 
        Animal mino = new Cat("Mino");

        // A virtual Method !
        // Dynamic binding - always called instance method 
        mino.speak();

        
        //program won't compile 
        //System.out.println(mino.getNumLives()); 
        //compiler does not know about instance that mino is a cat 

        //This is compile 
        //This is an example of a cast 
        System.out.println(((cat)mino).getNumLives()); 
        
        mino = new Dog("Misty"); // type is Animal so it will compile 
        topcat = new Dog("Tara"); // won't compile cause type is cat 

    }
}