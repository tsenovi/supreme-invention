import java.util.Locale;
import java.util.Scanner;

public class MirrorText {

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
        String result = getMirroredPart(text);
        if (result.equals("")) System.out.println("No mirrored part");
        else System.out.println("Mirrored part: " + result);
    }

    public static String getMirroredPart(String text) {
        int textLength = text.length();
        int textHalfLength = textLength / 2;
        String lowerCaseText = text.toLowerCase(Locale.ROOT);

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < textHalfLength; i++) {
            if (lowerCaseText.charAt(i) != lowerCaseText.charAt(textLength - 1 - i)) {
                return builder.toString();
            }

            builder.append(lowerCaseText.charAt(i));
        }

        return builder.toString();
    }
}
