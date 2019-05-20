package ua.lviv.iot.classes;

import ua.lviv.iot.Enumes.ProducingCountry;
import ua.lviv.iot.Enumes.TypesManufacturer;


public class BicycleAccessories {

    private String name;
    private double weight;
    private String manufacturer;
    private ProducingCountry producingCountry;
    private TypesManufacturer typesManufacturer;


    public BicycleAccessories(
            final String name, final double weight, final String manufacturer, final TypesManufacturer typesManufacturer) {
        this.name = name;
        this.weight = weight;
        this.manufacturer = manufacturer;
        this.typesManufacturer = typesManufacturer;
        this.producingCountry = producingCountry;
    }


    public BicycleAccessories() {
    }

    public String getHeaders() {
        return "Name, " + "Weight, " + "Manufacturer, " + "ProducingCountry, " + "TypesManufacturer, ";
    }

    public String toCSV() {
        return this.getName() + ", " + this.getWeight() + ", " + this.getManufacturer() + ", " + this.getProducingCountry()
                + ", " + this.getTypesManufacturer();
    }


    public final String getName() {
        return name;
    }

    public final void setName(final String name) {
        this.name = name;
    }

    public final double getWeight() {
        return weight;
    }

    public final void setWeight(final double weight) {
        this.weight = weight;
    }

    public final String getManufacturer() {
        return manufacturer;
    }

    public final void setManufacturer(final String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public TypesManufacturer getTypesManufacturer() {
        return typesManufacturer;
    }

    public void setTypesManufacturer(TypesManufacturer typesManufacturer) {
        this.typesManufacturer = typesManufacturer;
    }

    public ProducingCountry getProducingCountry() {
        return producingCountry;
    }

    public void setProducingCountry(ProducingCountry producingCountry) {
        this.producingCountry = producingCountry;
    }
}
