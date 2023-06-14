package src;

public class Animal {
//    Protected that represent this object are use on subclasses
    protected String type;
    private String size;
    private double weight;

    public Animal(){
        System.out.println("hello");
    }

     @java.lang.Override
     public java.lang.String toString() {
         return "Animal{" +
                 "type='" + type + '\'' +
                 ", size='" + size + '\'' +
                 ", weight=" + weight +
                 '}';
     }

     public Animal(String type, String size, double weight) {
         this.type = type;
         this.size = size;
         this.weight = weight;
     }

     public void move(String speed){
         System.out.println(type + " moves " + speed);
     }

     public void makeNoise() {
         System.out.println(type + " makes some kind of noise");
     }
 }