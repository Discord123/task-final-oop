package by.tc.task01.entity.criteria;


import java.util.HashMap;
import java.util.Map;

public class Criteria<E> {

	private String productType;

	private Map<E, Object> criteria = new HashMap<E, Object>();

	public void add(E searchCriteria, Object value) {

		if(value != null){
			criteria.put(searchCriteria, value.toString());
		}
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String applianceType) {
		this.productType = applianceType;
	}

	public Map<E, Object> getCriteria() {
		return criteria;
	}
}