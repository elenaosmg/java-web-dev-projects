package org.launchcode;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;


public class ArrayListExample {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        double evensSum = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                evensSum += numbers[i];
            }
        }

        String words = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String [] splitWords = words.split ("");
        System.out.println(Arrays.toString(splitWords));
       //String[] wordInTheList = {"one", "two", "three", "four", "five", "seven"};

        ArrayList <String> strList = new ArrayList <String> (Arrays.asList(splitWords));
        Scanner input = new Scanner (System.in);
        System.out.println("Enter a word length: ");
        int numChars = input.nextInt();
        for (String word: strList) {
            if (word.length() == numChars) {
                System.out.println(word);
            }
        }

    }
}