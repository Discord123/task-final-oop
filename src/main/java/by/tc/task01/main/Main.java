package by.tc.task01.main;

import static by.tc.task01.entity.criteria.SearchCriteria.*;

import by.tc.task01.entity.Product;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.service.ProductService;
import by.tc.task01.service.ServiceFactory;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Product> products;

		ServiceFactory factory = ServiceFactory.getInstance();
		ProductService service = factory.getProductService();

		//////////////////////////////////////////////////////////////////

		Criteria<Oven> criteriaOven = new Criteria<Oven>();
		criteriaOven.setProductType("Oven");
		criteriaOven.add(Oven.CAPACITY, 3);

		products = service.find(criteriaOven);

		PrintProductInfo.print(products);

		//////////////////////////////////////////////////////////////////

		criteriaOven = new Criteria<Oven>();
		criteriaOven.setProductType("Oven");
		criteriaOven.add(Oven.HEIGHT, 200);
		criteriaOven.add(Oven.DEPTH, 300);

		products = service.find(criteriaOven);

		PrintProductInfo.print(products);

		//////////////////////////////////////////////////////////////////

		Criteria<TabletPC> criteriaTabletPC = new Criteria<TabletPC>();
		criteriaTabletPC.setProductType("TabletPC");
		criteriaTabletPC.add(TabletPC.COLOR, "BLUE");
		criteriaTabletPC.add(TabletPC.DISPLAY_INCHES, 14);
		criteriaTabletPC.add(TabletPC.MEMORY_ROM, 4);

		products = service.find(criteriaOven);

		PrintProductInfo.print(products);

		//////////////////////////////////////////////////////////////////

		criteriaOven = new Criteria<Oven>();
		criteriaOven.setProductType("Oven");
		criteriaOven.add(Oven.HEIGHT, 45.5);
		criteriaOven.add(Oven.DEPTH, 60);
		criteriaOven.add(Oven.CAPACITY, 32);

		products = service.find(criteriaOven);

		PrintProductInfo.print(products);

		//////////////////////////////////////////////////////////////////

		Criteria<VacuumCleaner> criteriaVacuumCleaner = new Criteria<>();
		criteriaVacuumCleaner.setProductType("VacuumCleaner");
		criteriaVacuumCleaner.add(VacuumCleaner.BAG_TYPE, "aa-89");
		criteriaVacuumCleaner.add(VacuumCleaner.MOTOR_SPEED_REGULATION, 2900);
		criteriaVacuumCleaner.add(VacuumCleaner.FILTER_TYPE, "b");

		products = service.find(criteriaVacuumCleaner);

		PrintProductInfo.print(products);

		//////////////////////////////////////////////////////////////////

		criteriaVacuumCleaner = new Criteria<>();
		criteriaVacuumCleaner.setProductType("VacuumCleaner");
		criteriaVacuumCleaner.add(VacuumCleaner.BAG_TYPE, "XX00");
		criteriaVacuumCleaner.add(VacuumCleaner.MOTOR_SPEED_REGULATION, 2950);
		criteriaVacuumCleaner.add(VacuumCleaner.FILTER_TYPE, "C");
		criteriaVacuumCleaner.add(VacuumCleaner.POWER_CONSUMPTION, 90);
		criteriaVacuumCleaner.add(VacuumCleaner.WAND_TYPE, "all-in-one");
		criteriaVacuumCleaner.add(VacuumCleaner.CLEANING_WIDTH, "30");

		products = service.find(criteriaVacuumCleaner);

		PrintProductInfo.print(products);

		//////////////////////////////////////////////////////////////////

		criteriaTabletPC = new Criteria<>();
		criteriaTabletPC.setProductType("TabletPC");
		criteriaTabletPC.add(TabletPC.COLOR, "RED");
		criteriaTabletPC.add(TabletPC.DISPLAY_INCHES, 15);
		criteriaTabletPC.add(TabletPC.MEMORY_ROM, "8000");

		products = service.find(criteriaTabletPC);

		PrintProductInfo.print(products);

		//////////////////////////////////////////////////////////////////

		Criteria<Speakers> criteriaSpeakers = new Criteria<>();
		criteriaSpeakers.setProductType("Speakers");
		criteriaSpeakers.add(Speakers.POWER_CONSUMPTION, 17);
		criteriaSpeakers.add(Speakers.FREQUENCY_RANGE, "2-3.5");
		criteriaSpeakers.add(Speakers.NUMBER_OF_SPEAKERS, "4");

		products = service.find(criteriaSpeakers);

		PrintProductInfo.print(products);

		//////////////////////////////////////////////////////////////////

		Criteria<Refrigerator> criteriaRefrigerator = new Criteria<>();
		criteriaRefrigerator.setProductType("Refrigerator");
		criteriaRefrigerator.add(Refrigerator.POWER_CONSUMPTION, "200");
		criteriaRefrigerator.add(Refrigerator.WEIGHT, 30);
		criteriaRefrigerator.add(Refrigerator.HEIGHT, 180);

		products = service.find(criteriaRefrigerator);

		PrintProductInfo.print(products);

		//////////////////////////////////////////////////////////////////

		Criteria<Laptop> criteriaLaptop = new Criteria<>();
		criteriaLaptop.setProductType("Laptop");
		criteriaLaptop.add(null, null);
		criteriaLaptop.add(Laptop.CPU, 2.2);

		products = service.find(criteriaLaptop);

		PrintProductInfo.print(products);
		//////////////////////////////////////////////////////////////////

		criteriaLaptop = new Criteria<>();
		criteriaLaptop.setProductType("Laptop");
		criteriaLaptop.add(Laptop.OS,"Linux");
		criteriaLaptop.add(Laptop.CPU, 2.2);

		products = service.find(criteriaLaptop);

		PrintProductInfo.print(products);

		//////////////////////////////////////////////////////////////////

		Criteria<Newspaper> newspaperCriteriaLaptop = new Criteria<>();
		newspaperCriteriaLaptop.setProductType("Newspaper");
		newspaperCriteriaLaptop.add(Newspaper.PERIODICITY,"1x1");
		newspaperCriteriaLaptop.add(Newspaper.PAID_OR_FREE, "paid");

		products = service.find(newspaperCriteriaLaptop);

		PrintProductInfo.print(products);

		//////////////////////////////////////////////////////////////////

		newspaperCriteriaLaptop = new Criteria<>();
		newspaperCriteriaLaptop.setProductType("Newspaper");
		newspaperCriteriaLaptop.add(Newspaper.PERIODICITY,"1x1");
		newspaperCriteriaLaptop.add(Newspaper.PAID_OR_FREE, "paid");
		newspaperCriteriaLaptop.add(Newspaper.TITLE,"News");

		products = service.find(newspaperCriteriaLaptop);

		PrintProductInfo.print(products);

		//////////////////////////////////////////////////////////////////

		Criteria<TextBook> textBookCriteria = new Criteria<>();
		textBookCriteria.setProductType("TextBook");
		textBookCriteria.add(TextBook.AUTHOR,"Блинов");
		textBookCriteria.add(TextBook.NUMBER_OF_PAGES, 669);

		products = service.find(textBookCriteria);

		PrintProductInfo.print(products);

		//////////////////////////////////////////////////////////////////

		textBookCriteria = new Criteria<>();
		textBookCriteria.setProductType("TextBook");
		textBookCriteria.add(TextBook.AUTHOR,"Блинов");
		textBookCriteria.add(TextBook.NUMBER_OF_PAGES, 30);

		products = service.find(textBookCriteria);

		PrintProductInfo.print(products);

		//////////////////////////////////////////////////////////////////

		textBookCriteria = new Criteria<>();
		textBookCriteria.setProductType("TextBook");
		textBookCriteria.add(TextBook.TITLE,"Почему это шедевр");
		textBookCriteria.add(TextBook.SUBJECT, "познавательное");

		products = service.find(textBookCriteria);

		PrintProductInfo.print(products);
	}

}