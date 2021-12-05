package com.vso;

public class Car {
    public static void main(String[] args) {
        byte age = 5;
        int price = 30000;

        boolean isHighCLass = (age > 5 && price >= 20000) || (age <= 5 && price >= 40000);
        String result = isHighCLass ? "The car is high class" : "The car is not high class";

        System.out.println(result);
    }
}
