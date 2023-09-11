package org.launchcode;

import java.util.HashMap;
import java.util.Map;

public class CharacterCount {

    public static void main(String[] args) {
        String quote = "f the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";

        char[] charactersInQuote = quote.toCharArray();  // now we can iterate through the  characters

        // create smth that will store the characters:

        HashMap <Character, Integer> charactersCount =  new HashMap <> ();

        for  (char letter: charactersInQuote ) {
             if (charactersCount.containsKey(letter)) {
                 charactersCount.put(letter,charactersCount.get(letter)+1);

             }else {
                 charactersCount.put (letter, 1);


             }

        }
        for (Map.Entry <Character, Integer> entry :charactersCount.entrySet()) {
            System.out.println(entry.getKey()+ ":"+ entry.getValue());
        }

    }
}
