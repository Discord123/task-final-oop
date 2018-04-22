package by.tc.task01.DAOTest;

import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.assertTrue;

import by.tc.task01.entity.Product;
import by.tc.task01.entity.applianceProduct.Oven;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.entity.criteria.SearchCriteria;
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
        Criteria<SearchCriteria.Oven> criteriaOven = new Criteria<>(Oven.class);
        criteriaOven.add(SearchCriteria.Oven.WEIGHT, 10);

        products = service.find(criteriaOven);
        assertTrue(products != null);
    }

    @Test
    public void testTwo() {
        List<Product> products;

        ServiceFactory factory = ServiceFactory.getInstance();
        ProductService service = factory.getProductService();
        Criteria<SearchCriteria.Oven> criteriaOven = new Criteria<>(Oven.class);
        criteriaOven.add(SearchCriteria.Oven.WEIGHT, 5);

        products = service.find(criteriaOven);
        assertFalse(products == null);
    }

    @Test
    public void testThree() {

        List<Product> products;

        ServiceFactory factory = ServiceFactory.getInstance();
        ProductService service = factory.getProductService();
        Criteria<SearchCriteria.Speakers> criteriaSpeackers = new Criteria<>(SearchCriteria.Speakers.class);
        criteriaSpeackers.add(SearchCriteria.Speakers.NUMBER_OF_SPEAKERS, 2);
        criteriaSpeackers.add(SearchCriteria.Speakers.POWER_CONSUMPTION, 15);

        products = service.find(criteriaSpeackers);
        assertTrue(products != null);
    }

    @Test
    public void testFour() {
        List<Product> products;

        ServiceFactory factory = ServiceFactory.getInstance();
        ProductService service = factory.getProductService();
        Criteria<SearchCriteria.TextBook> criteriaTextBook = new Criteria<>(SearchCriteria.TextBook.class);
        criteriaTextBook.add(SearchCriteria.TextBook.AUTHOR, "Блинов");
        criteriaTextBook.add(SearchCriteria.TextBook.TITLE, "Java");

        products = service.find(criteriaTextBook);
        assertTrue(products != null);
    }
}
