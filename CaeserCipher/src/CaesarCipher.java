import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class CaesarCipher {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String encryptedText = scanner.nextLine();
        String sortedText = sortText(encryptedText);
        char frequentSymbol = findMostFrequentChar(sortedText);
    }

    public static String sortText(String text) {
        text = text.toLowerCase(Locale.ROOT);
        char[] chars = text.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }

    public static char findMostFrequentChar(String chars) {
        char maxChar = chars.charAt(0);
        char currentChar;
        char previousChar = chars.charAt(0);
        int maxCharCounter = 0;
        int currentCharCounter = 0;
        for (int i = 0; i < chars.length(); i++) {
            currentChar = chars.charAt(i);
            if (currentChar < 97 || currentChar > 122) {
                i++;
            } else {
                if (currentChar != previousChar) {
                    currentCharCounter = 0;
                }

                if (chars.charAt(i) == currentChar) {
                    currentCharCounter++;
                }

                if (currentCharCounter > maxCharCounter) {
                    maxCharCounter = currentCharCounter;
                    maxChar = currentChar;
                }

                previousChar = currentChar;
            }
        }

        return maxChar;
    }
}
