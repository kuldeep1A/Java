class Animal {
    public void animalSound(){
        System.out.println("The animal make a sound");
    }
}

class Pig extends Animal {
    public void animalSound(){
        System.out.println("The pig says: Wee Wee");
    }
}

class Dog extends  Animal {
    public void animalSound() {
        System.out.println("The dog says: bow bow");
    }
}
public class Polymorphism {
    public static void main(String[] args) {
        Animal myAnimal  = new Animal();
        Animal myPig = new Pig();
        Animal myDog = new Dog();

        myAnimal.animalSound();
        myPig.animalSound();
        myDog.animalSound();
    }
}
