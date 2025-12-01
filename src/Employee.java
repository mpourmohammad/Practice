public class Employee {
    public int one;
    public int two;

    public int calculateSalary(int three) {
        return one + two + three;
    }

    public int calculateSalary() {
        return calculateSalary(0);
    }

    public static int calculatePrint() {
        return 1;
    }
}
