import java.util.Arrays;
import java.util.Scanner;

public class CompareElements {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert 10 numbers: ");
        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        System.out.println("Array:");
        System.out.println(Arrays.toString(numbers));
        System.out.println("Result:");
        System.out.print(numbers[0]);
        printComparedElement(numbers);
    }

    public static void printComparedElement(int[] numbers) {
        for (int i = 1; i < numbers.length; i++) {
            String signWithElement = compareWithPrevious(numbers[i - 1], numbers[i]);
            System.out.print(signWithElement);
        }
    }

    public static String compareWithPrevious(int previousNumber, int currentNumber) {
        if (previousNumber < currentNumber) {
            return " < " + currentNumber;
        } else if (previousNumber > currentNumber) {
            return " > " + currentNumber;
        } else {
            return " = " + currentNumber;
        }
    }
}
