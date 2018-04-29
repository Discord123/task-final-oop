package by.tc.task01.dao.impl;

import by.tc.task01.dao.ProductDAO;
import by.tc.task01.dao.util.ProductCreator;
import by.tc.task01.entity.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;


public class ProductDAOImpl implements ProductDAO {

    private static final String DATABASE_FILE_NAME = "product_db.txt";
    private String productTypeName;

    @Override
    public List<Product> find(List<String> criteria) {
        productTypeName = criteria.get(0);
        List<Product> relevantProducts = searchInDatabase(productTypeName, criteria);
        return relevantProducts;
    }

    private List<Product> searchInDatabase(String productType, List<String> criteriaList) {
        List<Product> relevantProducts = new ArrayList<>();
        ClassLoader classLoader = ProductDAO.class.getClassLoader();
        try (InputStream is = classLoader.getResourceAsStream(DATABASE_FILE_NAME);
             BufferedReader br = new BufferedReader(new InputStreamReader(is))) {

            String readLine;
            while ((readLine = br.readLine()) != null)
                if (getMatch(readLine, criteriaList)) {
                    Product product = ProductCreator.create(productType, readLine);
                    relevantProducts.add(product);
                }
        } catch (IOException e) {
            System.out.println("IOException in searchInDatabase method");
            e.printStackTrace();
        }
        return relevantProducts;
    }

    private static boolean getMatch(String readData, List<String> criteriaList) {
        boolean isMatch = true;
        int size = criteriaList.size();
        for (int i = 1; i < size; i++) {
            if (!Pattern.matches(criteriaList.get(i), readData.toUpperCase())) {
                isMatch = false;
                break;
            }
        }
        return isMatch;
    }
}