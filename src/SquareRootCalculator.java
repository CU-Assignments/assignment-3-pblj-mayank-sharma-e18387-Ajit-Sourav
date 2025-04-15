import java.util.Scanner;

public class SquareRootCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        try {
            double num = sc.nextDouble();
            if (num < 0) {
                throw new IllegalArgumentException("Cannot calculate the square root of a negative number.");
            }
            System.out.println("Square root: " + Math.sqrt(num));
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: Invalid input.");
        }
    }
}
