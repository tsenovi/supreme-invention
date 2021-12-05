import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("> Histogram <");

        System.out.print("Insert number: ");
        String numberAsText = scanner.nextLine();
        int number = Integer.parseInt(numberAsText);

        do {
            if (number < 100 || number > 30000) {
                System.out.print("Invalid number, insert new one: ");
                numberAsText = scanner.nextLine();
                number = Integer.parseInt(numberAsText);
            } else {
                break;
            }
        } while (true);

        String numberString = "" + number;
        System.out.println("Result: ");

        for (int i = numberString.length(); i > 0; i--) {
            char digitAtI = numberString.charAt(i - 1);
            int digit = Character.getNumericValue(digitAtI);

            System.out.print(digit);

            for (int j = 0; j < digit; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
