
import java.util.Scanner;

public class AbsoluteValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input number: ");
        String  numberAsText = scanner.nextLine();
        int number = Integer.parseInt(numberAsText);

        boolean isNumberNegative = number < 0;
        String result = isNumberNegative ? "|"+ (number * (-1)) + "|": "|" + number + "|";

        System.out.println("Absolute value: " + result);
    }
}
