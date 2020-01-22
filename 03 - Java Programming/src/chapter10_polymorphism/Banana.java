package chapter10_polymorphism;

public class Banana extends Fruit {

    public Banana() {
        calories = 300;
    }

    public void peel() {
        System.out.println("Banana - peeled!");
    }

    @Override
    public void makeJuice() {
        System.out.println("Banana - JUICE!");
    }
}
