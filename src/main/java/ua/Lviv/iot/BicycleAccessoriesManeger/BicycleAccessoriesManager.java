package ua.Lviv.iot.BicycleAccessoriesManeger;

import ua.Lviv.iot.classes.BicycleAccessories;
import ua.Lviv.iot.Enumes.TypesManufacturer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class BicycleAccessoriesManager {
    private List<BicycleAccessories> bicycleAccessoriesList = new ArrayList<>();

    public void addBicycleAccessories(BicycleAccessories bicycleAccessories) {
        bicycleAccessoriesList.add(bicycleAccessories);
    }

    public List<BicycleAccessories> findByTypesManufacturer(String manufacturer) {
        return bicycleAccessoriesList.stream().filter(accessories -> accessories.getManufacturer() == manufacturer).collect(Collectors.toList());
    }

    public List<BicycleAccessories> sortByWeight(List<BicycleAccessories> bicycleAccessories, boolean ascendent) {
        return sortByComparator(bicycleAccessories, ascendent, Comparator.comparing(BicycleAccessories::getWeight));
    }

    public List<BicycleAccessories> sortByTypesManufacters(List<BicycleAccessories> bicycleAccessories, boolean ascendent) {

        return sortByComparator(bicycleAccessories, ascendent, Comparator.comparing(BicycleAccessories::getTypesManufacturer));
    }

    private List<BicycleAccessories> sortByComparator(List<BicycleAccessories> bicycleAccessories, boolean
            ascendent, Comparator<BicycleAccessories> comparator) {
        if (ascendent) {
            Collections.sort(bicycleAccessories, comparator.reversed());
        } else {
            Collections.sort(bicycleAccessories, comparator);
        }
        return bicycleAccessories;
    }
}
