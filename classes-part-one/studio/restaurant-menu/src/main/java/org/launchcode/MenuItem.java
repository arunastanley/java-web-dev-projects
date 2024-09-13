package org.launchcode;

public class MenuItem {
    private String dishName;
    private double price;
    private String description;
    private String category;
    private String status;

    public String getDishName() {
        return dishName;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public String getCategory() {
        return category;
    }

    public String getStatus() {
        return status;
    }

    public void setDishName(String aDishName) {
        this.dishName = aDishName;
    }

    public void setPrice(double aPrice) {
        this.price = aPrice;
    }

    public void setDescription(String aDescription) {
        this.description = aDescription;
    }

    public void setCategory(String aCategory) {
        this.category = aCategory;
    }

    public void setStatus(String aStatus) {
        this.status = aStatus;
    }

    public MenuItem(String dishName, double price, String description, String category, String status){
        this.dishName = dishName;
        this.price = price;
        this.description = description;
        this. category = category;
        this. status = status;
    }

    public MenuItem(){
        this.dishName = dishName;
        this.price = price;
        this.description = description;
        this. category = category;
        this. status = status;
    }

}
