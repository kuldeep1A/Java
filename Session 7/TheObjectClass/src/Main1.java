public class Main1 extends Object {
    public static void main(String[] args) {
        Student alice = new Student("Alice", 20);
//        System.out.println(alice.toString());
        System.out.println(alice);

        PrimarySchoolStudent jimmy = new PrimarySchoolStudent("Jimmy", 8, "Carole");
        System.out.println(jimmy);
    }
}

class Student {
    protected String name;
    private int age;
    Student(String name, int age){
        this.name = name;
        this.age = age;
    }

//    @Override
//    public String toString() {
//        return super.toString();
//    }

    @Override
    public String toString() {
        return name + " is " + age;
//        return "Student{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                '}';
    }
}

class PrimarySchoolStudent extends Student {
    private String parentName;
    PrimarySchoolStudent(String name, int age, String parentName){
        super(name, age);
        this.parentName = parentName;
    }

    @Override
    public String toString(){
        return parentName + "'s kid, " + super.toString();
    }
}