package org.launchcode;
import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle in cm: ");
        double length = input.nextDouble();
        System.out.println("Enter the width of the rectangle in cm: ");
        double width = input.nextDouble();
        System.out.println("Area of your rectangle= " + length*width +"cms.");
    }
}
