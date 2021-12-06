import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("> Triangle with side \"n\" <");
        System.out.print("Insert number: ");

        String numberAsText = scanner.nextLine();
        int number = Integer.parseInt(numberAsText);

        System.out.println("Result: ");
        for (int rows = 1; rows < number * 2; rows += 2) {
            for (int spaces = 0; spaces < (number - rows / 2); spaces++) {
                System.out.print(" ");
            }
            for (int column = 0; column < rows; column++) {
                System.out.print("о");
            }
            System.out.println();
        }
    }
}
