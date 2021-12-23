import java.util.Scanner;

public class Task2 {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int number = getNumber();
        printTriangle(number);
    }

    private static void printTriangle(int number) {
        for (int i = 1; i <= number * 2; i += 2) {
            printRow(i);
            printNewLine();
        }
    }

    private static int getNumber() {
        System.out.print("Insert number \"n\": ");
        return Integer.parseInt(scanner.nextLine());
    }

    private static void printRow(int i) {
        for (int j = 0; j < i; j++) {
            System.out.print("*");
        }
    }

    private static void printNewLine() {
        System.out.println();
    }
}
