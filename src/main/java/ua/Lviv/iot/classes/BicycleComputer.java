package ua.Lviv.iot.classes;

import ua.Lviv.iot.Enumes.Navigator;

public class BicycleComputer extends BicycleAccessories {
    private int dispayWidening;
    private int battery;
    private String mountingMethod;
    private Navigator navigator;

    public BicycleComputer(String name, double weight, String manufacturer) {
        super(name, weight, manufacturer);
    }

    public int getDispayWidening() {
        return dispayWidening;
    }

    public void setDispayWidening(int dispayWidening) {
        this.dispayWidening = dispayWidening;
    }

    public int getBattery() {
        return battery;
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }

    public String getMountingMethod() {
        return mountingMethod;
    }

    public void setMountingMethod(String mountingMethod) {
        this.mountingMethod = mountingMethod;
    }

    public Navigator getNavigator() {
        return navigator;
    }

    public void setNavigator(Navigator navigator) {
        this.navigator = navigator;
    }

    @Override
    public String toString() {
        return super.toString() + "BicycleComputer{" +
                "dispayWidening=" + dispayWidening +
                ", battery=" + battery +
                ", mountingMethod='" + mountingMethod + '\'' +
                ", navigator=" + navigator +
                '}';
    }

    public BicycleComputer() {
    }
}