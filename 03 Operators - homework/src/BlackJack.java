package com.vso;

import java.util.Scanner;

public class BlackJack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please input the first number: ");
        String number1AsText = scanner.nextLine();
        int number1 = Integer.parseInt(number1AsText);

        System.out.print("Please input the second number: ");
        String number2AsText = scanner.nextLine();
        int number2 = Integer.parseInt(number2AsText);

        boolean whichNumIsHigher = number1 > number2 && number1 <= 21;
        int higherNumber = whichNumIsHigher ? number1 : number2;
        boolean isHigherNumberBelow21 = higherNumber <= 21;
        int finalResult = isHigherNumberBelow21 ? higherNumber : 0;

        System.out.println("Result: " + finalResult);
    }
}
