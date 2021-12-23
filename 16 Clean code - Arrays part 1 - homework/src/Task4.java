import java.util.Arrays;
import java.util.Scanner;

public class Task4 {

    static Scanner scanner = new Scanner(System.in);
    static int length = getArrayLength();

    public static void main(String[] args) {
        printMessage("----- Problem with relatives -----");

        int[] numbers = createArray(length);
        printMessage("Numbers array: " + Arrays.toString(numbers));

        int[] sortedNumbers = sortArray(numbers);
        int result = findSecondLargestNumber(sortedNumbers);
        isExist(result);
    }

    private static void isExist(int result) {
        if (result != Integer.MAX_VALUE) {
            System.out.println("Second largest number in the array is: " + result);
        } else {
            System.out.println("There is no second largest element!");
        }
    }

    private static int getArrayLength() {
        System.out.print("Insert number of elements: ");
        return Integer.parseInt(scanner.nextLine());
    }

    private static int[] createArray(int length) {
        int[] numbers = new int[length];
        for (int index = 0; index < numbers.length; index++) {
            System.out.print("Number " + (index + 1) + ": ");
            numbers[index] = Integer.parseInt(scanner.nextLine());
        }

        return numbers;
    }

    private static int[] sortArray(int[] numbers) {
        int temp;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 1; j < numbers.length - i; j++) {
                if (numbers[j - 1] > numbers[j]) {
                    temp = numbers[j - 1];
                    numbers[j - 1] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }

        return numbers;
    }

    private static int findSecondLargestNumber(int[] sortedNumbers) {
        for (int i = sortedNumbers.length - 2; i >= 0; i--) {
            if (sortedNumbers[i] != sortedNumbers[i + 1]) {
                return sortedNumbers[i];
            }
        }

        return Integer.MAX_VALUE;
    }

    private static void printMessage(String text) {
        System.out.println(text);
    }
}
