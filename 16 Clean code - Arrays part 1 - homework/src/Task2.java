import java.util.Arrays;
import java.util.Scanner;

public class Task2 {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        printArrays();
    }

    public static void printArrays() {
        System.out.print("Choose length of array 1: ");
        int[] numbersArrayOne = createArrayWithGivenLength();
        System.out.println("Numbers Array One: " + Arrays.toString(numbersArrayOne));

        System.out.print("Choose length of array 2: ");
        int[] numbersArrayTwo = createArrayWithGivenLength();
        System.out.println("Numbers Array Two: " + Arrays.toString(numbersArrayTwo));

        int numberOfEqualElements = countEqualElements(numbersArrayOne, numbersArrayTwo);
        int[] result = createNewArrayWithEqualElements(numbersArrayOne, numbersArrayTwo, numberOfEqualElements);
        System.out.println("New array with equals elements only: " + Arrays.toString(result));
    }

    private static int getArrayLength() {
        return Integer.parseInt(scanner.nextLine());
    }

    private static int[] createArrayWithGivenLength() {
        int[] numbers = new int[getArrayLength()];
        for (int index = 0; index < numbers.length; index++) {
            System.out.print("Number " + (index + 1) + ": ");
            numbers[index] = Integer.parseInt(scanner.nextLine());
        }

        return numbers;
    }

    private static int countEqualElements(int[] numbersArrayOne, int[] numbersArrayTwo) {
        int numberOfEqualElements = 0;
        for (int i = 0; i < numbersArrayOne.length; i++) {
            for (int j = 0; j < numbersArrayTwo.length; j++) {
                if (numbersArrayOne[i] == numbersArrayTwo[j]) {
                    numberOfEqualElements++;
                }
            }
        }

        return numberOfEqualElements;
    }

    private static int[] createNewArrayWithEqualElements(int[] numbersArrayOne, int[] numbersArrayTwo, int length) {
        int[] result = new int[length];
        int counterEqualElements = 0;
        for (int i = 0; i < numbersArrayOne.length; i++) {
            for (int j = 0; j < numbersArrayTwo.length; j++) {
                if (numbersArrayOne[i] == numbersArrayTwo[j]) {
                    result[counterEqualElements] = numbersArrayOne[i];
                    counterEqualElements++;
                }
            }
        }

        return result;
    }
}
