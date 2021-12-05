import java.util.Scanner;

public class DivisionWithRemainder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insert the first number: ");
        double numberOne = Double.parseDouble(scanner.nextLine());

        System.out.print("Insert the second number: ");
        double numberTwo = Double.parseDouble(scanner.nextLine());

        boolean result = checkEqualRemainders(numberOne, numberTwo);
        System.out.println("Result: " + result);
    }

    public static boolean checkEqualRemainders(double numberOne, double numberTwo) {
        return numberOne % 3 == numberTwo % 3;
    }
}
