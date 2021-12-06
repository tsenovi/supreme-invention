
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Въведете число в интервала [0..1000]: ");
        String numberText = scanner.nextLine();
        int number = Integer.parseInt(numberText);

        int digitA = number / 100;
        int digitB = (number / 10) % 10;
        int digitC = number % 10;

        String hundreds = "";
        String tens = "";
        String ones = "";

        switch (digitC) {
            case 1 -> ones = "едно";
            case 2 -> ones = "две";
            case 3 -> ones = "три";
            case 4 -> ones = "четири";
            case 5 -> ones = "пет";
            case 6 -> ones = "шест";
            case 7 -> ones = "седем";
            case 8 -> ones = "осем";
            case 9 -> ones = "девет";
            default -> ones = "";
        }

        switch (digitB) {
            case 1 -> tens = "десет";
            case 2 -> tens = "двадесет";
            case 3 -> tens = "тридесет";
            case 4 -> tens = "четиридесет";
            case 5 -> tens = "петдесет";
            case 6 -> tens = "шестдесет";
            case 7 -> tens = "седемдесет";
            case 8 -> tens = "осемдесет";
            case 9 -> tens = "деветдесет";
            default -> tens = "";
        }

        switch (digitA) {
            case 1 -> hundreds = "сто";
            case 2 -> hundreds = "двеста";
            case 3 -> hundreds = "триста";
            case 4 -> hundreds = "четиристотин";
            case 5 -> hundreds = "петстотин";
            case 6 -> hundreds = "шестстотин";
            case 7 -> hundreds = "седемстотин";
            case 8 -> hundreds = "осемстотин";
            case 9 -> hundreds = "деветстотин";
            default -> hundreds = "";
        }

        String numbersFrom10To19 = "";

        if (digitB == 1) {
            tens = "надесет";
            if (digitC == 0) {
                ones = "";
                tens = "десет";
            } else if (digitC == 1) {
                ones = "еди";
            } else if (digitC == 2) {
                ones = "два";
            }
            numbersFrom10To19 = ones + tens;
        }

        String result = "";

        if (number == 0) {
            result = "нула";
        } else if (number < 10) {
            result = ones;
        } else if (number < 100) {
            if (digitB == 1) {
                result = numbersFrom10To19;
            } else if (digitC == 0) {
                result = tens;
            } else {
                result = tens + " и " + ones;
            }
        } else if (number < 1000) {
            if (digitB == 1) {
                result = hundreds + " и " + numbersFrom10To19;
            } else if (digitB == 0 && digitC == 0) {
                result = hundreds;
            } else if (digitC == 0) {
                result = hundreds + " и " + tens;
            } else if (digitB == 0) {
                result = hundreds + " и " + ones;
            } else {
                result = hundreds + " " + tens + " и " + ones;
            }
        } else if (number == 1000) {
            result = "хиляда";
        }

        System.out.println("Резултат: " + result);
    }
}
