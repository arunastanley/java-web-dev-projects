package org.launchcode;
import java.util.Scanner;

public class AliceAdventures {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String aliceAdventure = "Alice was beginning to get very tired of sitting by " +
                "her sister on the bank, and of having nothing to do: once or twice " +
                "she had peeped into the book her sister was reading, but it had no " +
                "pictures or conversations in it, ‘and what is the use of a book,’ " +
                "thought Alice ‘without pictures or conversation?’";
        System.out.println("Enter the search string: ");
        String searchString = input.nextLine();

        if(aliceAdventure.toLowerCase().contains(searchString.toLowerCase())){
            System.out.println(searchString + " was found");
        }else{
            System.out.println(searchString + " was not found");
        }


        System.out.println("Index of " + searchString + ": " + aliceAdventure.indexOf(searchString));
        int searchStringLength = searchString.length();
        System.out.println("Length of " + searchString + " :"+ searchStringLength);

        System.out.println(aliceAdventure.replace(searchString,""));

        /*Using array split with search string as the delimiter*/
//        String[] updatedString = aliceAdventure.toLowerCase().split(searchString.toLowerCase());
//        for (String s : updatedString){
//            System.out.println(s + " ") ;
//        }

    }
}
