package org.launchcode;


public class Array {
    public static void main(String[] args) {

        /*Array prac 1 n 2*/
//        int[] arrayVals = {1, 1, 2, 3, 5, 8};
//
//        for(int val: arrayVals ){
//            if (val%2 != 0) {
//                System.out.println(val);
//            }
//        }

        String testString = "I would not, could not, in a box. " +
                "I would not, could not with a fox. I will not eat " +
                "them in a house. I will not eat them with a mouse.";

        String[] sentenceSplit = testString.split("\\.");
        for(String word: sentenceSplit) {
            System.out.println(word);
        }
//        System.out.println(Arrays.toString(sentenceSplit));
    }

}
