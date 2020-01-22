package chapter08_datatypes;

import java.util.Scanner;

public class PrintBackwardsString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter some text: ");
        String text = scanner.nextLine();

        System.out.println(String.format("Your text is [%s] and backwards result is [%s]",
                                        text,
                                        printBackwardsText(text)));
    }

    public static String printBackwardsText(String text) {
        StringBuilder sb = new StringBuilder();
        for (int i = text.length() - 1; i >= 0; i--) {
            sb.append(text.charAt(i));
        }
        return sb.toString();
    }
}
