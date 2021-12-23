import java.util.Arrays;
import java.util.Scanner;

public class Task1 {

    static Scanner scanner = new Scanner(System.in);
    static int arrayLength = getArrayLength();

    public static void main(String[] args) {
        printManipulatedArray();
    }

    private static void printManipulatedArray() {
        int[] initialNumbers = createInitialArray(arrayLength);
        int[] result = createManipulatedArray(initialNumbers, arrayLength);
        System.out.println("Numbers after: " + Arrays.toString(result));
    }

    private static int getArrayLength() {
        System.out.print("Insert number of elements: ");
        return Integer.parseInt(scanner.nextLine());
    }

    private static int[] createInitialArray(int arrayLength) {
        int[] numbersBefore = new int[arrayLength];
        for (int index = 0; index < arrayLength; index++) {
            System.out.print("Number " + (index + 1) + ": ");
            int currentElement = scanner.nextInt();
            numbersBefore[index] = currentElement;
        }

        return numbersBefore;
    }

    private static int[] createManipulatedArray(int[] numbersBefore, int arrayLength) {
        int[] numbersAfter = new int[arrayLength];
        for (int index = 0; index < arrayLength; index++) {
            numbersAfter[index] = numbersBefore[index] * index;
        }

        return numbersAfter;
    }
}
