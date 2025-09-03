package org.example.arge;

public class CarSkeleton {
    String name;
    String description;

    public String getName(){
        return name;
    }

    public String getDescription() {
        return description;
    }

    public CarSkeleton(){

    }

    public CarSkeleton(String name, String description){
        this.name = name;
        this.description = description;
    }

    public void startEngine(){
        System.out.println("heyhey");
    }

    public void drive(){
        System.out.println("heyolmayanhey");
        runEngine();
    }

    protected void runEngine(){
        System.out.println("ranet");
    }
}
