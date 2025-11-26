import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final byte MONTHS_IN_YEAR = 12;
        final byte PRECENT = 100;

        int principal = 0;
        float monthlyInterest = 0;
        float numberOfPayments = 0;

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Principal: ");
            principal = sc.nextInt();
            if (principal >= 1000 && principal <= 1_000_000) {
                break;
            }
            System.out.println("Enter a value between 1000 and 1000000");
        }
    }
}