package chapter13_exceptions;

public class Dividing {

    public static void main(String[] args) {

        try {
            int c = 30 / 0;
        } catch (ArithmeticException e) {
            System.out.println("You cannot divide by zero!!!");
        } finally {
            System.out.println("Division is fun");
        }
    }

}
