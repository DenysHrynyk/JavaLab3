package ua.lviv.iot.BicycleAccessoriesManeger;

import ua.lviv.iot.Enumes.TypesManufacturer;
import ua.lviv.iot.classes.BicycleAccessories;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class BicycleAccessoriesManager {
 private List<BicycleAccessories> bicycleAccessoriesList = new ArrayList<BicycleAccessories>();

    public final void setBicycleList(List<BicycleAccessories> listTest) {

    }

    public final void addBicycleAccessories(
            final BicycleAccessories bicycleAccessories) {
        bicycleAccessoriesList.add(bicycleAccessories);
    }


    public final List<BicycleAccessories> findByTypesManufacturer(
            final TypesManufacturer typesManufacturer) {
        return bicycleAccessoriesList.stream().filter(
                accessories -> accessories.getTypesManufacturer() == typesManufacturer)
                .collect(Collectors.toList());
    }


    public final List<BicycleAccessories> sortByWeight(
            final List<BicycleAccessories> bicycleAccessories,
            final boolean ascendent) {
        return sortByComparator(bicycleAccessories, ascendent,
                Comparator.comparing(BicycleAccessories::getWeight));
    }


    public final List<BicycleAccessories> sortByTypesManufacters(final List<BicycleAccessories> bicycleAccessories, final boolean ascendent) {
        if (ascendent){
            bicycleAccessories.sort(Comparator.comparing(BicycleAccessories::getTypesManufacturer));
        }else {
            bicycleAccessories.sort(Comparator.comparing(BicycleAccessories::getTypesManufacturer).reversed());

        }
        return bicycleAccessories;
    }

    public final List<BicycleAccessories> sortByComparator(
            final List<BicycleAccessories> bicycleAccessories,
            final boolean ascendent,
            final Comparator<BicycleAccessories> comparator) {
        if (ascendent) {
            Collections.sort(bicycleAccessories, comparator.reversed());
        } else {
            Collections.sort(bicycleAccessories, comparator);
        }
        return bicycleAccessories;
    }
}
