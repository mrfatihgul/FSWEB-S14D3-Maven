package org.example.company;

public class Ford extends Car{
    public Ford(int cylinders, String name){
        super(cylinders, name);
    }

    @Override
    public void startEngine(){
        System.out.println("digga");
    }

    @Override
    public void accelerate() {
        System.out.println("heyheyhey");
    }

    @Override
    public void brake(){
        System.out.println("whatsup");
    }
}
