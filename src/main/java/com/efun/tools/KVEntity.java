package com.efun.tools;

/**
 * 键值对类,用于键值的存储
 * 
 * 类名称：KVEntity <br>
 * 类描述：常用于简单的键值的实体存储 <br>
 * 创建人：lengchengzhen <br>
 * 创建时间：2015-4-30 下午05:40:12 <br>
 * 修改人：lengchengzhen <br>
 * 修改时间：2015-4-30 下午05:40:12 <br>
 * 修改备注： <br>
 * 
 * @version
 * 
 */
public class KVEntity {

	private Object key;
	private Object value;

	public KVEntity() {
	}

	public KVEntity(Object key, Object value) {
		super();
		this.key = key;
		this.value = value;
	}

	public Object getKey() {
		return key;
	}

	public void setKey(Object key) {
		this.key = key;
	}

	public Object getValue() {
		return value;
	}

	public void setValue(Object value) {
		this.value = value;
	}

}
