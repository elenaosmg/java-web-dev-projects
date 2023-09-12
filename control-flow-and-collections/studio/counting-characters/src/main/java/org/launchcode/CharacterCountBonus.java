package org.launchcode;

import com.sun.source.util.SourcePositions;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharacterCountBonus {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);


        System.out.println("Please enter a text to count characters: ");

        String userInput = input.nextLine();//.toLowerCase();

        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";


        char[] charactersInQuote = userInput.toUpperCase().toCharArray();  // now we can iterate through the  characters

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