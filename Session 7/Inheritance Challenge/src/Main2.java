public class Main2 {
    public static void main(String[] args) {
        Employee tim = new Employee("Tim", "11/11/1985", "01/01/2020");
        doEmployee(tim);
        Employee jimmy = new Employee("Jimmy", "01/01/1999", "03/03/2020");
        doEmployee(jimmy);
    }
    public static void doEmployee(Employee employee){
        System.out.println(employee);
        System.out.println("Age = " + employee.getAge());
        System.out.println("Pay = " + employee.collectPay());
    }
}
