package org.launchcode;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class MenuItem {
    private String name;
    private double price;
    private String description;
    private String category;
    LocalDate date ;
    private boolean isNew;
    String markNew;


    // constructors
    public MenuItem(String n, double p, String d, String c) {
        this.name = n;
        this.price = p;
        this.description = d;
        this.category = c;
        this.date = LocalDate.now();
        this.isNew = this.isItemNew();
        this.markNew = this.isItemNew()?"NEW!": "";
    }


    //getters and setters

    public LocalDate getDate() {
        return date;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }

    //methods:

// overriding string:

    @Override
    public String toString() {
        return  "\n '" + name + "'   " + markNew + " | $"+ price +
                "\n '" + description + '\'' +
                "\n  category: '" + category + '\''+ "\n" ;

    }

    // is  menu item new
    boolean isItemNew(){
        LocalDate today = LocalDate.now();
        double daysBetween = this.getDate().until(today, ChronoUnit.DAYS);
        return  daysBetween < 60;
    }
}





