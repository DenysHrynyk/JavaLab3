package ua.Lviv.iot.classes;

import ua.Lviv.iot.Enumes.ProducingCountry;
import ua.Lviv.iot.Enumes.TypesManufacturer;

public class BicycleAccessories {
    private String name;
    private double weight;
    private String manufacturer;
    private ProducingCountry producingCountry;
    private TypesManufacturer typesManufacturer;

    public BicycleAccessories(String name, double weight, String manufacturer) {
        this.name = name;
        this.weight = weight;
        this.manufacturer = manufacturer;
    }

    public BicycleAccessories() {
    }

    @Override
    public String toString() {
        return "BicycleAccessories{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", manufacturer='" + manufacturer + '\'' +
                ", producingCountry=" + producingCountry +
                ", typesManufactrer=" + typesManufacturer +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public boolean getTypesManufacturer() {
        return true;
    }
}