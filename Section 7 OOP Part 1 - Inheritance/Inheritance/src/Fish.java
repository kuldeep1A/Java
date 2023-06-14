package src;

import java.util.Objects;

public class Fish extends Animal {
    private final int gills;
    private final int fins;

    public Fish(String type, double weight, int gills, int fins){
        //super(type, weight < 15 ? "small" : (weight < 35 ? "medium" : "large"), weight);
        super(type, "small", weight);
        this.gills = gills;
        this.fins = fins;
    }

    private void moveMuscles(){
        System.out.print("Muscles moving ");
    }
    private void moveBackFins(){
        System.out.print("Backfin moving ");
    }

    public void move(String speed){
        super.move(speed);
        moveMuscles();
        if (Objects.equals(speed, "fast")){
            moveBackFins();
        }
        System.out.println();
    }

    @Override
    public String toString() {
        return "Fish{" +
                "gills=" + gills +
                ", fins=" + fins +
                "} " + super.toString();
    }
}
