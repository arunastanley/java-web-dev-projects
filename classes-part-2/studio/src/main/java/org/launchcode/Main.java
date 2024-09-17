package org.launchcode;

import java.util.ArrayList;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        // write your code here
        MenuItem newItem = new MenuItem(5,"something about MacnCheese", "Main Course", true);
        Menu fullMenu = new Menu(new Date());
        fullMenu.addMenuItem(newItem);



    }
}
