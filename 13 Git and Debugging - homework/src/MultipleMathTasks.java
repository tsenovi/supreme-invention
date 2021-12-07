import java.util.Scanner;

public class MultipleMathTasks {

    public static void main(String[] args) {
        printProgramName();
        printProgramFeatures();
        int task = isValidTask(getNumber());
        executeTask(task);
    }

    public static void executeTask(int task) {
        switch (task) {
            case 1 -> {
                System.out.println("Task 1: ");
                int number = (int) isPositive(getNumber());
                System.out.println("Result: " + swapNumbersOfTwoDigitNumber(number));
            }
            case 2 -> {
                System.out.println("Task 2: ");
                double numberOne = isPositive(getNumber());
                double numberTwo = isPositive(getNumber());
                System.out.println("Result: " + calculateAverageOfTwoNumbers(numberOne, numberTwo));
            }
            case 3 -> {
                System.out.println("Task 3: ");
                double numberA = isDifferentWithZero(getNumber());
                double numberB = getNumber();
                System.out.println("Result: x = " + calculateLinearEquation(numberA, numberB));
            }
            default -> printErrorMessage();
        }
    }

    public static double isPositive(double number) {
        Scanner scanner = new Scanner(System.in);
        while (number <= 9) {
            System.out.println("Insert positive number: ");
            while (!scanner.hasNextInt()) {
                printErrorMessage();
                scanner.next();
            }
            number = scanner.nextInt();
        }
        return number;
    }

    public static double isDifferentWithZero(double number) {
        Scanner scanner = new Scanner(System.in);
        while (number == 0) {
            System.out.println("Insert number different than 0: ");
            while (!scanner.hasNextInt()) {
                printErrorMessage();
                scanner.next();
            }
            number = scanner.nextInt();
        }
        return number;
    }

    public static int isValidTask(int task) {
        Scanner scanner = new Scanner(System.in);
        while (task < 1 || task > 3) {
            printErrorMessage();
            while (!scanner.hasNextInt()) {
                printErrorMessage();
                scanner.next();
            }
            task = scanner.nextInt();
        }
        return task;
    }

    public static double calculateLinearEquation(double numberOne, double numberTwo) {
        return (-1) * (numberTwo / numberOne);
    }

    public static double calculateAverageOfTwoNumbers(double numberOne, double numberTwo) {
        return (numberOne + numberTwo) / 2;
    }

    public static int swapNumbersOfTwoDigitNumber(int number) {
        int firstDigit = number % 10;
        int secondDigit = number / 10;
        return Integer.parseInt("" + firstDigit + secondDigit);
    }

    public static int getNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insert number: ");
        return scanner.nextInt();
    }

    public static void printErrorMessage() {
        System.out.println("Invalid input");
    }

    public static void printProgramFeatures() {
        System.out.println("1. Switch the digits of a two digit number.");
        System.out.println("2. Average calculation of two numbers.");
        System.out.println("3. Calculation of linear equation a * x + b = 0");
    }

    public static void printProgramName() {
        System.out.println("--------- Program Tasks ---------");
    }


}
