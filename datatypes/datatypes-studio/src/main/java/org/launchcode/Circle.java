package org.launchcode;


public class Circle {
    public static Double getArea(double radius){
        return 3.14 * radius * radius;
    }

    public static boolean validation(String radius){
        String regex = "-?\\d+" ;

        if (radius.isEmpty()){
            System.out.println("Radius cannot be empty");
            return false;
        }
        if(!radius.matches(regex)){
            System.out.println("Radius cannot be alphabets or special characters.");
            return false;
        }

        double radiusDouble = Double.parseDouble(radius);
        if(radiusDouble < 0){
            System.out.println("Radius cannot be a negative no.");
            return false;
        }
        else {return true;}


    }
}