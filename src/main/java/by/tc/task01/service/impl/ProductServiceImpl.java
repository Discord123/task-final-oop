package by.tc.task01.service.impl;

import by.tc.task01.dao.ProductDAO;
import by.tc.task01.dao.DAOFactory;
import by.tc.task01.entity.Product;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.service.ProductService;
import by.tc.task01.service.util.SearchParametersCreator;
import by.tc.task01.service.validation.Validator;

import java.util.List;

public class ProductServiceImpl implements ProductService {

    @Override
    public List<Product> find(Criteria criteria) {
        if (!Validator.criteriaValidator(criteria)) {
            return null;
        }

        List<Product> devices;

        List<String> searchParameters = SearchParametersCreator.createSearchParameters(criteria);
        ProductDAO deviceDAO = DAOFactory.getInstance().getProductDAO();
        devices = deviceDAO.find(searchParameters);

        return devices;
    }
}

