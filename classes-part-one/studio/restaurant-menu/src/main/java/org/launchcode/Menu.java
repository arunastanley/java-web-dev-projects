package org.launchcode;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Date;

public static class Menu {
    private ArrayList<MenuItem> fullMenu = new ArrayList<>();
    private Date dateUpdated;
    Scanner input = new Scanner(System.in);


    public void addNewItem(String nameM,double priceM,String descM,String categM){

        MenuItem newItem = new MenuItem(nameM,priceM,descM,categM);
        fullMenu.add(newItem);
        dateUpdated = new Date();
        System.out.println("Menu updated on: " + dateUpdated + "/n");

        }


    }

//    public void displayMenu(ArrayList fullMenu){
//        for(MenuItem eachItem: fullMenu){
//            System.out.println(eachItem);
//    }


    public void updateItem(String name){
        MenuItem editItem = new MenuItem();
        System.out.println("What do you want to update? " +
                "/n 1. name" +
                "/n 2. price" +
                "/n 3. category");
        int updateOption = input.nextInt();


        for(int i = 0; i < fullMenu.size(); i ++){
            if(fullMenu.get(i).getDishName().equals(name)){
                if(updateOption == 1){
                    System.out.println("Enter new name: ");
                    String newName = input.nextLine();
                    fullMenu.get(i).setDishName(newName);
                }
                else if(updateOption == 2){
                    System.out.println("Enter new price: ");
                    String newPrice = input.nextLine();
                    fullMenu.get(i).setDishName(newPrice);
                }
                else if(updateOption == 3){
                    System.out.println("Enter new category: ");
                    String newCateg = input.nextLine();
                    fullMenu.get(i).setDishName(newCateg);
                }
                else{
                    System.out.println("Item not found");
                }

            }

        }
    }

}
