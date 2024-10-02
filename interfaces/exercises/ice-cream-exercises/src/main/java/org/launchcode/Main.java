package org.launchcode;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Case menu = new Case();
        ArrayList<Flavor> flavors = menu.getFlavors();
        ArrayList<Cone> cones = menu.getCones();
        Comparator<Flavor> comparator = new FlavorComparator();


        System.out.println("\nBefore:");
        for(Flavor flavor: flavors) {
            System.out.println(flavor);
        }
        // TODO: Use a Comparator class to sort the 'flavors' array alphabetically by the 'name' field.
        flavors.sort(comparator);
        System.out.println("\nAfter:");
        for(Flavor flavor: flavors) {
            System.out.println(flavor);
        }


        // TODO: Use a Comparator class to sort the 'cones' array in increasing order by the 'cost' field.

        System.out.println("Before: ");
        for(Cone eachCone: cones){
            System.out.println(eachCone);
        }

        Comparator<Cone> coneComparator = new ConeComparator();
        cones.sort(coneComparator);

        System.out.println("\n After: ");
        for(Cone eachCone: cones){
            System.out.println(eachCone);
        }


        // TODO: Print the 'flavors' and 'cones' lists (in a clear manner) to verify the sorting.


    }
}