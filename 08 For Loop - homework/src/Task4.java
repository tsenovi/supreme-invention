import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("> The Smallest and The Largest number <");

        System.out.print("Insert number or insert 0 to end the program: ");
        String numberAsText = scanner.nextLine();
        int number = Integer.parseInt(numberAsText);

        int min = number;
        int max = number;

        while (true) {
            System.out.print("Insert number or insert 0 to end the program: ");
            numberAsText = scanner.nextLine();
            number = Integer.parseInt(numberAsText);

            if (number == 0) {
                System.out.println("End of program. \nResult: ");
                break;
            }
            if (number > max){
                max = number;
            }
            if (number < min) {
                min = number;
            }
        }
        System.out.println("Smallest number: " + min);
        System.out.println("Largest number: " + max);
    }
}
