package by.tc.task01.entity.criteria;


import java.util.HashMap;
import java.util.Map;

public class Criteria<E> {

	private String productType;

	private Map<E, Object> criteria = new HashMap<>();

	private Class clazz;

	public Criteria(Class clazz) {
		this.clazz = clazz;
		productType = clazz.getSimpleName();
	}

	public void add(E searchCriteria, Object value) {

		if(value != null){
			criteria.put(searchCriteria, value.toString());
		}
	}

	public String getProductType() {
		return productType;
	}

	public Map<E, Object> getCriteria() {
		return criteria;
	}
}