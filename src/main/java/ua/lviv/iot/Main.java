package ua.lviv.iot;

import ua.lviv.iot.BicycleAccessoriesManeger.BicycleAccessoriesManager;
import ua.lviv.iot.Enumes.TypesManufacturer;
import ua.lviv.iot.classes.BicycleAccessories;
import ua.lviv.iot.classes.BicycleComputer;
import ua.lviv.iot.classes.Flashlight;

import java.util.ArrayList;
import java.util.List;
public final class Main {
   private Main() {
    }
     private static String typesManufacturer;

    public static void main(final String[] args) {
        BicycleAccessoriesManager transportationManager =
                new BicycleAccessoriesManager();

        BicycleAccessories bicycleComputer = new BicycleAccessories("Sdv2000", 350, "Garmain", TypesManufacturer.GARMIN);
        BicycleAccessories flashlight = new BicycleAccessories("221", 12312, "12312", TypesManufacturer.SHIMANO);


        List<BicycleAccessories> mainBicycleAccessoriesList = new ArrayList<>();

        mainBicycleAccessoriesList.add(bicycleComputer);
        mainBicycleAccessoriesList.add(flashlight);

        transportationManager.addBicycleAccessories(bicycleComputer);

        transportationManager.addBicycleAccessories(flashlight);

        System.out.println(
                transportationManager.findByTypesManufacturer(TypesManufacturer.INFINI));
        System.out.println(
                transportationManager.sortByTypesManufacters(
                        mainBicycleAccessoriesList, true));
        System.out.println(
                transportationManager
                        .sortByWeight(mainBicycleAccessoriesList, true));
    }
}
