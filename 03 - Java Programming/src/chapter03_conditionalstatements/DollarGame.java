package chapter03_conditionalstatements;

import java.util.Scanner;

public class DollarGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many pennies would you like?");
        double pennies = scanner.nextDouble();

        System.out.print("How many nickels would you like?");
        double nickels = scanner.nextDouble();

        System.out.print("How many dimes would you like?");
        double dimes = scanner.nextDouble();

        System.out.print("How many quarters would you like?");
        double quarters = scanner.nextDouble();

        scanner.close();

        double pennieToDollar = 0.01;
        double nickelToDollar = 0.05;
        double dimesToDollar = 0.1;
        double quarterToDollar = 0.25;
        double requirementDollar = 1;

        double dollars = (pennies * pennieToDollar) + (nickels * nickelToDollar) +
                         (dimes * dimesToDollar) + (quarters * quarterToDollar);
        double wentOverDollars = dollars -requirementDollar;
        double wentUnderDollars = requirementDollar - dollars;

        if (dollars == requirementDollar) {
            System.out.println("Congrats! You win!");
        } else if (dollars > requirementDollar) {
            System.out.println(String.format("Sorry, but it's more than $%s. You went over with $%.2f",
                                            requirementDollar, wentOverDollars));
        } else {
            System.out.println(String.format("Sorry, but it's less than $%s. You went under with $%.2f",
                                             requirementDollar, wentUnderDollars));
        }
    }
}