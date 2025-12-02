import java.text.NumberFormat;

public class MortgageReport {
    public static MortgageCalculate calculator;

    public static void PrintMortgage(int principal, float annualInterest, byte years) {
        calculator = new MortgageCalculate(principal, annualInterest, years);
        double mortgage = calculator.calculateMortgage();
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + mortgageFormatted);
    }

    public static void printPaymentSchedule(byte years, int principal, float annualInterest) {
        System.out.println();
        System.out.println("Payment Schedule");
        System.out.println("---------");
        for (short month = 1; month < years * Main.MONTHS_IN_YEAR; month++) {
            double balance = calculator.calculateBalance(month);
            System.out.println(NumberFormat.getCurrencyInstance().format(balance));
        }
    }
}
