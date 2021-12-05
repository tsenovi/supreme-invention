import java.util.Arrays;
import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("----- Problem with relatives -----");

        System.out.print("Insert number of elements: ");
        int[] numbers = new int[scanner.nextInt()];

        for (int index = 0; index < numbers.length; index++) {

            System.out.print("Number " + (index + 1) + ": ");
            numbers[index] = scanner.nextInt();
        }

        System.out.println("Numbers array: " + Arrays.toString(numbers));

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

        System.out.println("Second biggest number in the Array is: " + numbers[numbers.length - 2]);
    }
}
