package chapter07_arrays;

import java.util.Scanner;

public class DayOfTheWeek {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] daysOfWeek = {"Monday", "Tuesday", "Wednesday", "Thursday",
                              "Friday", "Saturday", "Sunday"};
        System.out.print("Enter number for day of week [1-7]: ");
        int number = scanner.nextInt();
        scanner.close();

        while (number < 1 || number > 7) {
            System.out.println("Invalid input. You have to enter number 1-7");
            number = scanner.nextInt();
        }
        System.out.println(String.format("Day of week: %s", daysOfWeek[number - 1]));
    }
}