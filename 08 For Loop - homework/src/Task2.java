import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("> Division with 5 without remaining part for numbers [0-n] <");
        System.out.print("Insert number: ");

        String numberAsText = scanner.nextLine();
        int number = Integer.parseInt(numberAsText);

        System.out.println("Result: ");
        for (int counter = 0; counter <= number; counter++) {
            if (counter % 5 == 0) {
                System.out.print(counter + " ");
            }
            if (counter % 100 == 0) {
                System.out.println();
            }
        }
    }
}
