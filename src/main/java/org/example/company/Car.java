package org.example.company;

public class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.engine=true;
        this.cylinders=cylinders;
        this.name=name;
        this.wheels=4;
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public boolean equals(Object obj) {
        Car otherCar = (Car) obj;
        if (this.name.equals(otherCar.name) && this.cylinders == otherCar.cylinders) {
            return true;
        } else {
            return false;
        }
    }

    public String startEngine() {
        System.out.println(getClass().getSimpleName());
        return "the car's engine is starting";
    }

    public String accelerate() {
        System.out.println(getClass().getSimpleName());
        return "the car's engine is starting";
    }

    public String  brake() {
        System.out.println(getClass().getSimpleName());
        return "the car's engine is starting";
    }


}
