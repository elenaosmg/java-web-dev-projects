package org.launchcode;

import java.util.Scanner;
public class aliceAdventureExtended {
    public static void main (String [] args) {

        String sentence = "Alice was beginning to get very tired " +
                "of sitting by her sister on the bank, and of " +
                "having nothing to do: once or twice she had " +
                "peeped into the book her sister was reading, " +
                "but it had no pictures or conversations in it, " +
                "‘and what is the use of a book,’ " +
                "thought Alice ‘without pictures " +
                "or conversation?’";

        Scanner input = new Scanner (System.in);
        System.out.println ("Enter your search term: ");
        String term = input.next().toLowerCase();
        input.close();


        if (sentence.toLowerCase().contains(term)) {
            Integer index = sentence.toLowerCase().indexOf(term);
            Integer length = term.length();
            System.out.println ("Your search term appears at index: " + index + ". Your term is "
                    + length + " characters long.");
            String newSentence = sentence.replace (term,"") ;
            System.out.println (newSentence);
           } else {
            System.out.println ("false");
        }


    }

}

