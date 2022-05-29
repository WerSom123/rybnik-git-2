package pl.sda.ptools;

import java.util.Scanner;

public class MyFirstIfs {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter number a: ");
        int a = scanner.nextInt();
        System.out.print("Please enter number b: ");
        int b = scanner.nextInt();
        if (a > b) {
            printMessageWithNewLine("a is greater than b");
            System.out.println("The number is langer than max.");
        }
        if (a < b) {
            System.out.println("The number is smaller than max.");
        }
        if (a == b) {
            System.out.println("The number is equal than max.");

        }

    }

    private static void printMessageWithNewLine (String message) {
        System.out.println(message);
    }
}
