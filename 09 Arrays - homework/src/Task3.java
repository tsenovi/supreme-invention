import java.util.Arrays;
import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Choose length for both arrays: ");
        int arraysLength = scanner.nextInt();
        int[] arrayOne = new int[arraysLength];

        System.out.println("> Array 1");
        for (int index = 0; index < arrayOne.length; index++) {

            System.out.print("Number " + (index + 1) + ": ");
            arrayOne[index] = scanner.nextInt();
        }

        System.out.println("Array One: " + Arrays.toString(arrayOne));

        int[] arrayTwo = new int[arraysLength];

        System.out.println("> Array 2");
        for (int index = 0; index < arrayTwo.length; index++) {

            System.out.print("Number " + (index + 1) + ": ");
            arrayTwo[index] = scanner.nextInt();
        }

        System.out.println("Array Two: " + Arrays.toString(arrayTwo));

        int[] result = new int[arraysLength];
        for (int i = 0; i < arrayOne.length; i++) {

            if (i % 2 == 0) {
                result[i] = arrayOne[i];
            } else {
                result[i] = arrayTwo[i];
            }
        }

        System.out.println("""
                New array with elements:\s
                On even index, has element on even index from Array One
                On odd index, has element on odd index from Array Two""");
        System.out.println("arrayResult: " + Arrays.toString(result));
    }
}
