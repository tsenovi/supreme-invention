package com.vso;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number: ");
        String numberAsText = scanner.nextLine();
        int number = Integer.parseInt(numberAsText);

        int differenceWith21 = number - 21;

        if (differenceWith21 < 0) {
            System.out.println("Absolute difference: " + (differenceWith21 * (-1)));
        } else if (differenceWith21 > 21) {
            System.out.println("Absolute difference: " + (differenceWith21 * 2));
        } else {
            System.out.println("Absolute difference: " + differenceWith21);
        }
    }
}
