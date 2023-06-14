package src;

public class Main2 {
    public static void main(String[] args) {
        Employee tim = new Employee("Tim", "11/11/1985", "01/01/2020");
        doEmployee(tim);
        SalariedEmployee joe = new SalariedEmployee("Joe", "01/01/1999", "03/03/2020", 35000);
        doEmployee(joe);
        System.out.println("Joe's Paycheck = $" + joe.collectPay());
        joe.retire();
        System.out.println("Joe's Pension check = $" + joe.collectPay());
        HourlyEmployee mary = new HourlyEmployee("Mary", "05/05/1970", "03/03/2021", 15);
        System.out.println(mary);
        System.out.println("Mary's paycheck = $" + mary.collectPay());
        System.out.println("Mary's Holiday Pay = $" + mary.getDoublePay());
    }
    public static void doEmployee(Employee employee){
        System.out.println(employee);
        System.out.println("Age = " + employee.getAge());
        System.out.println("Pay = " + employee.collectPay());
    }
}