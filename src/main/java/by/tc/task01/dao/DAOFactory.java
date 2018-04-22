package by.tc.task01.dao;

import by.tc.task01.dao.impl.ProductDAOImpl;

public final class DAOFactory {
	private static final DAOFactory instance = new DAOFactory();

	private final ProductDAO productDAO = new ProductDAOImpl();
	
	private DAOFactory() {}

	public ProductDAO getProductDAO() {
		return productDAO;
	}

	public static DAOFactory getInstance() {
		return instance;
	}
}
