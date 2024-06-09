package myPackage.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import myPackage.Model.CatalogItem;

public class CatalogService {

	private static Map<String, CatalogItem> catalogMap = new HashMap<String, CatalogItem>();

	public static void addItem(CatalogItem catalogItem) {

		catalogMap.put(catalogItem.getSku(), catalogItem);
	}

	public static CatalogItem getCatalogItem(String sku) {

		return catalogMap.get(sku);
	}

	public static List<CatalogItem> getAllCatalogItems() {

		return new ArrayList<CatalogItem>(catalogMap.values());
	}

}
