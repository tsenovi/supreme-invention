import java.util.Arrays;
import java.util.Scanner;

public class CaesarCipher {

    public static final int NUMBER_OF_ALPHABET_LETTERS = 26;
    public static final char SMALL_LETTER_A = 'a';
    public static final char SMALL_LETTER_Z = 'z';

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\tBreaking Caesar Cipher\nInsert the encrypted message: ");
        String encryptedText = scanner.nextLine();
        String sortedText = sortText(encryptedText);
        char frequentLetter = findMostFrequentLetter(sortedText);
        char[] mostCommonLetters = {'e', 't', 'h'};
        printResults(mostCommonLetters, frequentLetter, encryptedText);
    }

    public static String sortText(String text) {
        text = getLowerCaseText(text);
        char[] charsArray = text.toCharArray();
        Arrays.sort(charsArray);
        return new String(charsArray);
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

    public static void printResults(char[] letters, char frequentLetter, String text) {
        for (int index = 0; index < letters.length; index++) {
            int complementaryOffset = calculateComplementaryOffset(letters[index], frequentLetter);
            StringBuffer result = decryptText(text, complementaryOffset);
            System.out.println(index + 1 + ".Possible decrypted message: " + result);
        }
    }

    public static int calculateComplementaryOffset(char currentLetter, char frequentLetter) {
        int offset = Math.abs(currentLetter - frequentLetter);
        return NUMBER_OF_ALPHABET_LETTERS - offset;
    }

    public static StringBuffer decryptText(String text, int offset) {
        text = getLowerCaseText(text);
        StringBuffer result = new StringBuffer();
        for (int i = 0; i < text.length(); i++) {
            char currentSymbol = text.charAt(i);
            if (isSmallLetter(currentSymbol)) {
                int originalAlphabetPosition = currentSymbol - SMALL_LETTER_A;
                int newAlphabetPosition = (originalAlphabetPosition + offset) % NUMBER_OF_ALPHABET_LETTERS;
                char newLetter = (char) (newAlphabetPosition + SMALL_LETTER_A);
                result.append(newLetter);
            } else {
                result.append(currentSymbol);
            }
        }

        return result;
    }

    public static boolean isSmallLetter(char letter) {
        return letter >= SMALL_LETTER_A && letter <= SMALL_LETTER_Z;
    }

    public static String getLowerCaseText(String text) {
        return text.toLowerCase();
    }
}