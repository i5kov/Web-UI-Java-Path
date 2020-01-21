package chapter04_loops;

import java.util.Random;

public class RollDieGame {

    public static void main(String[] args) {

        Random random = new Random();
        int gameBoardSpaces = 20;
        int dieRolls = 5;
        int currentSpace = 0;

        for (int i = 1; i <= dieRolls; i++) {
            int die = random.nextInt(6) + 1;
            currentSpace += die;
            int neededSpaces = gameBoardSpaces - currentSpace;
            System.out.print(String.format("Roll #%d: You've rolled a %d. ", i, die));

            if (currentSpace == gameBoardSpaces) {
                System.out.print("You're on space " + currentSpace + ". Congrats, you win!");
                break;
            } else if (currentSpace > gameBoardSpaces) {
                System.out.print("Unfortunately, that takes you past " + gameBoardSpaces + " spaces. You lose!");
                break;
            } else if (i == dieRolls) {
                System.out.println("You're on space " + currentSpace + ".");
                System.out.println("Unfortunately, you didn't make it to all " +
                        gameBoardSpaces + " spaces. You lose!");
            } else {
                int spacesToGo = gameBoardSpaces - currentSpace;
                System.out.print("You are now on space " + currentSpace +
                        " and have " + spacesToGo + " more to go.");
            }

            System.out.println();
        }

    }

}
