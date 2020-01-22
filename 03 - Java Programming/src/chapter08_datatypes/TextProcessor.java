package chapter08_datatypes;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TextProcessor {

    public static void main(String[] args) {
        int numberOfWords = countWords("I love Test Automation Tutorials");
        System.out.println("Number of words is: " + numberOfWords);
    }

    public static int countWords(String s) {
        String[] result = s.split(" ");
        return result.length;
    }
}