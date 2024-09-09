package org.launchcode;
import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of miles you have driven: ");
        double miles = input.nextDouble();
        System.out.println("Enter the amount of gas you’ve consumed (in gallons): ");
        double gasUsed = input.nextDouble();
        System.out.println("Gas Mileage: " + miles/gasUsed + " Miles per gallon");
    }
}
