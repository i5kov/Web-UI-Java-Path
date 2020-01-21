package chapter07_arrays;

import java.util.Random;

public class LotteryTicket {

    private static final int TICKET_NUMBERS = 6;
    private static final int MAX_NUMBERS = 49;

    public static void main(String[] args) {
        int[] ticket = getLotteryTicket();
        printLotteryTicket(ticket);
    }

    private static int[] getLotteryTicket() {
        int[] ticket = new int[TICKET_NUMBERS];
        Random random = new Random();

        for (int i = 0; i < TICKET_NUMBERS; i++) {
            ticket[i] = random.nextInt(MAX_NUMBERS) + 1;
        }

        return ticket;
    }

    private static void printLotteryTicket(int... ticket) {
        for (int value : ticket) {
            System.out.print(value + " | ");
        }
    }
}