public class Main2 {
    public static void main(String[] args) {
        Employee tim = new Employee("Tim", "11/11/1985", "01/01/2020");
        infoEmplo(tim);
        Employee tim1 = new Employee("Tim1", "11/11/1985", "01/01/2020");
        infoEmplo(tim1);
    }
    public static void infoEmplo(Employee emplo){
        System.out.println(emplo);
        System.out.println("Age = " + emplo.getAge());
        System.out.println("Pay = " + emplo.collectPay());
    }
}
