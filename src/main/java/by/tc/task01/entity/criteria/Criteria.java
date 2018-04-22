package by.tc.task01.entity.criteria;


import java.util.HashMap;
import java.util.Map;

public class Criteria<E> {

	private Map<E, Object> criteria = new HashMap<>();

	private Class productType;

	public Criteria(Class productType) {
		this.productType = productType;
	}

	public void add(E searchCriteria, Object value) {

		if(value != null){
			criteria.put(searchCriteria, value.toString());
		}
	}

	public String getProductType() {
		return productType.getSimpleName();
	}

	public Map<E, Object> getCriteria() {
		return criteria;
	}
}