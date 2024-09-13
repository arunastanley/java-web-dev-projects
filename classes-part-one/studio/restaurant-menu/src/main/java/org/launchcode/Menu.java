package org.launchcode;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Date;

public class Menu {
    ArrayList<MenuItem> menu = new ArrayList<>();
    Date dateUpdated;
    Scanner input = new Scanner(System.in);


    public void addNewItem(){
        String categM;
        System.out.println("Enter dish name: ");
        String nameM = input.nextLine();
        System.out.println("Enter price: ");
        double priceM = input.nextDouble();
        System.out.println("Enter description: ");
        String descM = input.nextLine();
        System.out.println("Chose category: " +
                "/n 1. Appetizer" +
                "/n 2. Main Course" +
                "/n 3. Dessert");
        int optionCategM = input.nextInt();
        if(optionCategM == 1){
             categM = "Appetizer";
        }
        else if(optionCategM == 2){
             categM = "Main Course";
        }
        else{
             categM = "Dessert";
        }

        MenuItem newItem = new MenuItem(nameM,priceM,descM,categM,"new");
        menu.add(newItem);
        dateUpdated = new Date();


    }


    public void updateItem(String name){
        MenuItem editItem = new MenuItem();
        System.out.println("What do you want to update? " +
                "/n 1. name" +
                "/n 2. price" +
                "/n 3. category");
        int updateOption = input.nextInt();


        for(int i = 0; i < menu.size(); i ++){
            if(menu.get(i).getDishName().equals(name)){
                if(updateOption == 1){
                    System.out.println("Enter new name: ");
                    String newName = input.nextLine();
                    menu.get(i).setDishName(newName);
                }
                else if(updateOption == 2){
                    System.out.println("Enter new price: ");
                    String newPrice = input.nextLine();
                    menu.get(i).setDishName(newPrice);
                }
                else if(updateOption == 3){
                    System.out.println("Enter new category: ");
                    String newCateg = input.nextLine();
                    menu.get(i).setDishName(newCateg);
                }
                else{
                    System.out.println("Item not found");
                }

            }

        }
    }
}
