import java.util.Scanner;

public class MultipleMathTasks {

    public static void main(String[] args) {
        printProgramFeatures();
        int task = Integer.parseInt(getNumber());
        executeTask(task);
    }

    public static void printProgramFeatures() {
        System.out.println("1. Switch the digits of a two digit number.");
        System.out.println("2. Average calculation of two numbers.");
        System.out.println("3. Calculation of linear equation a * x + b = 0");
        System.out.print("Choose Task: ");
    }

    public static void printErrorMessage() {
        System.out.println("Invalid input");
    }

    public static String getNumber() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static void executeTask(int task) {
        switch (task) {
            case 1 -> {
                System.out.print("Insert two digit number: ");
                int number = Integer.parseInt(getNumber());
                isTwoDigitsPositiveNumber(number);
            }
            case 2 -> {
                System.out.print("Insert first number: ");
                double numberOne = Double.parseDouble(getNumber());
                System.out.print("Insert second number: ");
                double numberTwo = Double.parseDouble(getNumber());
                isBothNumbersPositive(numberOne, numberTwo);
            }
            case 3 -> {
                System.out.print("Insert number \"a\": ");
                double numberA = Double.parseDouble(getNumber());
                System.out.print("Insert number \"b\": ");
                double numberB = Double.parseDouble(getNumber());
                isNumberADifferentWithZero(numberA, numberB);
            }
            default -> printErrorMessage();
        }
    }

    private static void isTwoDigitsPositiveNumber(int number) {
        if (number < 10 || number > 99) printErrorMessage();
        else
            System.out.println("Result: " + swapDigits(number));
    }

    private static void isBothNumbersPositive(double numberOne, double numberTwo) {
        if (numberOne < 1 || numberTwo < 1) printErrorMessage();
        else
            System.out.println("Result: " + calculateAverage(numberOne, numberTwo));
    }

    private static void isNumberADifferentWithZero(double numberA, double numberB) {
        if (numberA == 0) printErrorMessage();
        else
            System.out.println("Result: x = " + calculateLinearEquation(numberA, numberB));
    }

    public static int swapDigits(int number) {
        int firstDigit = number / 10;
        int secondDigit = number % 10;
        return Integer.parseInt("" + secondDigit + firstDigit);
    }

    public static double calculateAverage(double numberOne, double numberTwo) {
        return (numberOne + numberTwo) / 2;
    }

    public static double calculateLinearEquation(double numberOne, double numberTwo) {
        return (-1) * (numberTwo / numberOne);
    }
}
