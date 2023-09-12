package org.launchcode;
import java.io.FileNotFoundException;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharacterCountSuperBonus {

    public static void main(String[] args) {

        String quoteFromFile = "";

        try {
            File textFromFile = new File ("src/main/java/org/launchcode/quote.txt");
            Scanner myReader = new Scanner(textFromFile);
            if (myReader.hasNextLine()) {
                quoteFromFile = myReader.nextLine();
            }
            myReader.close();

        } catch (FileNotFoundException e) {
            System.out.println("Can not read a quote from file.");
        }

        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";


        char[] charactersInQuote = quoteFromFile.toUpperCase().toCharArray();  // now we can iterate through the  characters

        // create smth that will store the characters:

        HashMap<Character, Integer> charactersCount = new HashMap<>();

        for (char letter : charactersInQuote) {

            if (alphabet.indexOf(letter) >= 0) {
                if (charactersCount.containsKey(letter)) {
                    charactersCount.put(letter, charactersCount.get(letter) + 1);
                } else {
                    charactersCount.put(letter, 1);
                }
            }

        }
        for (Map.Entry<Character, Integer> entry : charactersCount.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }




    }
}
