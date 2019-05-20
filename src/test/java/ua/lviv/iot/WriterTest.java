package ua.lviv.iot;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ua.lviv.iot.BicycleAccessoriesManeger.BicycleAccessoriesManager;
import ua.lviv.iot.BicycleAccessoriesManeger.BicycleAccessoriesWriter;
import ua.lviv.iot.Enumes.TypesManufacturer;
import ua.lviv.iot.classes.BicycleAccessories;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class WriterTest {
    private File file = new File("output.csv");
    private BicycleAccessoriesWriter writer = new BicycleAccessoriesWriter();
    private List<BicycleAccessories> list = new ArrayList<>();
    private BicycleAccessoriesManager manager = new BicycleAccessoriesManager();

    @BeforeEach
    final void setUp() {
        list = new ArrayList<>();
        BicycleAccessories bicycleComputer = new BicycleAccessories("Sdv2000", 350, "Garmain", TypesManufacturer.GARMIN);
        BicycleAccessories flashlight = new BicycleAccessories("221", 12312, "12312", TypesManufacturer.SHIMANO);

        list.add(bicycleComputer);
        list.add(flashlight);

    }
        @Test
        final void testWriteToFile() throws IOException {
            writer.writeToFile(list, file);
            Assertions.assertNotEquals(file.length(), 0);

    }
}