import java.util.Scanner;

public class Vowels {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Insert symbol: ");

        boolean result = isVowel(scanner.next().charAt(0));
        System.out.println("Result: " + result);
    }

    public static boolean isVowel(char symbol) {
        return switch (symbol) {
            case 'a', 'e', 'o', 'i', 'u', 'A', 'E', 'O', 'I', 'U' -> true;
            default -> false;
        };
    }
}
