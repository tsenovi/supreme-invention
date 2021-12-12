import java.util.Scanner;

public class WordCounter {

    public static void main(String[] args) {
        getText();
    }

    private static void getText() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insert text: ");
        String userText = scanner.nextLine();
        printResult(userText);
    }

    private static void printResult(String text) {
        int result = countWordsWithSpecialEnd(text);
        System.out.println("Number of words ending with \"y\" or \"z\": " + result);
    }

    public static int countWordsWithSpecialEnd(String text) {
        String[] wordsArray = text.split(" ");

        int counter = 0;
        char symbolY = 'y';
        char symbolZ = 'z';
        for (String word : wordsArray) {
            if ((word.charAt(word.length() - 1) == symbolY)
                    || (word.charAt(word.length() - 1) == symbolZ)) {
                counter++;
            }
        }

        return counter;
    }
}
