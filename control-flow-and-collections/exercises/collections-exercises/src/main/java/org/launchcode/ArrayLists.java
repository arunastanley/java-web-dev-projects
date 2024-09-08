package org.launchcode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class ArrayLists {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

            /*Sum of even nos.*/
//        ArrayList<Integer> numArrayLst = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
//        System.out.println("Sum of even nos: " + ArrayLists.sum(numArrayLst));


//        ArrayList<String> words = new ArrayList<>();
//        words.add("Write");
//        words.add("a");
//        words.add("static");
//        words.add("method");
//        words.add("with");
//        words.add("at");
//        words.add("least");
//        words.add("seven");
//        words.add("words");
//        words.add("array");

        String phrase = "I would not, could not, in a box. " +
                "I would not, could not with a fox. I will not eat them in a house. " +
                "I will not eat them with a mouse.";

        System.out.println("Enter the word length you want: ");
        int len = input.nextInt();

//        ArrayLists.choseByWordLength(words,len);
        ArrayLists.choseByWordLength(phrase, len);
    }

    public static int sum(ArrayList<Integer> numbers){
        int total = 0;
        for(int num: numbers){
            if(num % 2 == 0) {
                total += num;
            }

        }
        return total;
    }


//  public static void choseByWordLength(ArrayList<String> wordList, int wordSize){
public static void choseByWordLength(String wordList, int wordSize){
        System.out.println("Words with string length"+wordSize+" : ");

        String finalString = wordList.replace(".","");
                finalString = finalString.replace(",","");
        String[] stringSplitArray = finalString.split(" ");
        ArrayList<String> aL = new ArrayList<>(Arrays.asList(stringSplitArray));
            for(String word: aL){
            if(word.length() == wordSize){
                System.out.println(word);
            }
        }


        }


}

