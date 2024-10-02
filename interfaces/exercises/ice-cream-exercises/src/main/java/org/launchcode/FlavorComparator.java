package org.launchcode;

import java.util.Comparator;

public class FlavorComparator implements Comparator<Flavor> {
    @Override
    public int compare(Flavor flav1, Flavor flav2) {

        return Integer.compare(flav1.getAllergens().size() - flav2.getAllergens().size(), 0);
    }

//    @Override
//    public int compare(Flavor flav1, Flavor flav2) {
//        return flav1.getName().compareTo(flav2.getName());
//    }




}
