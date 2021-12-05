import java.util.Arrays;
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insert number of elements: ");
        int arrayLength = scanner.nextInt();
        int[] numbersBefore = new int[arrayLength];
        int[] numbersAfter = new int[arrayLength];

        for (int index = 0; index < numbersBefore.length; index++) {

            System.out.print("Number " + (index + 1) + ": ");
            int currentElement = scanner.nextInt();
            numbersBefore[index] = currentElement;
        }

        System.out.println("Numbers before: " + Arrays.toString(numbersBefore));

        for (int index = 0; index < numbersAfter.length; index++) {
            numbersAfter[index] = numbersBefore[index] * index;
        }

        System.out.println("Numbers after: " + Arrays.toString(numbersAfter));

    }
}
