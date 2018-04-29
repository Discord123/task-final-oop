package by.tc.task01.dao.util;

import by.tc.task01.entity.Product;
import by.tc.task01.entity.appliance_product.*;
import by.tc.task01.entity.paper_product.Newspaper;
import by.tc.task01.entity.paper_product.TextBook;

import java.util.ArrayList;
import java.util.List;

public final class ProductCreator {

    public static Product create(String productType, String parameters){
        List<String> parametersList = getParametersArrayForFoundedProduct(parameters);

        if (productType.equalsIgnoreCase("Oven")) {
            Oven oven = createOven(parametersList);
            return oven;
        }
        if (productType.equalsIgnoreCase("Laptop")) {
            Laptop laptop = createLaptop(parametersList);
            return laptop;
        }
        if (productType.equalsIgnoreCase("Refrigerator")) {
            Refrigerator refrigerator = createRefrigerator(parametersList);
            return refrigerator;
        }
        if (productType.equalsIgnoreCase("Speakers")) {
            Speakers speakers = createSpeakers(parametersList);
            return speakers;
        }
        if (productType.equalsIgnoreCase("TabletPC")) {
            TabletPC tabletPC = createTabletPC(parametersList);
            return tabletPC;
        }
        if (productType.equalsIgnoreCase("VacuumCleaner")) {
            VacuumCleaner vacuumCleaner = createVacuumCleaner(parametersList);
            return vacuumCleaner;
        }
        if (productType.equalsIgnoreCase("Newspaper")) {
            Newspaper newspaper = createNewspaper(parametersList);
            return newspaper;
        }
        if (productType.equalsIgnoreCase("TextBook")) {
            TextBook textBook = createTextBook(parametersList);
            return textBook;
        }
        return null;
    }

    private static List<String> getParametersArrayForFoundedProduct(String parameters) {
        List<String> paramsList = new ArrayList<>();
        int currentPosition = 0;
        int currentStartIndex;
        while ((currentStartIndex = parameters.indexOf("=", currentPosition)) != -1) {
            int indexOfEndMark = parameters.indexOf(",", currentStartIndex);
            if (indexOfEndMark == -1) {
                indexOfEndMark = parameters.indexOf(";");
            }
            paramsList.add(parameters.substring(currentStartIndex + 1, indexOfEndMark));
            currentPosition = currentStartIndex + 1;
        }
        return paramsList;
    }

    private static Oven createOven(List<String> parametersList) {
        Oven oven = new Oven();
        oven.setPowerConsumption(Double.parseDouble(parametersList.get(0)));
        oven.setWeight(Double.parseDouble(parametersList.get(1)));
        oven.setCapacity(Double.parseDouble(parametersList.get(2)));
        oven.setDepth(Double.parseDouble(parametersList.get(3)));
        oven.setHeight(Double.parseDouble(parametersList.get(4)));
        oven.setWidth(Double.parseDouble(parametersList.get(5)));
        return oven;
    }

    private static Laptop createLaptop(List<String> parametersList) {
        Laptop laptop = new Laptop();
        laptop.setBatteryCapacity(Double.parseDouble(parametersList.get(0)));
        laptop.setOs(parametersList.get(1));
        laptop.setMemoryROM(Double.parseDouble(parametersList.get(2)));
        laptop.setSystemMemory(Double.parseDouble(parametersList.get(3)));
        laptop.setCpu(Double.parseDouble(parametersList.get(4)));
        laptop.setDisplayInchs(Double.parseDouble(parametersList.get(5)));
        return laptop;
    }

    private static Refrigerator createRefrigerator(List<String> parametersList) {
        Refrigerator refrigerator = new Refrigerator();
        refrigerator.setPowerConsumption(Double.parseDouble(parametersList.get(0)));
        refrigerator.setWeight(Double.parseDouble(parametersList.get(1)));
        refrigerator.setFreezerCapacity(Double.parseDouble(parametersList.get(2)));
        refrigerator.setOverallCapacity(Double.parseDouble(parametersList.get(3)));
        refrigerator.setHeight(Double.parseDouble(parametersList.get(4)));
        refrigerator.setWidth(Double.parseDouble(parametersList.get(5)));
        return refrigerator;
    }

    private static Speakers createSpeakers(List<String> parametersList) {
        Speakers speakers = new Speakers();
        speakers.setPowerConsumption(Double.parseDouble(parametersList.get(0)));
        speakers.setNumberOfSpeakers(Double.parseDouble(parametersList.get(1)));
        speakers.setFrequencyRange(parametersList.get(2));
        speakers.setCordLength(Double.parseDouble(parametersList.get(3)));
        return speakers;
    }

    private static TabletPC createTabletPC(List<String> parametersList) {
        TabletPC tabletPC = new TabletPC();
        tabletPC.setBatteryCapacity(Double.parseDouble(parametersList.get(0)));
        tabletPC.setDisplayInches(Double.parseDouble(parametersList.get(1)));
        tabletPC.setMemoryROM(Double.parseDouble(parametersList.get(2)));
        tabletPC.setFlashMemoryCapacity(Double.parseDouble(parametersList.get(3)));
        tabletPC.setColor(parametersList.get(4));
        return tabletPC;
    }

    private static VacuumCleaner createVacuumCleaner(List<String> parametersList) {
        VacuumCleaner vacuumCleaner = new VacuumCleaner();
        vacuumCleaner.setPowerConsumption(Double.parseDouble(parametersList.get(0)));
        vacuumCleaner.setFilterType(parametersList.get(1));
        vacuumCleaner.setBagType(parametersList.get(2));
        vacuumCleaner.setWandType(parametersList.get(3));
        vacuumCleaner.setMotorSpeedRegulation(Double.parseDouble(parametersList.get(4)));
        vacuumCleaner.setCleaningWidth(Double.parseDouble(parametersList.get(5)));
        return vacuumCleaner;
    }

    private static Newspaper createNewspaper(List<String> parametersList) {
        Newspaper newspaper = new Newspaper();
        newspaper.setTitle(parametersList.get(0));
        newspaper.setPeriodicity(parametersList.get(1));
        newspaper.setPaidOrFree(parametersList.get(2));
        return newspaper;
    }

    private static TextBook createTextBook(List<String> parametersList) {
        TextBook textBook = new TextBook();
        textBook.setTitle(parametersList.get(0));
        textBook.setSubject(parametersList.get(1));
        textBook.setAuthor(parametersList.get(2));
        textBook.setNumberOfPages(Double.parseDouble(parametersList.get(3)));
        return textBook;
    }
}
