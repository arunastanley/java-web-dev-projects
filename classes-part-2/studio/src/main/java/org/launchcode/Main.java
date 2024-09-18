package org.launchcode;

public class Main {

    public static void main(String[] args) {
        // write your code here
        MenuItem item1 = new MenuItem("Mac and Cheese",5.99,"something about Mac n Cheese", "Main Course");
        MenuItem item2 = new MenuItem("Chicken Wings",3.99,"something about Chicken Wings", "Appetizer");
        MenuItem item3 = new MenuItem("Spaghetti and meat balls",12.99,"something about Spaghetti and meat balls", "Main Course");
        MenuItem item4 = new MenuItem("Brownies",2.99,"something about Brownies", "Dessert");
        MenuItem item5 = new MenuItem("Onion fritters",5.99,"something about Onion fritters", "Main Course");

//        System.out.println(item1);
//        System.out.println(item2);
//        System.out.println(item3);
//        System.out.println(item4);
//        System.out.println(item5);


        Menu menuList = new Menu();
        menuList.addMenuItem(item1);
        menuList.addMenuItem(item2);
        menuList.addMenuItem(item3);
        menuList.addMenuItem(item4);
        menuList.addMenuItem(item5);

        System.out.println(menuList);

        menuList.removeMenuItem(item3);

        System.out.println(menuList);


    }
}
