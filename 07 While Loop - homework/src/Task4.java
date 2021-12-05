import java.util.Random;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Random random = new Random();
        int numberToGuess = random.nextInt(20) + 1;
        System.out.println("----------- Guess the number -----------");

        System.out.print("Insert number [1-20]: ");
        while (true) {

            String numberAsText = scanner.nextLine();
            int number = Integer.parseInt(numberAsText);

            if (number != numberToGuess) {
                System.out.print("You guessed wrong, insert new number: ");
            } else {
                System.out.print("You guessed right, " + number + " is the correct number");
                break;
            }
        }
    }
}