import java.util.Scanner;

public class DayOfTheWeek {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insert number from interval [1-7]: ");
        findDay(Byte.parseByte(scanner.nextLine()));
    }

    public static void findDay(byte day) {
        switch (day) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Maybe in another universe");
        }
    }
}
