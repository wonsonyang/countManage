package com.efun.tools;

import java.util.ArrayList;
import java.util.List;

/**
 * 集合之间相关的操作
 * 
 * @author Alien
 * 
 */
public class CollectionOperer {

	public static List<ColectAtapter> fromArrayToList(String array[]) {
		List<ColectAtapter> list = new ArrayList<ColectAtapter>();
		ColectAtapter cas = null;
		for (int k = 0; k < array.length; k++) {
			cas = new ColectAtapter();
			cas.setName(array[k]);
			cas.setValue(k);
			list.add(cas);
		}
		return list;
	}
	
	public static List<ColectAtapter> fromListToList(List<?> list) {
		List<ColectAtapter> resultlist = new ArrayList<ColectAtapter>();
		ColectAtapter cas = null;
		for (int k = 0; k <list.size(); k++) {
			cas = new ColectAtapter();
			cas.setName(list.get(k)+"");
			cas.setValue(k);
			resultlist.add(cas);
		}
		return resultlist;
	}
	
}
