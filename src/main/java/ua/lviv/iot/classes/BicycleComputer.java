package ua.lviv.iot.classes;

import ua.lviv.iot.Enumes.Navigator;
import ua.lviv.iot.Enumes.TypesManufacturer;

public class BicycleComputer extends BicycleAccessories {
   private int dispayWidening;
   private int battery;
   private String mountingMethod;
 private Navigator navigator;


    public BicycleComputer(
            final String name, final double weight,
            final String manufacturer) {
        super(name, weight, manufacturer, TypesManufacturer.GARMIN);
    }


    public final int getDispayWidening() {
        return dispayWidening;
    }

    /**
     *
     * @param dispayWidening displayWidening
     */
    public final void setDispayWidening(final int dispayWidening) {
        this.dispayWidening = dispayWidening;
    }

    /**
     *
     * @return battery battery
     */
    public final int fgetBattery() {
        return battery;
    }

    /**
     *
     * @param battery battery
     */
    public final void setBattery(final int battery) {
        this.battery = battery;
    }

    /**
     *
     * @return mountingMethod mountingMethod
     */
    public final String getMountingMethod() {
        return mountingMethod;
    }

    /**
     *
     * @param mountingMethod mountingMethod
     */
    public final void setMountingMethod(final String mountingMethod) {
        this.mountingMethod = mountingMethod;
    }

    /**
     *
     * @return navigator navigator
     */
    public final Navigator getNavigator() {
        return navigator;
    }

    /**
     *
     * @param navigator navigator
     */
    public final void setNavigator(final Navigator navigator) {
        this.navigator = navigator;
    }

 public BicycleComputer() {
    }
}
