package org.example;

public class Main {
    public static void main(String[] args) {

        System.out.println(isOfFullAge(17));
    }

    public static String isOfFullAge(int age) {

        if (age < 18) {

            return "You are too young";

        } else {

            return "Welcome go in and pay your Entrancefee";

        }
    }

    public static int addTwoNumbers(int value1, int value2) {
        return value1 + value2;

    }

    public static boolean isEven(int numberToCheck) {
        return numberToCheck % 2 == 0;
    }

    public static int multiply(int value1, int value2) {
        return value1 * value2;
    }

    public static String toUpperCase(String text) {
        return text.toUpperCase();

    }

    public static boolean isPositive(int number) {
        return number >= 0;
    }
}
