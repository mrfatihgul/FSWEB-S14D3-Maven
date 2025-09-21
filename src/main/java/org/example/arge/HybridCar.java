package org.example.arge;

public class HybridCar extends CarSkeleton{
    double avgKmPerLitre;
    int batterySize;
    int cylinders;

    public HybridCar(double avgKmPerLitre, int batterySize, int cylinders, String name, String description) {
        super(name, description);
        this.avgKmPerLitre=avgKmPerLitre;
        this.batterySize=batterySize;
        this.cylinders=cylinders;
    }

    @Override
    public String getDescription() {
        return super.getDescription();
    }

    public double getAvgKmPerLitre() {
        return avgKmPerLitre;
    }

    public int getBatterySize() {
        return batterySize;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    public int getCylinders() {
        return cylinders;
    }

    @Override
    public void startEngine() {
        System.out.println("Starting engine Hybrid Car.");
    }
}
