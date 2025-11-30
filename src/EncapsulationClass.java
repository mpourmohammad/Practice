public class EncapsulationClass {
    public static void main(String[] args) {
        var employee = new Employee();

        employee.one = 25;
        employee.two = 20;
        int wage = employee.calculateSalary(3);
        System.out.println(wage);
    }
}
