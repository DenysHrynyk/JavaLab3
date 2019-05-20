package ua.lviv.iot;
import ua.lviv.iot.Enumes.TypesManufacturer;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ua.lviv.iot.BicycleAccessoriesManeger.BicycleAccessoriesManager;
import ua.lviv.iot.Enumes.DistanceOfLighting;
import ua.lviv.iot.Enumes.Navigator;
import ua.lviv.iot.classes.BicycleAccessories;
import ua.lviv.iot.classes.BicycleComputer;
import ua.lviv.iot.classes.Flashlight;



public class BicycleAccessoriesTest {
    private List<BicycleAccessories> listTest;
    private List<BicycleAccessories> expected;
    private List<BicycleAccessories> actual;
    private BicycleAccessoriesManager bicycleAccessoriesManager;
    private BicycleComputer bicycleComputer1;
    private BicycleComputer bicycleComputer2;
    private Flashlight flashlight1;
    private Flashlight flashlight2;
    private Flashlight flashlight3;

    @BeforeEach
    public void setUp() {
        bicycleAccessoriesManager = new BicycleAccessoriesManager();
        bicycleComputer1 = new BicycleComputer();
        bicycleComputer1.setBattery(7000);
        bicycleComputer1.setMountingMethod("abc");
        bicycleComputer1.setDispayWidening(3000);
        bicycleComputer1.setNavigator(Navigator.OFFLINE);
        bicycleComputer1.setManufacturer("abc");
        bicycleComputer1.setName("abc");
        bicycleComputer1.setTypesManufacturer(TypesManufacturer.INFINI);


        bicycleComputer2 = new BicycleComputer();
        bicycleComputer2.setNavigator(Navigator.ONLINE);
        bicycleComputer2.setDispayWidening(3000);
        bicycleComputer2.setMountingMethod("bca");
        bicycleComputer2.setBattery(8000);
        bicycleComputer2.setName("bca");
        bicycleComputer2.setManufacturer("bca");
        bicycleComputer2.setTypesManufacturer(TypesManufacturer.INFINI);


        flashlight1 = new Flashlight();
        flashlight1.setManufacturer("cba");
        flashlight1.setPrice(9000);
        flashlight1.setDistanceOfLighting(DistanceOfLighting.LONG);
        flashlight1.setName("cba");
        flashlight1.setWeight(1000);
        flashlight1.setTypesManufacturer(TypesManufacturer.SHIMANO);

        flashlight2 = new Flashlight();
        flashlight2.setWeight(5000);
        flashlight2.setName("def");
        flashlight2.setDistanceOfLighting(DistanceOfLighting.MIDDLE);
        flashlight2.setPrice(3000);
        flashlight2.setManufacturer("def");
        flashlight2.setTypesManufacturer(TypesManufacturer.GARMIN);


        listTest = Arrays.asList(bicycleComputer1, bicycleComputer2, flashlight1, flashlight2);

    }

    @Test
    void testFindByTypesManufacturer() {
        Assertions.assertNotEquals(3, bicycleAccessoriesManager.findByTypesManufacturer(TypesManufacturer.GARMIN).size());
        Assertions.assertNotEquals(3, bicycleAccessoriesManager.findByTypesManufacturer(TypesManufacturer.INFINI).size());
        Assertions.assertNotEquals(3, bicycleAccessoriesManager.findByTypesManufacturer(TypesManufacturer.SHIMANO).size());

    }


    @Test
    void testSortByWeightIncreasing() {
        expected = Arrays.asList(bicycleComputer1, bicycleComputer2, flashlight1, flashlight2);
        actual = bicycleAccessoriesManager.sortByWeight(listTest, false);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testSortByWeightDecreasing() {
        expected = Arrays.asList(flashlight2, flashlight1, bicycleComputer1, bicycleComputer2);
        actual = bicycleAccessoriesManager.sortByWeight(listTest, true);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testSortByTypesManufactersIncreasing() {
        expected = Arrays.asList(bicycleComputer1, bicycleComputer2, flashlight2, flashlight1);
        actual = bicycleAccessoriesManager.sortByTypesManufacters(listTest, false);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testSortByTypesManufactersDecreasing() {
        expected = Arrays.asList(flashlight1, flashlight2, bicycleComputer1, bicycleComputer2);
        actual = bicycleAccessoriesManager.sortByTypesManufacters(listTest, true);
        Assertions.assertEquals(expected, actual);
    }
}