package com.efun.tools;

import java.util.Comparator;

/**
 * 自定义List<KVEntity>排序器
 * 
 * 类名称：KVEntityComparator <br>
 * 类描述： <br>
 * 创建人：lengchengzhen <br>
 * 创建时间：2016-9-8 下午05:20:58 <br>
 * 修改人：lengchengzhen <br>
 * 修改时间：2016-9-8 下午05:20:58 <br>
 * 修改备注： <br>
 * 
 * @version
 * 
 */

public class KVEntityComparator implements Comparator<KVEntity> {

	public static final String ASC = "asc";

	public static final String DESC = "desc";

	private String ordertype;

	public KVEntityComparator(String ordertype) {
		this.ordertype = ordertype;
	}

	public int compare(KVEntity o1, KVEntity o2) {
		String str1 = o1.getKey() + "";
		String str2 = o2.getKey() + "";
		if (ordertype.equals(DESC)) {
			return str1.compareTo(str2);
		} else {
			return str2.compareTo(str1);
		}
	}

}