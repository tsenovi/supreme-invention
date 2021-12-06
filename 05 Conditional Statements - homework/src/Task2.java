import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input points [1-9]: ");
        String pointsAsText = scanner.nextLine();
        int points = Integer.parseInt(pointsAsText);

        switch (points) {
            case 1, 2, 3 -> {
                points = points * 10;
                System.out.println("Total points with bonus: " + points);
            }
            case 4, 5, 6 -> {
                points = points * 100;
                System.out.println("Total points with bonus: " + points);
            }
            case 7, 8, 9 -> {
                points = points * 1000;
                System.out.println("Total points with bonus: " + points);
            }
            default -> System.out.println("Invalid points!");
        }
    }
}
