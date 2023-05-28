public class Main {
    public static void main(String[] args){
        Animal animal = new Animal("Generic Animal", "Huge", 40);
        doAnimalStuff(animal, "slow");

        Dog dog = new Dog();
        doAnimalStuff(dog, "fast");

        Dog yorkie = new Dog("yorkie", 15);
        doAnimalStuff(yorkie, "fast");

        Dog retriever = new Dog("Labrador Retriever", 65, "Floppy", "Swimmer");
        doAnimalStuff(retriever, "slow");
    }
    public static void doAnimalStuff(Animal animal, String speed){
        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("_ _ _ _ _ ");
    }
}