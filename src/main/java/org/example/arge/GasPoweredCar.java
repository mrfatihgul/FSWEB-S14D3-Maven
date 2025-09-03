package org.example.arge;

public class GasPoweredCar extends CarSkeleton{
    double avgKmPerLitre;
    int cylinders;
    public GasPoweredCar(double avgKmPerLitre, int cylinders, String name, String description){
        super(name, description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
    }

    public double getAvgKmPerLitre() {
        return avgKmPerLitre;
    }

    public int getCylinders() {
        return cylinders;
    }
}
