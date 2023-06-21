class Student {
    String name;
    static String school;
}

public class static_ {
    public static void main(String[] args) {
        Student.school = "My School";
        Student student1 = new Student();
        student1.name = "Naveen";

        Student student2 = new Student();
        student2.name = "Kuldeep";

        System.out.println(student1.name + " " + Student.school);
        System.out.println(student2.name + " " + Student.school);
    }
}
