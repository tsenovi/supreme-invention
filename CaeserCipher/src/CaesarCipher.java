import java.util.Arrays;
import java.util.Scanner;

public class CaesarCipher {

    public static final char LETTER_SMALL_A = 'a';
    public static final char LETTER_SMALL_Z = 'z';

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String encryptedText = scanner.nextLine();
        String sortedText = sortText(encryptedText);
        char frequentSymbol = findMostFrequentChar(sortedText);
    }

    public static String sortText(String text) {
        text = getLowerCaseText(text);
        char[] chars = text.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }

    public static char findMostFrequentChar(String text) {
        char frequentChar = text.charAt(0);
        char currentChar;
        char previousChar = text.charAt(0);
        int frequentCharCounter = 0;
        int currentCharCounter = 0;
        for (int i = 0; i < text.length(); i++) {
            currentChar = text.charAt(i);
            if (isSmallLetter(currentChar)) {
                if (currentChar != previousChar) {
                    currentCharCounter = 0;
                } else {
                    currentCharCounter++;
                }

                if (currentCharCounter > frequentCharCounter) {
                    frequentCharCounter = currentCharCounter;
                    frequentChar = currentChar;
                }

                previousChar = currentChar;
            }
        }

        return frequentChar;
    }

    public static boolean isSmallLetter(char symbol) {
        return symbol >= LETTER_SMALL_A && symbol <= LETTER_SMALL_Z;
    }

    public static String getLowerCaseText(String text) {
        return text.toLowerCase();
    }
}