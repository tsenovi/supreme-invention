import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("----------- Perfect Number -----------");
        System.out.print("Insert number: ");
        String numberAsText = scanner.nextLine();
        int number = Integer.parseInt(numberAsText);

        int sum = 0;
        int counter = 1;
        while (counter < number) {
            if (number % counter == 0){
                sum += counter;
            }
            counter++;
        }

        if (sum == number){
            System.out.print("The number " + number + " is perfect!");
        } else {
            System.out.print("The number " + number + " is not perfect!");
        }
    }
}
