package org.launchcode;

public class HouseCat extends Cat {
    private String name;
    private String species = "Felis catus";

    public HouseCat(String aName, double aWeight) {
        super(aWeight);
        name = aName;
    }
    public HouseCat(String aName) {
        name = aName;
    }

    public static void main(String[] args) {
        HouseCat ginger = new HouseCat("Gingy", 10);
        ginger.sleep();
        System.out.println("After sleep");
        System.out.println("tired: "+ ginger.isTired());
        System.out.println("hungry: "+ ginger.isHungry());

        ginger.eat();
        System.out.println("After eat");
        System.out.println("hungry: "+ ginger.isHungry());
        System.out.println("tired: "+ ginger.isTired());
        System.out.println(ginger.noise());
        HouseCat spike = new HouseCat("Spike");
        System.out.println(spike.getWeight()); // prints 13
    }

    public boolean isSatisfied() {
        return !isHungry() && !isTired();
    }

    @Override
    public String noise() {
        return "Hello, my name is " + name + "!";
    }

    public String purr() {
        return "I'm a org.launchcode.HouseCat";
    }
}