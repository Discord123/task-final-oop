package by.tc.task01.main;

import by.tc.task01.entity.Product;

import java.util.List;

public class PrintProductInfo {

	public static void print(List<Product> appliances) {
		if (appliances != null && appliances.size() > 0) {
			for (Product product : appliances) {
				System.out.println(product);
			}
		} else {
			System.out.println("Product not found");
		}
	}
}
