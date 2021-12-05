import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insert number: ");
        String numberAsText = scanner.nextLine();
        int number = Integer.parseInt(numberAsText);

        int result = 1;

        System.out.print("Result: ");
        if (number < 0) {
            System.out.print("Please, insert positive number!");
        } else if (number < 2) {
            System.out.print(number);
        } else {
            while (true) {
                result *= number;
                if (result > 1000) {
                    break;
                } else {
                    System.out.print(result + " ");
                }
            }
        }
    }
}
