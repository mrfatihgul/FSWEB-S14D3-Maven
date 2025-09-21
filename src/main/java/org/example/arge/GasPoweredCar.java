package org.example.arge;

public class GasPoweredCar extends CarSkeleton{
    double avgKmPerLitre;
    int cylinders;

    public GasPoweredCar(double avgKmPerLitre, int cylinders, String name, String description) {
        super(name, description);
        this.avgKmPerLitre=avgKmPerLitre;
        this.cylinders=cylinders;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getDescription() {
        return super.getDescription();
    }

    public int getCylinders() {
        return cylinders;
    }

    public double getAvgKmPerLitre() {
        return avgKmPerLitre;
    }

    @Override
    public void startEngine() {
        System.out.println("Starting engine Gas Powered Car");
    }
}
