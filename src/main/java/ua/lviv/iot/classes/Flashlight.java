package ua.lviv.iot.classes;

import ua.lviv.iot.Enumes.DistanceOfLighting;
import ua.lviv.iot.Enumes.TypesManufacturer;

public class Flashlight extends BicycleAccessories {
    private int price;
  private DistanceOfLighting distanceOfLighting;


    @Override
    public String getHeaders() {
        return super.getHeaders();
    }

    @Override
    public String toCSV() {
        return super.toCSV();
    }

    public Flashlight(final String name, final double weight,
                      final String manufacterer) {
        super(name, weight, manufacterer, TypesManufacturer.INFINI);
    }


    public final DistanceOfLighting getDistanceOfLighting() {
        return distanceOfLighting;
    }


    public final void setDistanceOfLighting(
            final DistanceOfLighting distanceOfLighting) {
        this.distanceOfLighting = distanceOfLighting;
    }

  public Flashlight() {

    }


    public final int getPrice() {
        return price;
    }


    public final void setPrice(final int price) {
        this.price = price;
    }

    public void setTypesManufacturer() {
        this.setTypesManufacturer();
    }
}
