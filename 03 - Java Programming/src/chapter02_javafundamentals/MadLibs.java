package chapter02_javafundamentals;

import java.util.Scanner;

public class MadLibs {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter season of the year: ");
        String season = scanner.nextLine();

        System.out.print("Enter adjective: ");
        String adjective = scanner.nextLine();

        System.out.print("Enter whole number: ");
        int number = scanner.nextInt();

        System.out.printf("On a %s %s day, I drink a minimum of %d cups of coffee", adjective, season, number);
    }
}