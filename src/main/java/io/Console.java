package io;

import services.SneakerService;

import java.io.PrintStream;
import java.util.Scanner;

public class Console {
    public static void printWelcome() {
        System.out.println("" +
                "*******************************************\n" +
                "***              Welcome                ***\n" +
                "***                to                   ***\n" +
                "***        ZipCo Inventory Manager      ***\n" +
                "*******************************************");
    }
    public static void printEnd() {
        System.out.println("" +
                "*******************************************\n" +
                "***            Thank you                ***\n" +
                "***            for using                ***\n" +
                "***        ZipCo Inventory Manager      ***\n" +
                "*******************************************");
    }
    public static void print(String output, Object... args) {System.out.printf(output, args);}
    public static void println(String output, Object... args) {print(output + "\n", args);}
    public static String getStringInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        println(prompt);
        String userInput = scanner.nextLine();
        return userInput;
    }

    public static Integer getIntegerInput(String prompt) {
        String userString = Console.getStringInput(prompt);
        Integer result = 0;
        try {
            result = Integer.parseInt(userString.toLowerCase());
        } catch (NumberFormatException numberFormatException) {
            System.out.println("Invalid input!");
            return 0;
        }
        return result;
    }
    public static Double getDoubleInput(String prompt) {
        String userString = Console.getStringInput(prompt);
        Double result = 0.0;
        try {
            result = Double.parseDouble(userString);
        } catch (NumberFormatException numberFormatException) {
            System.out.println("Invalid input!");
            return 0.0;
        }
        return result;
    }
    public static float getFloatInput(String prompt) {
        String userString = Console.getStringInput(prompt);
        float result = 0;
        try {
            result = Float.parseFloat(userString);
        } catch (NumberFormatException numberFormatException) {
            System.out.println("Invalid input!");
            return 0;
        }
        return result;
    }
}