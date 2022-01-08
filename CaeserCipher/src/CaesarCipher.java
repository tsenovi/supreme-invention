import java.util.Arrays;
import java.util.Scanner;

public class CaesarCipher {

    public static final int NUMBER_OF_ALPHABET_LETTERS = 26;
    public static final char SMALL_LETTER_A = 'a';
    public static final char SMALL_LETTER_Z = 'z';

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String encryptedText = scanner.nextLine();
        String sortedText = sortText(encryptedText);
        char frequentLetter = findMostFrequentLetter(sortedText);

        char[] mostCommonLetters = {'e', 't', 'h'};
        printResults(mostCommonLetters, frequentLetter);
    }

    public static void printResults(char[] letters, char frequentLetter) {
        for (int index = 0; index < letters.length; index++) {
            int complementaryOffset = calculateOffset(letters[index], frequentLetter);
        }
    }

    public static String sortText(String text) {
        text = getLowerCaseText(text);
        char[] charsArray = text.toCharArray();
        Arrays.sort(charsArray);
        return new String(charsArray);
    }

    public static int calculateOffset(char currentLetter, char frequentLetter) {
        int offset = Math.abs(currentLetter - frequentLetter);
        return NUMBER_OF_ALPHABET_LETTERS - offset;
    }

    public static char findMostFrequentLetter(String text) {
        char frequentLetter = text.charAt(0);
        char currentLetter;
        char previousLetter = text.charAt(0);
        int frequentLetterCounter = 0;
        int currentLetterCounter = 0;
        for (int i = 0; i < text.length(); i++) {
            currentLetter = text.charAt(i);
            if (isSmallLetter(currentLetter)) {
                if (currentLetter != previousLetter) {
                    currentLetterCounter = 0;
                } else {
                    currentLetterCounter++;
                }

                if (currentLetterCounter > frequentLetterCounter) {
                    frequentLetterCounter = currentLetterCounter;
                    frequentLetter = currentLetter;
                }

                previousLetter = currentLetter;
            }
        }

        return frequentLetter;
    }

    public static boolean isSmallLetter(char letter) {
        return letter >= SMALL_LETTER_A && letter <= SMALL_LETTER_Z;
    }

    public static String getLowerCaseText(String text) {
        return text.toLowerCase();
    }
}