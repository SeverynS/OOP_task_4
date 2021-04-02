package com.animals;

public class Dog extends Animal{

    boolean isSecurity;

    public Dog(String food, String location) {
        this.food = food;
        this.location = location;
    }

    protected void makeNoise(){
        System.out.println(this + " гавкает");
    }

    protected void eat(){
        System.out.println(" быстро чавкает");
    }
}
