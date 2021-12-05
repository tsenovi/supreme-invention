import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        printIntro();
        String yearText = scanner.nextLine();
        int year = Integer.parseInt(yearText);
        boolean result = isLeap(year);
        System.out.println("Result: " + result);
    }

    public static void printIntro() {
        System.out.println("Check if an year is leap or not");
        System.out.print("Insert year: ");
    }

    private static boolean isLeap(int year) {
        if ((year % 4 == 0) && (year % 100 != 0)) {
            return true;
        } else if (year % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
