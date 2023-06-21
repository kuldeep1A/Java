// Abstract class
abstract class Animal1 {
    // Abstract method (does not have a body)
    public abstract void animalSound();
    // Regular method
    public void sleep() {
        System.out.println("Zzz");
    }
}

// Subclass (inherit from Animal)
class Pig1 extends Animal1 {
    public void animalSound() {
        // The body of animalSound() is provided here
        System.out.println("The pig says: wee wee");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Pig1 myPig = new Pig1(); // Create a Pig object
        myPig.animalSound();
        myPig.sleep();

        // runtime error acquired
        Animal1 myDog = new Animal1() {
            @Override
            public void animalSound() {
                System.out.println("New Implementation");
            }
        };
        myDog.animalSound();
    }
}
