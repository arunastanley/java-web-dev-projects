package org.launchcode;
import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the radius: ");
        String radiusString = input.nextLine();

        /*Validating space, non-numeric and -ve no.*/
        while(!Circle.validation(radiusString)) {
            System.out.println("Enter valid radius: ");
            radiusString = input.nextLine();
        }
        /*Calculating area*/
            double radiusDouble = Double.parseDouble(radiusString);
            System.out.println("The area of a circle of radius " + radiusDouble + " is: " + Circle.getArea(radiusDouble));

    }
}
