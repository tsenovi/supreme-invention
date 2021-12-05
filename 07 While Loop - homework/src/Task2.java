import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insert number: ");
        String numberAsText = scanner.nextLine();
        int number = Integer.parseInt(numberAsText);

        System.out.print("Insert exponent: ");
        String exponentAsText = scanner.nextLine();
        int exponent = Integer.parseInt(exponentAsText);

        int counter = 0;
        int result = 1;

        System.out.print("Result: ");
        if (number < 0) {
            System.out.print("Please, insert positive number!");
        } else if (number < 2) {
            result = number;
            System.out.print(result);
        } else {
            while (counter < exponent) {
                result *= number;
                counter++;
            }
            System.out.print(result);
        }
    }
}
