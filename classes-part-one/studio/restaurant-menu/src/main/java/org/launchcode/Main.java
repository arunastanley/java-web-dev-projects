package org.launchcode;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your choice " +
                "/n 1. Add new Menu Item" +
                "/n 2. Edit existing Menu item" +
                "/n 3. Display Menu");
        int option = input.nextInt();

        if (option == 1) {
            Menu menuObj = new Menu();
            menuObj.addNewItem();
        }
        if (option == 2) {
            System.out.println("Name the dish you would like to update?");
            String nam = input.nextLine();
        }

    }

}