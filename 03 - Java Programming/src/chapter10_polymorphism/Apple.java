package chapter10_polymorphism;

public class Apple extends Fruit {

    public Apple() {
        calories = 100;
    }

    public void removeSeeds() {
        System.out.println("Apple - seeds removed!");
    }

    @Override
    public void makeJuice() {
        System.out.println("Apple - JUICE!");
    }


}
