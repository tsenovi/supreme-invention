import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Insert number \"n\": ");
        int number = Integer.parseInt(scanner.nextLine());

        System.out.println("Result:");
        for (int i = 1; i <= number * 2; i += 2) {

            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
