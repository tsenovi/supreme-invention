import java.util.Scanner;

public class Glasses {

    public static void main(String[] args) {
        int side = getSide();
        printGlasses(side);
    }

    public static void printGlasses(int side) {
        for (int row = 1; row <= side; row++) {
            printGlass(side, row);
            printMiddlePart(side, row);
            printGlass(side, row);
            printNewLine();
        }
    }

    public static void printGlass(int side, int row) {
        for (int col = 1; col <= side * 2; col++) {
            if ((row != 1) && (row != side) && (col != 1) && (col != side * 2)) {
                printSlashes();
            } else {
                printStars();
            }
        }
    }

    public static void printMiddlePart(int side, int row) {
        for (int col = 1; col <= side; col++) {
            if (((side + 1) / 2) == row) {
                printPipes();
            } else {
                printSpaces();
            }
        }
    }

    public static void printStars() {
        System.out.print("*");
    }

    public static void printSlashes() {
        System.out.print("/");
    }

    public static void printSpaces() {
        System.out.print(" ");
    }

    public static void printPipes() {
        System.out.print("|");
    }

    public static void printNewLine() {
        System.out.println();
    }

    public static void printErrorMessage() {
        System.out.println("Invalid input");
    }

    public static int getSide() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input side in range [3-100]: ");
        int side = scanner.nextInt();

        while (side < 3 || side > 100) {
            printErrorMessage();
            System.out.println("Input side in range [3-100]: ");
            while (!scanner.hasNextInt()) {
                printErrorMessage();
                scanner.next();
            }
            side = scanner.nextInt();
        }
        return side;
    }
}
