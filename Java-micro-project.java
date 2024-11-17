import java.util.Scanner;
public class PercentageCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter total and obtained numbers: ");
        double total = scanner.nextDouble(), obtained = scanner.nextDouble();
        System.out.println(total > 0 ? "Percentage: " + (obtained / total * 100) + "%" : "Total must be > 0");
        scanner.close();
    }
}
