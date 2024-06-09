package com.DeepServelets;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DeepCatalog {

	private static Map<String, DeepCatalogItem> catalogItems= new HashMap<String, DeepCatalogItem>();
	
	public static void addItem(DeepCatalogItem deepCatalogItem) {
		
		catalogItems.put(deepCatalogItem.getSku(), deepCatalogItem);
	}
	
	
	public static DeepCatalogItem getItem(String sku) {
		
		return catalogItems.get(sku);
		
	}
	
	public static List<DeepCatalogItem> getItems() {
		
		return new ArrayList<DeepCatalogItem>(catalogItems.values());
	}
}
