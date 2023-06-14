package src;

import java.util.Scanner;
public class Main1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String d = s.nextLine();
        s.close();
        Student alice = new Student("Alice", 20);
//        System.out.println(alice.toString());
        System.out.println(alice);

        PrimarySchoolStudent jimmy = new PrimarySchoolStudent("Jimmy", 8, "Carole");
        System.out.println(jimmy);
    }
}

class Student {
    protected String name;
    private final int age;
    Student(String name, int age){
        this.name = name;
        this.age = age;
    }


    @Override
    public String toString() {
        return name + " is " + age;

    }
}

class PrimarySchoolStudent extends Student {
    private final String parentName;
    PrimarySchoolStudent(String name, int age, String parentName){
        super(name, age);
        this.parentName = parentName;
    }

    @Override
    public String toString(){
        return parentName + "'s kid, " + super.toString();
    }
}