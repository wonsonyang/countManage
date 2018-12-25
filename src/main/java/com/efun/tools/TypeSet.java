package com.efun.tools;

import java.util.*;

public class TypeSet {

	/**
	 * 类型集对象
	 */
	private static TypeSet typeSet = null;

	private TypeSet() {

	}

	// 获取示例
	public static TypeSet getInstanse() {
		if (typeSet == null) {
			typeSet = new TypeSet();
			typeSet.init();
		}

		return typeSet;
	}

	private Map<DataSourceMap, String> AREA_CORE_MASTER = new LinkedHashMap<DataSourceMap, String>();// 主库225

	private Map<DataSourceMap, String> AREA_CORE_SLAVE = new LinkedHashMap<DataSourceMap, String>();// 从库227

	private Map<DataSourceMap, String> AREA_EXTEND_MASTER = new LinkedHashMap<DataSourceMap, String>();// 231

	private Map<DataSourceMap, String> AREA_EXTEND_SLAVE = new LinkedHashMap<DataSourceMap, String>();// 232

	/**
	 * 数组类型,缺点,必须从0开始
	 */
	private String RATE_TYPE[] = { "所有金流同比例" };

	private List<KVEntity> RATE_RULE = new ArrayList<KVEntity>();

	private void init() {
		// 核心主库
		AREA_CORE_MASTER.put(DataSourceMap.hk_tw, "港台");
		AREA_CORE_MASTER.put(DataSourceMap.taiwan, "台湾新联运平台");
		AREA_CORE_MASTER.put(DataSourceMap.asia, "亚欧");
		AREA_CORE_MASTER.put(DataSourceMap.korea, "韩国");
		AREA_CORE_MASTER.put(DataSourceMap.korea_kq, "韩国KQ");
		AREA_CORE_MASTER.put(DataSourceMap.middle_east, "中东");
		AREA_CORE_MASTER.put(DataSourceMap.thailand, "泰国");
		AREA_CORE_MASTER.put(DataSourceMap.vietnam2, "越南");
		AREA_CORE_MASTER.put(DataSourceMap.vietnam_partner, "越南联运");
		AREA_CORE_MASTER.put(DataSourceMap.indonesia, "印尼");
		AREA_CORE_MASTER.put(DataSourceMap.america, "美国");
		AREA_CORE_MASTER.put(DataSourceMap.japan, "日本");
		AREA_CORE_MASTER.put(DataSourceMap.global, "亚欧全球");
		AREA_CORE_MASTER.put(DataSourceMap.kl, "韩国");

		// 核心从库
		AREA_CORE_SLAVE.put(DataSourceMap.hk_tw_core_slave, "港台");
		AREA_CORE_SLAVE.put(DataSourceMap.taiwan_core_slave, "台湾新联运平台");
		AREA_CORE_SLAVE.put(DataSourceMap.asia_core_slave, "亚欧");
		AREA_CORE_SLAVE.put(DataSourceMap.korea, "韩国");
		AREA_CORE_SLAVE.put(DataSourceMap.korea_kq, "韩国KQ");
		AREA_CORE_SLAVE.put(DataSourceMap.middle_east, "中东");
		AREA_CORE_SLAVE.put(DataSourceMap.thailand, "泰国");
		AREA_CORE_SLAVE.put(DataSourceMap.vietnam2_core_slave, "越南");
		AREA_CORE_SLAVE.put(DataSourceMap.vietnam_partner_core_slave, "越南联运");
		AREA_CORE_SLAVE.put(DataSourceMap.indonesia_core_slave, "印尼");
		AREA_CORE_SLAVE.put(DataSourceMap.america, "美国");
		AREA_CORE_SLAVE.put(DataSourceMap.japan, "日本");
		AREA_CORE_SLAVE.put(DataSourceMap.global, "亚欧全球");
		AREA_CORE_SLAVE.put(DataSourceMap.kl, "韩国");

		// 扩展业务主库
		AREA_EXTEND_MASTER.put(DataSourceMap.hk_tw_extend_master, "港台");
		AREA_EXTEND_MASTER.put(DataSourceMap.taiwan_extend_master, "台湾新联运平台");
		AREA_EXTEND_MASTER.put(DataSourceMap.asia_extend_master, "亚欧");
		AREA_EXTEND_MASTER.put(DataSourceMap.korea, "韩国");
		AREA_EXTEND_MASTER.put(DataSourceMap.korea_kq, "韩国KQ");
		AREA_EXTEND_MASTER.put(DataSourceMap.middle_east, "中东");
		AREA_EXTEND_MASTER.put(DataSourceMap.thailand, "泰国");
		AREA_EXTEND_MASTER.put(DataSourceMap.vietnam2_extend_master, "越南");
		AREA_EXTEND_MASTER.put(DataSourceMap.vietnam_partner_extend_master, "越南联运");
		AREA_EXTEND_MASTER.put(DataSourceMap.indonesia_extend_master, "印尼");
		AREA_EXTEND_MASTER.put(DataSourceMap.america, "美国");
		AREA_EXTEND_MASTER.put(DataSourceMap.japan, "日本");
		AREA_EXTEND_MASTER.put(DataSourceMap.global, "亚欧全球");
		AREA_EXTEND_MASTER.put(DataSourceMap.kl, "韩国");

		// 拓展业务从库
		AREA_EXTEND_SLAVE.put(DataSourceMap.hk_tw_extend_slave, "港台");
		AREA_EXTEND_SLAVE.put(DataSourceMap.taiwan_extend_slave, "台湾新联运平台");
		AREA_EXTEND_SLAVE.put(DataSourceMap.asia_extend_slave, "亚欧");
		AREA_EXTEND_SLAVE.put(DataSourceMap.korea_vice, "韩国");
		AREA_EXTEND_SLAVE.put(DataSourceMap.korea_kq_vice, "韩国KQ");
		AREA_EXTEND_SLAVE.put(DataSourceMap.middle_east, "中东");
		AREA_EXTEND_SLAVE.put(DataSourceMap.thailand, "泰国");
		AREA_EXTEND_SLAVE.put(DataSourceMap.vietnam2_extend_slave, "越南");
		AREA_EXTEND_SLAVE.put(DataSourceMap.vietnam_partner_extend_slave, "越南联运");
		AREA_EXTEND_SLAVE.put(DataSourceMap.indonesia_extend_slave, "印尼");
		AREA_EXTEND_SLAVE.put(DataSourceMap.america, "美国");
		AREA_EXTEND_SLAVE.put(DataSourceMap.japan, "日本");
		AREA_EXTEND_SLAVE.put(DataSourceMap.global, "亚欧全球");
		AREA_EXTEND_SLAVE.put(DataSourceMap.kl_vice, "韩国");

		// List<KVEntity>类型
		RATE_RULE.add(new KVEntity("0", "以本返利为准"));
		RATE_RULE.add(new KVEntity("1", "叠加"));
		// RATE_RULE.add(new KVEntity("2","以另一返利为准"));
	}

	public Map<DataSourceMap, String> getAREA_CORE_MASTER() {
		return AREA_CORE_MASTER;
	}

	public Map<DataSourceMap, String> getAREA_CORE_SLAVE() {
		return AREA_CORE_SLAVE;
	}

	public Map<DataSourceMap, String> getAREA_EXTEND_MASTER() {
		return AREA_EXTEND_MASTER;
	}

	public Map<DataSourceMap, String> getAREA_EXTEND_SLAVE() {
		return AREA_EXTEND_SLAVE;
	}

	public String[] getRATE_TYPE() {
		return RATE_TYPE;
	}

	public List<?> toList(String[] values) {
		return CollectionOperer.fromArrayToList(values);
	}

	@SuppressWarnings("rawtypes")
	public static Map<String, Object> getTypeSets() {
		try {
			Map<String, Object> typesets = new HashMap<String, Object>();

			TypeSet ts = TypeSet.getInstanse();

			Map<String, Object> m = ObjectUtil.getFieldListFromObject(ts);
			Iterator<String> it = m.keySet().iterator();
			while (it.hasNext()) {
				String key = it.next();
				Object obj = m.get(key);
				if (null == obj) {
					continue;
				}

				if (key.equals("TYPES")) {
					continue;
				}

				String className = obj.getClass().getName();
				if (obj instanceof List) {

					// 对List集合做特殊支持
					List listTemp = (List) obj;

					Object objTemp = listTemp.get(0);
					// ColectAtapter对象,访问需要对象为name,value
					if (objTemp instanceof ColectAtapter) {
						typesets.put(key, listTemp);
					} else if (objTemp instanceof KVEntity) {
						// KVEntity对象,访问需要对象为key,object
						typesets.put(key, listTemp);
					} else {
						// 其他对象为name,value
						List list = CollectionOperer.fromListToList(listTemp);
						typesets.put(key, list);
					}
				} else if (obj instanceof Map) {
					typesets.put(key, obj);
				} else {
					// 数组做特殊支持
					if (className.startsWith("[Ljava.lang.String")) {
						String[] strArr = (String[]) obj;
						List list = CollectionOperer.fromArrayToList(strArr);
						typesets.put(key, list);
					}
				}
			}

			return typesets;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public static void main(String[] args) {
		getTypeSets();
	}
}
