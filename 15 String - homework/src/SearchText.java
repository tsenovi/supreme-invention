import java.util.Scanner;

public class SearchText {

    public static void main(String[] args) {
        readConsole();
    }

    private static void readConsole() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insert text: ");
        String text = scanner.nextLine();
        System.out.print("Insert subtext: ");
        String subText = scanner.nextLine();
        printResult(text, subText);
    }

    private static void printResult(String text, String subText) {
        int result = countOccurrencesOfSubTextInText(text, subText);
        System.out.println("Number of Occurrences for the subtext is: " + result);
    }

    public static int countOccurrencesOfSubTextInText(String text, String subText) {
        String textToLowerCase = text.toLowerCase();
        String subTextToLowerCase = subText.toLowerCase();

        int counter = 0;
        int currentSubTextIndex = 0;
        while ((currentSubTextIndex = textToLowerCase.indexOf(subTextToLowerCase, currentSubTextIndex)) != -1) {
            currentSubTextIndex++;
            counter++;
        }

        return counter;
    }
}
