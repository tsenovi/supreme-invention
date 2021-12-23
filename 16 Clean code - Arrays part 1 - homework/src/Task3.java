import java.util.Arrays;
import java.util.Scanner;

public class Task3 {

    static Scanner scanner = new Scanner(System.in);
    static int arraysLength = getArraysLength();

    public static void main(String[] args) {
        printArrays();
    }

    private static void printArrays() {
        int[] arrayOne = createArray("> Array 1");
        System.out.println("Array One: " + Arrays.toString(arrayOne));

        int[] arrayTwo = createArray("> Array 2");
        System.out.println("Array Two: " + Arrays.toString(arrayTwo));

        int[] result = createManipulatedArray(arrayOne, arrayTwo);
        System.out.println("""
                New array with elements:\s
                On even index, has element from even index of Array One
                On odd index, has element from odd index of Array Two""");
        System.out.println("arrayResult: " + Arrays.toString(result));
    }

    private static int getArraysLength() {
        System.out.print("Choose length for both arrays: ");
        return Integer.parseInt(scanner.nextLine());
    }

    private static int[] createArray(String text) {
        System.out.println(text);
        int[] array = new int[arraysLength];
        for (int index = 0; index < array.length; index++) {
            System.out.print("Number " + (index + 1) + ": ");
            array[index] = Integer.parseInt(scanner.nextLine());
        }

        return array;
    }

    private static int[] createManipulatedArray(int[] arrayOne, int[] arrayTwo) {
        int[] result = new int[arraysLength];
        for (int i = 0; i < arrayOne.length; i++) {
            if (i % 2 == 0) {
                result[i] = arrayOne[i];
            } else {
                result[i] = arrayTwo[i];
            }
        }

        return result;
    }
}
