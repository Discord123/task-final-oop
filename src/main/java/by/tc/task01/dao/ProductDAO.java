package by.tc.task01.dao;

import by.tc.task01.entity.Product;

import java.util.List;

public interface ProductDAO {

	List<Product> find(List<String> criteria);
}
