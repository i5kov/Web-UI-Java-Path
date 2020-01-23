package chapter14_finalproject;

public class Player {

    private final String name;
    private String guess;

    public Player(String name) {
        this.name = name;
    }

    public void setGuess(String guess) {
        this.guess = guess;
    }

    public String getGuess() {
        return guess;
    }

    public String getName() {
        return name;
    }
}
