import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("> Happy Numbers [1000-9999] <");
        System.out.println("Result: ");

        for (int number = 1000; number < 10000; number++) {
            int digitA = number / 1000;
            int digitB = (number / 100) % 10;
            int digitC = (number / 10) % 10;
            int digitD = number % 10;

            if ((digitA + digitB) == (digitC + digitD)) {
                System.out.print(number + " ");
            }
            if (number % 1000 == 0) {
                System.out.println();
            }
        }
    }
}
