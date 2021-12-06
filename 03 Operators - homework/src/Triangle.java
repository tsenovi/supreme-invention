

import java.util.Scanner;

public class Triangle {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please input the first side: ");
        String side1AsText = scanner.nextLine();
        int side1 = Integer.parseInt(side1AsText);

        System.out.print("Please input the second side: ");
        String side2AsText = scanner.nextLine();
        int side2 = Integer.parseInt(side2AsText);

        System.out.print("Please input the third side: ");
        String side3AsText = scanner.nextLine();
        int side3 = Integer.parseInt(side3AsText);

        boolean side1and2BiggerThan3 = (side1 + side2) > side3;
        boolean side1and3BiggerThan2 = (side1 + side3) > side2;
        boolean side2and3BiggerThan1 = (side2 + side3) > side1;

        boolean isTriangle = side1and2BiggerThan3 && side1and3BiggerThan2 && side2and3BiggerThan1;

        String result = isTriangle ? "Triangle exists with those sides." : "Triangle does not exists with those sides!";
        System.out.println(result);
    }
}
