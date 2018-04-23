package by.tc.task01.service.validation;

import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.entity.criteria.SearchCriteria;

import java.util.Map;

public class Validator {

	public static <E> boolean criteriaValidator(Criteria<E> criteria) {

		if (criteria == null){
			return false;
		}
		Map<E, Object> criteriaMap = criteria.getCriteria();
		for(Map.Entry<E, Object> pair : criteriaMap.entrySet()){
			if(pair.getKey() == null || pair.getValue() == null){
				return false;
			}
		}
		String productType = criteria.getProductTypeSimpleName();

		Boolean validCriteria = checkExistingProductType(criteriaMap,productType);

		return validCriteria;
	}

	private static <E> boolean checkExistingProductType (Map<E, Object> criteriaMap, String productType) {

		if (productType.equals("Oven")) {
			return checkOven(criteriaMap);
		}
		if (productType.equals("Laptop")) {
			return checkLaptop(criteriaMap);
		}
		if (productType.equals("Refrigerator")) {
			return checkRefrigerator(criteriaMap);
		}
		if (productType.equals("VacuumCleaner")) {
			return checkVacuumCleaner(criteriaMap);
		}
		if (productType.equals("TabletPC")) {
			return checkTabletPC(criteriaMap);
		}
		if (productType.equals("Speakers")) {
			return checkSpeakers(criteriaMap);
		}
		if (productType.equals("TextBook")) {
			return checkTextBook(criteriaMap);
		}
		if (productType.equals("Newspaper")) {
			return checkNewspaper(criteriaMap);
		}
		return false;
	}

	private static <E> boolean checkOven(Map<E, Object> criteriaMap){
		if (criteriaMap.containsKey(SearchCriteria.Oven.POWER_CONSUMPTION)){
			try{
				Double.parseDouble(criteriaMap.get(SearchCriteria.Oven.POWER_CONSUMPTION).toString());
			} catch (NumberFormatException e){
				return false;
			}
		}
		if (criteriaMap.containsKey(SearchCriteria.Oven.WEIGHT)){
			try{
				Double.parseDouble(criteriaMap.get(SearchCriteria.Oven.WEIGHT).toString());
			} catch (NumberFormatException e){
				return false;
			}
		}
		if (criteriaMap.containsKey(SearchCriteria.Oven.CAPACITY)){
			try{
				Double.parseDouble(criteriaMap.get(SearchCriteria.Oven.CAPACITY).toString());
			} catch (NumberFormatException e){
				return false;
			}
		}
		if (criteriaMap.containsKey(SearchCriteria.Oven.DEPTH)){
			try{
				Double.parseDouble(criteriaMap.get(SearchCriteria.Oven.DEPTH).toString());
			} catch (NumberFormatException e){
				return false;
			}
		}
		if (criteriaMap.containsKey(SearchCriteria.Oven.HEIGHT)){
			try{
				Double.parseDouble(criteriaMap.get(SearchCriteria.Oven.HEIGHT).toString());
			} catch (NumberFormatException e){
				return false;
			}
		}
		if (criteriaMap.containsKey(SearchCriteria.Oven.WIDTH)){
			try{
				Double.parseDouble(criteriaMap.get(SearchCriteria.Oven.WIDTH).toString());
			} catch (NumberFormatException e){
				return false;
			}
		}
		return true;
	}

	private static <E> boolean checkLaptop(Map<E, Object> criteriaMap){
		if (criteriaMap.containsKey(SearchCriteria.Laptop.BATTERY_CAPACITY)){
			try{
				Double.parseDouble(criteriaMap.get(SearchCriteria.Laptop.BATTERY_CAPACITY).toString());
			} catch (NumberFormatException e){
				return false;
			}
		}
		if (criteriaMap.containsKey(SearchCriteria.Laptop.OS)){
			if (!(criteriaMap.get(SearchCriteria.Laptop.OS) instanceof String)){
				return false;
			}
		}
		if (criteriaMap.containsKey(SearchCriteria.Laptop.MEMORY_ROM)){
			try{
				Double.parseDouble(criteriaMap.get(SearchCriteria.Laptop.MEMORY_ROM).toString());
			} catch (NumberFormatException e){
				return false;
			}
		}
		if (criteriaMap.containsKey(SearchCriteria.Laptop.SYSTEM_MEMORY)){
			try{
				Double.parseDouble(criteriaMap.get(SearchCriteria.Laptop.SYSTEM_MEMORY).toString());
			} catch (NumberFormatException e){
				return false;
			}
		}
		if (criteriaMap.containsKey(SearchCriteria.Laptop.CPU)){
			try{
				Double.parseDouble(criteriaMap.get(SearchCriteria.Laptop.CPU).toString());
			} catch (NumberFormatException e){
				return false;
			}
		}
		if (criteriaMap.containsKey(SearchCriteria.Laptop.DISPLAY_INCHS)){
			try{
				Double.parseDouble(criteriaMap.get(SearchCriteria.Laptop.DISPLAY_INCHS).toString());
			} catch (NumberFormatException e){
				return false;
			}
		}
		return true;
	}

	private static <E> boolean checkRefrigerator(Map<E, Object> criteriaMap){
		if (criteriaMap.containsKey(SearchCriteria.Refrigerator.POWER_CONSUMPTION)){
			try{
				Double.parseDouble(criteriaMap.get(SearchCriteria.Refrigerator.POWER_CONSUMPTION).toString());
			} catch (NumberFormatException e){
				return false;
			}
		}
		if (criteriaMap.containsKey(SearchCriteria.Refrigerator.WEIGHT)){
			try{
				Double.parseDouble(criteriaMap.get(SearchCriteria.Refrigerator.WEIGHT).toString());
			} catch (NumberFormatException e){
				return false;
			}
		}
		if (criteriaMap.containsKey(SearchCriteria.Refrigerator.FREEZER_CAPACITY)){
			try{
				Double.parseDouble(criteriaMap.get(SearchCriteria.Refrigerator.FREEZER_CAPACITY).toString());
			} catch (NumberFormatException e){
				return false;
			}
		}
		if (criteriaMap.containsKey(SearchCriteria.Refrigerator.OVERALL_CAPACITY)){
			try{
				Double.parseDouble(criteriaMap.get(SearchCriteria.Refrigerator.OVERALL_CAPACITY).toString());
			} catch (NumberFormatException e){
				return false;
			}
		}
		if (criteriaMap.containsKey(SearchCriteria.Refrigerator.HEIGHT)){
			try{
				Double.parseDouble(criteriaMap.get(SearchCriteria.Refrigerator.HEIGHT).toString());
			} catch (NumberFormatException e){
				return false;
			}
		}
		if (criteriaMap.containsKey(SearchCriteria.Refrigerator.WIDTH)){
			try{
				Double.parseDouble(criteriaMap.get(SearchCriteria.Refrigerator.WIDTH).toString());
			} catch (NumberFormatException e){
				return false;
			}
		}
		return true;
	}

	private static <E> boolean checkVacuumCleaner(Map<E, Object> criteriaMap){
		if (criteriaMap.containsKey(SearchCriteria.VacuumCleaner.POWER_CONSUMPTION)){
			try{
				Double.parseDouble(criteriaMap.get(SearchCriteria.VacuumCleaner.POWER_CONSUMPTION).toString());
			} catch (NumberFormatException e){
				return false;
			}
		}
		if (criteriaMap.containsKey(SearchCriteria.VacuumCleaner.FILTER_TYPE)){
			if(!(criteriaMap.get(SearchCriteria.VacuumCleaner.FILTER_TYPE) instanceof String)){
				return false;
			}
		}
		if (criteriaMap.containsKey(SearchCriteria.VacuumCleaner.BAG_TYPE)){
			if(!(criteriaMap.get(SearchCriteria.VacuumCleaner.BAG_TYPE) instanceof String)){
				return false;
			}
		}
		if (criteriaMap.containsKey(SearchCriteria.VacuumCleaner.WAND_TYPE)){
			if(!(criteriaMap.get(SearchCriteria.VacuumCleaner.WAND_TYPE) instanceof String)){
				return false;
			}
		}
		if (criteriaMap.containsKey(SearchCriteria.VacuumCleaner.MOTOR_SPEED_REGULATION)){
			try{
				Double.parseDouble(criteriaMap.get(SearchCriteria.VacuumCleaner.MOTOR_SPEED_REGULATION).toString());
			} catch (NumberFormatException e){
				return false;
			}
		}
		if (criteriaMap.containsKey(SearchCriteria.VacuumCleaner.CLEANING_WIDTH)){
			try{
				Double.parseDouble(criteriaMap.get(SearchCriteria.VacuumCleaner.CLEANING_WIDTH).toString());
			} catch (NumberFormatException e){
				return false;
			}
		}
		return true;
	}

	private static <E> boolean checkTabletPC(Map<E, Object> criteriaMap) {
		if (criteriaMap.containsKey(SearchCriteria.TabletPC.BATTERY_CAPACITY)) {
			try {
				Double.parseDouble(criteriaMap.get(SearchCriteria.TabletPC.BATTERY_CAPACITY).toString());
			} catch (NumberFormatException e) {
				return false;
			}
		}
		if (criteriaMap.containsKey(SearchCriteria.TabletPC.DISPLAY_INCHES)) {
			try {
				Double.parseDouble(criteriaMap.get(SearchCriteria.TabletPC.DISPLAY_INCHES).toString());
			} catch (NumberFormatException e) {
				return false;
			}
		}
		if (criteriaMap.containsKey(SearchCriteria.TabletPC.MEMORY_ROM)) {
			try {
				Double.parseDouble(criteriaMap.get(SearchCriteria.TabletPC.MEMORY_ROM).toString());
			} catch (NumberFormatException e) {
				return false;
			}
		}
		if (criteriaMap.containsKey(SearchCriteria.TabletPC.FLASH_MEMORY_CAPACITY)) {
			try {
				Double.parseDouble(criteriaMap.get(SearchCriteria.TabletPC.FLASH_MEMORY_CAPACITY).toString());
			} catch (NumberFormatException e) {
				return false;
			}
		}
		if (criteriaMap.containsKey(SearchCriteria.TabletPC.COLOR)) {
			if(!(criteriaMap.get(SearchCriteria.TabletPC.COLOR) instanceof String)){
				return false;
			}
		}
		return true;
	}

	private static <E> boolean checkSpeakers(Map<E, Object> criteriaMap) {
		if (criteriaMap.containsKey(SearchCriteria.Speakers.POWER_CONSUMPTION)) {
			try {
				Double.parseDouble(criteriaMap.get(SearchCriteria.Speakers.POWER_CONSUMPTION).toString());
			} catch (NumberFormatException e) {
				return false;
			}
		}
		if (criteriaMap.containsKey(SearchCriteria.Speakers.NUMBER_OF_SPEAKERS)) {
			try {
				Double.parseDouble(criteriaMap.get(SearchCriteria.Speakers.NUMBER_OF_SPEAKERS).toString());
			} catch (NumberFormatException e) {
				return false;
			}
		}
		if (criteriaMap.containsKey(SearchCriteria.Speakers.FREQUENCY_RANGE)) {
			if (!(criteriaMap.get(SearchCriteria.Speakers.FREQUENCY_RANGE) instanceof String)){
				return false;
			}
			String frequencyRangeValues = criteriaMap.get(SearchCriteria.Speakers.FREQUENCY_RANGE).toString();
			String[] frequencyTypes = frequencyRangeValues.split("-");
			if (frequencyTypes.length != 2){
				return false;
			}
			for(int i=0; i<frequencyTypes.length; i++){
				try{
					Double.parseDouble(frequencyTypes[i]);
				} catch (NumberFormatException e){
					return false;
				}
			}
		}
		if (criteriaMap.containsKey(SearchCriteria.Speakers.CORD_LENGTH)) {
			try {
				Double.parseDouble(criteriaMap.get(SearchCriteria.Speakers.CORD_LENGTH).toString());
			} catch (NumberFormatException e) {
				return false;
			}
		}
		return true;
	}

	private static <E> boolean checkNewspaper(Map<E, Object> criteriaMap) {
		if (criteriaMap.containsKey(SearchCriteria.Newspaper.TITLE)){
			if (!(criteriaMap.get(SearchCriteria.Newspaper.TITLE) instanceof String)){
				return false;
			}
		}
		if (criteriaMap.containsKey(SearchCriteria.Newspaper.PERIODICITY)){
			if (!(criteriaMap.get(SearchCriteria.Newspaper.PERIODICITY) instanceof String)){
				return false;
			}
		}
		if (criteriaMap.containsKey(SearchCriteria.Newspaper.PAID_OR_FREE)){
			if (!(criteriaMap.get(SearchCriteria.Newspaper.PAID_OR_FREE) instanceof String)){
				return false;
			}
		}
		return true;
	}

	private static <E> boolean checkTextBook(Map<E, Object> criteriaMap) {
		if (criteriaMap.containsKey(SearchCriteria.TextBook.TITLE)){
			if (!(criteriaMap.get(SearchCriteria.TextBook.TITLE) instanceof String)){
				return false;
			}
		}
		if (criteriaMap.containsKey(SearchCriteria.TextBook.SUBJECT)){
			if (!(criteriaMap.get(SearchCriteria.TextBook.SUBJECT) instanceof String)){
				return false;
			}
		}
		if (criteriaMap.containsKey(SearchCriteria.TextBook.AUTHOR)){
			if (!(criteriaMap.get(SearchCriteria.TextBook.AUTHOR) instanceof String)){
				return false;
			}
		}
		if (criteriaMap.containsKey(SearchCriteria.TextBook.NUMBER_OF_PAGES)) {
			try {
				Double.parseDouble(criteriaMap.get(SearchCriteria.TextBook.NUMBER_OF_PAGES).toString());
			} catch (NumberFormatException e) {
				return false;
			}
		}
		return true;
	}
}
