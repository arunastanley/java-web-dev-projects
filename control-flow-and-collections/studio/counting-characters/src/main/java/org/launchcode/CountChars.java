package org.launchcode;

import java.util.HashMap;
import  java.util.Map;
import  java.util.Scanner;


public class CountChars {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your phrase: ");
        String phraseVar = input.nextLine();

        phraseVar = phraseVar.toLowerCase();

        // Regex pattern to match (using corrected escape sequence for digits)
        String regexPattern = "[^a-zA-Z:]";

        // replacement string
        String replacementString = "";

        // replace all occurrences of the pattern in the input string
        phraseVar = phraseVar.replaceAll(regexPattern, replacementString);


//        String phraseVar = "If the product of two terms is zero then common sense says at " +
//                "least one of the two terms has to be zero to start with. " +
//                "So if you move all the terms over to one side, you can put the " +
//                "quadratics into a form that can be factored allowing that side of the " +
//                "equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";

        char[] charArray = phraseVar.toCharArray();
        HashMap<Character, Integer> charMap = new HashMap<>();

        for (int i = 0; i < charArray.length; i++){
            charMap.put(charArray[i], charMap.getOrDefault(charArray[i], 0) + 1);
        }

       for(Map.Entry<Character,Integer> mapElem : charMap.entrySet()){
            System.out.println(mapElem.getKey() + ": " + mapElem.getValue());
        }
    }
}
