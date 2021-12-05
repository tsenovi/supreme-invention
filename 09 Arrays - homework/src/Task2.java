import java.util.Arrays;
import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Choose length of array 1: ");
        int[] numbersArrayOne = new int[scanner.nextInt()];

        for (int index = 0; index < numbersArrayOne.length; index++) {

            System.out.print("Number " + (index + 1) + ": ");
            numbersArrayOne[index] = scanner.nextInt();
        }

        System.out.println("Numbers Array One: " + Arrays.toString(numbersArrayOne));

        System.out.print("Choose length of array 2: ");
        int[] numbersArrayTwo = new int[scanner.nextInt()];

        for (int index = 0; index < numbersArrayTwo.length; index++) {

            System.out.print("Number " + (index + 1) + ": ");
            numbersArrayTwo[index] = scanner.nextInt();
        }

        System.out.println("Numbers Array Two: " + Arrays.toString(numbersArrayTwo));

        int resultLength = 0;
        for (int i = 0; i < numbersArrayOne.length; i++) {

            for (int j = 0; j < numbersArrayTwo.length; j++) {

                if (numbersArrayOne[i] == numbersArrayTwo[j]) {
                    resultLength++;
                }
            }
        }

        int[] result = new int[resultLength];
        int counterEqualElements = 0;
        for (int i = 0; i < numbersArrayOne.length; i++) {

            for (int j = 0; j < numbersArrayTwo.length; j++) {

                if (numbersArrayOne[i] == numbersArrayTwo[j]) {
                    result[counterEqualElements] = numbersArrayOne[i];
                    counterEqualElements++;
                }
            }
        }

        System.out.println("New array with equals elements only: " + Arrays.toString(result));
    }
}
