package by.tc.task01.service.validation;

import by.tc.task01.entity.criteria.Criteria;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class SearchParametersCreator {
    public static <T> List<String> createSearchParameters(Criteria criteria){
        Map<T, Object> parametersMap = criteria.getCriteria();
        List<String> criteriaList = new ArrayList<>();
        criteriaList.add(criteria.getProductTypeSimpleName());
        for (Map.Entry<T, Object> parameters : parametersMap.entrySet()){
            String type = parameters.getKey().toString();
            String value = parameters.getValue().toString();
            StringBuilder regExpBuilder = new StringBuilder();
            regExpBuilder
                    .append(".*\\s")
                    .append(type)
                    .append("=")
                    .append(value.toUpperCase())
                    .append("\\s.*");
            String searchParameter = regExpBuilder.toString();
            criteriaList.add(searchParameter);
        }
        return criteriaList;
    }
}