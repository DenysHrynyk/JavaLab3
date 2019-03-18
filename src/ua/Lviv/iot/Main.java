package ua.Lviv.iot;

import ua.Lviv.iot.BicycleAccessoriesManeger.BicycleAccessoriesManager;
import ua.Lviv.iot.Enumes.TypesManufacturer;
import ua.Lviv.iot.classes.BicycleAccessories;
import ua.Lviv.iot.classes.BicycleComputer;
import ua.Lviv.iot.classes.Flashlight;

import java.util.ArrayList;
import java.util.List;


public class Main {
    private static String manufacturer;

    public static void main(String[] args) {
        BicycleAccessories object = new BicycleAccessories();
        BicycleAccessoriesManager transportationManager = new BicycleAccessoriesManager();

        BicycleAccessories bicycleComputer = new BicycleComputer("Sdv2000", 350, "Garmain");
        BicycleAccessories flashlight = new Flashlight("221", 12312, "12312");


        List<BicycleAccessories> mainBicycleAccessoriesList = new ArrayList<>();

        mainBicycleAccessoriesList.add(bicycleComputer);
        mainBicycleAccessoriesList.add(flashlight);

        System.out.println(transportationManager.findByTypesManufacturer(manufacturer));
        System.out.println(transportationManager.sortByTypesManufacters(mainBicycleAccessoriesList, true));
        System.out.println(transportationManager.sortByWeight(mainBicycleAccessoriesList, true));
    }
}