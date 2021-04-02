package com.animals;

public class Cat extends Animal{

    boolean rideOnVacuumCleaner;

    public Cat(String food, String location) {
        this.food = food;
        this.location = location;
    }

    protected void makeNoise(){
        System.out.println(this + " мурчит");
    }

    protected void eat(){
        System.out.println(" медленно поглащает");
    }
}
