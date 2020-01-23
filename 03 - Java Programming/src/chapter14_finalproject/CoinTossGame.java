package chapter14_finalproject;

import java.util.Scanner;

public class CoinTossGame {

    private static final Scanner scanner = new Scanner(System.in);
    private static String playerChoice;

    public static void main(String[] args) {
        Player player1 = new Player("Ivan");
        Player player2 = new Player("Dani");
        Coin coin = new Coin();

        System.out.println("Select a choice: ");
        boolean isValidChoice = playerChoice();

        while (!isValidChoice) {
            System.out.println("Invalid Choice of Player 1. Please select once again.");
            isValidChoice = playerChoice();
        }
        player1.setGuess(playerChoice);
        setOtherPlayerChoice(player1, player2);
        coin.flip();

        if (player1.getGuess().equals(coin.getSide())) {
            System.out.println("Player 1: " + player1.getName() + " win the game!");
        } else {
            System.out.println("Player 2: " + player2.getName() + " win the game!");
        }
    }


    private static boolean playerChoice() {
        playerChoice = scanner.nextLine();
        return playerChoice.equals(Coin.getHEADS()) || playerChoice.equals(Coin.getTAILS());
    }

    private static void setOtherPlayerChoice(Player p1, Player p2) {
        if (p1.getGuess().equals(Coin.getHEADS())) {
            p2.setGuess(Coin.getTAILS());
        } else {
            p2.setGuess(Coin.getHEADS());
        }
    }
}