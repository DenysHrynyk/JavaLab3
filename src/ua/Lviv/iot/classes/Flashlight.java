package ua.Lviv.iot.classes;

import ua.Lviv.iot.Enumes.DistanceOfLighting;

public class Flashlight extends BicycleAccessories {
    private int price;
    private DistanceOfLighting distanceOfLighting;

    public Flashlight(String name, double weight, String manufacterer) {
        super(name, weight, manufacterer);
    }

    public DistanceOfLighting getDistanceOfLighting() {
        return distanceOfLighting;
    }

    public void setDistanceOfLighting(DistanceOfLighting distanceOfLighting) {
        this.distanceOfLighting = distanceOfLighting;
    }

    public Flashlight() {

    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return super.toString() + "Flashlight{" +
                "price=" + price +
                ", distanceOfLighting=" + distanceOfLighting +
                '}';
    }
}
