package chapter14_finalproject;

import java.util.Random;

public class Coin {

    private String side;
    private static final String HEADS = "Heads";
    private static final String TAILS = "Tails";

    public void flip() {
        if (new Random().nextBoolean()) {
            side = HEADS;
        } else {
            side = TAILS;
        }
    }

    public String getSide() {
        return side;
    }

    public static String getHEADS() {
        return HEADS;
    }

    public static String getTAILS() {
        return TAILS;
    }
}