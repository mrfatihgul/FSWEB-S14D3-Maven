package org.example.company;

public class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name){
        this.cylinders = cylinders;
        this.name = name;
        this.engine = true;
        this.wheels = 4;

    }

    public String getName(){
        return name;
    }

    public int getCylinders(){
        return cylinders;
    }

    public String toString(){
        return "Ben muz seviyorum";
    }

    public boolean equals(String name, int cylinders){
        if (this.name == name && this.cylinders == cylinders){
            return true;
        } else {
            return false;
        }
    }

    public void startEngine(){
        System.out.println(getClass().getSimpleName() + ": the car's engine is starting");
    }

    public void accelerate(){
        System.out.println(getClass().getSimpleName() + ": the car is accelerating");
    }

    public void brake(){
        System.out.println(getClass().getSimpleName() + ": the car is breaking");
    }
}
