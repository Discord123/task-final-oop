package by.tc.task01.DAOTest;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import by.tc.task01.entity.Product;
import by.tc.task01.entity.applianceProduct.*;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.entity.criteria.SearchCriteria;
import by.tc.task01.entity.paperProduct.TextBook;
import by.tc.task01.service.ProductService;
import by.tc.task01.service.ServiceFactory;
import org.junit.Test;

import java.util.List;

public class SearchTest {
    @Test
    public void testOne() {
        List<Product> products;

        ServiceFactory factory = ServiceFactory.getInstance();
        ProductService service = factory.getProductService();
        Criteria<SearchCriteria.Speakers> criteriaSpeakers = new Criteria<>(SearchCriteria.Speakers.class);
        criteriaSpeakers.add(SearchCriteria.Speakers.NUMBER_OF_SPEAKERS, 2);
        criteriaSpeakers.add(SearchCriteria.Speakers.POWER_CONSUMPTION, 15);

        products = service.find(criteriaSpeakers);

        assertTrue(products.size() == 1);
    }

    @Test
    public void testTwo() {
        List <Product> products;

        ServiceFactory factory = ServiceFactory.getInstance();
        ProductService service = factory.getProductService();
        Criteria<SearchCriteria.VacuumCleaner> criteriaVacuumCleaner = new Criteria<>(VacuumCleaner.class);
        criteriaVacuumCleaner.add(SearchCriteria.VacuumCleaner.WAND_TYPE,"all-in-one");

        products = service.find(criteriaVacuumCleaner);

        assertTrue(products.size() == 3);
    }

    @Test
    public void testThree() {
        List <Product> products;

        ServiceFactory factory = ServiceFactory.getInstance();
        ProductService service = factory.getProductService();
        Criteria<SearchCriteria.Speakers> criteriaSpeakers = new Criteria<>(Speakers.class);
        criteriaSpeakers.add(SearchCriteria.Speakers.FREQUENCY_RANGE,"2-4");

        products = service.find(criteriaSpeakers);

        assertTrue(products.size() == 1);
    }

    @Test
    public void testFour() {
        List <Product> products;

        ServiceFactory factory = ServiceFactory.getInstance();
        ProductService service = factory.getProductService();
        Criteria<SearchCriteria.Laptop> criteriaLaptop = new Criteria<>(Laptop.class);
        criteriaLaptop.add(SearchCriteria.Laptop.SYSTEM_MEMORY,1000);

        products = service.find(criteriaLaptop);

        assertTrue(products.size() == 2);
    }

    @Test
    public void testFive() {
        Oven oven = new Oven();
        oven.setPowerConsumption(1000);
        oven.setWeight(10);
        oven.setCapacity(32);
        oven.setDepth(60);
        oven.setHeight(45.5);
        oven.setWidth(59.5);

        List<Product> products;

        ServiceFactory factory = ServiceFactory.getInstance();
        ProductService service = factory.getProductService();
        Criteria<SearchCriteria.Oven> criteriaOven = new Criteria<>(Oven.class);
        criteriaOven.add(SearchCriteria.Oven.WIDTH,59.5);

        products = service.find(criteriaOven);

        assertTrue(oven.equals(products.get(0)));
    }

    @Test
    public void testSix() {
        Refrigerator refrigerator = new Refrigerator();
        refrigerator.setPowerConsumption(100);
        refrigerator.setWeight(20);
        refrigerator.setFreezerCapacity(10);
        refrigerator.setOverallCapacity(300);
        refrigerator.setHeight(200);
        refrigerator.setWidth(70);

        List<Product> products;

        ServiceFactory factory = ServiceFactory.getInstance();
        ProductService service = factory.getProductService();
        Criteria<SearchCriteria.Refrigerator> criteriaRefrigerator = new Criteria<>(Refrigerator.class);
        criteriaRefrigerator.add(SearchCriteria.Refrigerator.POWER_CONSUMPTION,100);
        criteriaRefrigerator.add(SearchCriteria.Refrigerator.HEIGHT,200);

        products = service.find(criteriaRefrigerator);

        assertTrue(refrigerator.equals(products.get(0)));
    }

    @Test
    public void testSeven() {
        Refrigerator refrigerator = new Refrigerator();
        refrigerator.setPowerConsumption(100);
        refrigerator.setWeight(20);
        refrigerator.setFreezerCapacity(10);
        refrigerator.setOverallCapacity(300);
        refrigerator.setHeight(200);
        refrigerator.setWidth(70);

        List<Product> products1;
        List<Product> products2;

        ServiceFactory factory1 = ServiceFactory.getInstance();
        ProductService service1 = factory1.getProductService();
        Criteria<SearchCriteria.Refrigerator> criteriaRefrigerator1 = new Criteria<>(Refrigerator.class);
        criteriaRefrigerator1.add(SearchCriteria.Refrigerator.POWER_CONSUMPTION,100);
        criteriaRefrigerator1.add(SearchCriteria.Refrigerator.HEIGHT,200);

        ServiceFactory factory2 = ServiceFactory.getInstance();
        ProductService service2 = factory2.getProductService();
        Criteria<SearchCriteria.Refrigerator> criteriaRefrigerator2 = new Criteria<>(Refrigerator.class);
        criteriaRefrigerator2.add(SearchCriteria.Refrigerator.POWER_CONSUMPTION,100);
        criteriaRefrigerator2.add(SearchCriteria.Refrigerator.HEIGHT,200);

        products1 = service1.find(criteriaRefrigerator1);
        products2 = service2.find(criteriaRefrigerator2);

        assertTrue((refrigerator.equals(products1.get(0)))&&(refrigerator.equals(products2.get(0))));
    }

    @Test
    public void testEight() {
        List<Product> products;

        ServiceFactory factory = ServiceFactory.getInstance();
        ProductService service = factory.getProductService();
        Criteria<SearchCriteria.TextBook> criteriaTextBook = new Criteria<>(TextBook.class);
        criteriaTextBook.add(SearchCriteria.TextBook.AUTHOR, "Блинов");
        criteriaTextBook.add(SearchCriteria.TextBook.TITLE, "Java");

        products = service.find(criteriaTextBook);

        assertNotNull(products);
    }

    @Test
    public void testNine() {
        List<Product> products;

        ServiceFactory factory = ServiceFactory.getInstance();
        ProductService service = factory.getProductService();
        Criteria<SearchCriteria.Oven> criteriaOven = new Criteria<>(Oven.class);
        criteriaOven.add(SearchCriteria.Oven.WEIGHT, 10);

        products = service.find(criteriaOven);

        assertNotNull(products);
    }

    @Test
    public void testTen() {
        List<Product> products;

        ServiceFactory factory = ServiceFactory.getInstance();
        ProductService service = factory.getProductService();
        Criteria<SearchCriteria.Oven> criteriaOven = new Criteria<>(Oven.class);
        criteriaOven.add(SearchCriteria.Oven.WEIGHT, 5);

        products = service.find(criteriaOven);

        assertNotNull(products);
    }

    @Test
    public void testEleven() {
        List<Product> products;

        ServiceFactory factory = ServiceFactory.getInstance();
        ProductService service = factory.getProductService();
        Criteria<SearchCriteria.Speakers> criteriaSpeackers = new Criteria<>(Speakers.class);
        criteriaSpeackers.add(SearchCriteria.Speakers.NUMBER_OF_SPEAKERS, 2);
        criteriaSpeackers.add(SearchCriteria.Speakers.POWER_CONSUMPTION, 15);

        products = service.find(criteriaSpeackers);

        assertNotNull(products);
    }
}
