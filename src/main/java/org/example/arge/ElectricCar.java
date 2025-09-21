package org.example.arge;

public class ElectricCar extends CarSkeleton{
    double avgKmPerCharge;
    int batterySize;

    public ElectricCar(double avgKmPerCharge, int batterySize, String name, String description) {
        super(name, description);
        this.avgKmPerCharge=avgKmPerCharge;
        this.batterySize=batterySize;
    }

    @Override
    public String getDescription() {
        return super.getDescription();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    public int getBatterySize() {
        return batterySize;
    }

    public double getAvgKmPerCharge() {
        return avgKmPerCharge;
    }

    @Override
    public void startEngine() {
        System.out.println("Starting engine Electric Car");
    }
}
