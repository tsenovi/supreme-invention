import java.util.Scanner;

public class Division {

    public static void main(String[] args) {
        printProgramGoal();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insert the first number: ");
        double numberOne = Double.parseDouble(scanner.nextLine());

        System.out.print("Insert the second number: ");
        double numberTwo = Double.parseDouble(scanner.nextLine());

        System.out.print("Insert the third number: ");
        double numberThree = Double.parseDouble(scanner.nextLine());

        boolean result = checkDivision(numberOne, numberTwo, numberThree);
        System.out.println("Result: " + result);
    }

    private static void printProgramGoal() {
        System.out.println("Check if a number is divided without remainder, on other two numbers, at the same time");
    }

    public static boolean checkDivision(double numberOne, double numberTwo, double numberThree) {
        return numberOne % numberTwo == numberOne % numberThree;
    }
}
