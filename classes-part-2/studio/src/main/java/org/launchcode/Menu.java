package org.launchcode;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private Date lastUpdated;
    private ArrayList<MenuItem> items = new ArrayList<>();

//    public Menu(Date d, ArrayList<MenuItem> i) {
//        this.lastUpdated = d;
//        this.items = i;
//    }
//
//    public Menu(Date d) {
//        this.lastUpdated = d;
//
//    }


    public void addMenuItem(MenuItem i){
        items.add(i);
        lastUpdated = new Date();

    }

    public void removeMenuItem(MenuItem i){
        items.remove(i);
        lastUpdated = new Date();
    }


    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public void setItems(ArrayList<MenuItem> items) {
        this.items = items;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public ArrayList<MenuItem> getItems() {
        return items;
    }

    @Override
    public String toString() {
        return "Menu: \n" +
                "\n Updated on: " + lastUpdated +
                "\n " + items ;
    }
}


