import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number \"a\": ");
        String numberAString = scanner.nextLine();
        float numberA = Float.parseFloat(numberAString);

        System.out.print("Input number \"b\": ");
        String numberBString = scanner.nextLine();
        float numberB = Float.parseFloat(numberBString);

        System.out.println("Available options: ");
        System.out.println("1. a + b;");
        System.out.println("2. a - b;");
        System.out.println("3. b - 1;");
        System.out.println("4. a * b;");
        System.out.println("5. a / b;");
        System.out.println("6. b / a;");

        System.out.print("Input number [1-6]: ");
        String numberOptionString = scanner.nextLine();
        int numberOption = Integer.parseInt(numberOptionString);


        switch (numberOption) {
            case 1 -> System.out.println("Result: " + (numberA + numberB));
            case 2 -> System.out.println("Result: " + (numberA - numberB));
            case 3 -> System.out.println("Result: " + (numberB - 1));
            case 4 -> System.out.println("Result: " + (numberA * numberB));
            case 5 -> System.out.println("Result: " + (numberA / numberB));
            case 6 -> System.out.println("Result: " + (numberB / numberA));
            default -> System.out.println("Invalid option");
        }
    }
}
