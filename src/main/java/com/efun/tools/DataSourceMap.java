package com.efun.tools;

/**
 * 数据源表
 * 
 * @author fancy
 * 
 */
public enum DataSourceMap {
	middle_east, // 中东
	hk_tw, // 港台225
	hk_tw_core_slave,	// 港台227
	hk_tw_extend_master, // 港台从库231
	hk_tw_extend_slave, // 港台从库232
	hk_tw_extend_push, // 港台推送
	korea, // 韩国（主）
	korea_vice, // 韩国（从）
	korea_kq, // 韩国Qfun（主）
	korea_kq_vice, // 韩国Qfun（从）
	asia, // 亚欧基础主库
	asia_core_slave, // 亚欧基础从库
	asia_extend_master, // 亚欧拓展主库
	asia_extend_slave, // 亚欧拓展从库
	vietnam2,	// 越南2 指向亚欧基础主库
	vietnam2_core_slave,	// 越南2 指向亚欧基础从库
	vietnam2_extend_master,	// 越南2,指向亚欧拓展主库
	vietnam2_extend_slave,	// 越南2,指向亚欧拓展从库
	vietnam_partner,	// 越南联运 指向亚欧基础主库
	vietnam_partner_core_slave,	// 越南联运 指向亚欧基础从库
	vietnam_partner_extend_master,	// 越南联运,指向亚欧拓展主库
	vietnam_partner_extend_slave,	// 越南联运,指向亚欧拓展从库
	thailand, // 泰国
	russia,    // 俄罗斯
	indonesia, // 印尼基础主库
	indonesia_core_slave, // 印尼基础从库
	indonesia_extend_master, // 印尼拓展主库
	indonesia_extend_slave, // 印尼拓展从库
	america, // 美洲
	adv, // 广告
	manager, // 后台
	japan, // 日本
	global,// 全球
	kl, // 韩国联运（主）
	kl_vice,// 韩国联运（从）
	taiwan,//台湾新平台（基础主库）
	taiwan_core_slave,//台湾新平台（基础从库）
	taiwan_extend_master, //台湾新平台（拓展主库）
	taiwan_extend_slave; //台湾新平台（拓展从库）

	public static DataSourceMap getDataSourceMap(String area) {
		for (DataSourceMap s : DataSourceMap.values()) {
			if (s.name().equals(area)) {
				return s;
			}
		}
		return null;
	}

	public static DataSourceMap getBaseDataSource(DataSourceMap nowSource, boolean needMain) {
		switch (nowSource) {
			case hk_tw:
			case hk_tw_core_slave:
			case hk_tw_extend_master:
			case hk_tw_extend_slave:
				if (needMain) {
					return DataSourceMap.hk_tw;
				} else {
					return DataSourceMap.hk_tw_core_slave;
				}
			case taiwan:
			case taiwan_core_slave:
			case taiwan_extend_master:
				return DataSourceMap.taiwan;
			case taiwan_extend_slave:
				if (needMain) {
					return DataSourceMap.taiwan;
				} else {
					return DataSourceMap.taiwan_core_slave;
				}
			case asia:
			case asia_core_slave:
			case asia_extend_master:
			case asia_extend_slave:
				if (needMain) {
					return DataSourceMap.asia;
				} else {
					return DataSourceMap.asia_core_slave;
				}
			case indonesia:
			case indonesia_core_slave:
			case indonesia_extend_master:
			case indonesia_extend_slave:
				if (needMain) {
					return DataSourceMap.indonesia;
				} else {
					return DataSourceMap.indonesia_core_slave;
				}
			case vietnam2:
			case vietnam2_core_slave:
			case vietnam2_extend_master:
			case vietnam2_extend_slave:
				if (needMain) {
					return DataSourceMap.vietnam2;
				} else {
					return DataSourceMap.vietnam2_core_slave;
				}
			case vietnam_partner:
			case vietnam_partner_core_slave:
			case vietnam_partner_extend_master:
			case vietnam_partner_extend_slave:
				if (needMain) {
					return DataSourceMap.vietnam_partner;
				} else {
					return DataSourceMap.vietnam_partner_core_slave;
				}
			case korea:
			case korea_vice:
				return DataSourceMap.korea;
			case korea_kq:
			case korea_kq_vice:
				return DataSourceMap.korea_kq;
			case kl:
			case kl_vice:
				return DataSourceMap.kl;
			default:
				return nowSource;
		}
	}

	public static DataSourceMap getExtendDataSource(DataSourceMap nowSource, boolean needMain) {
		switch (nowSource) {
			case hk_tw:
			case hk_tw_core_slave:
				if (needMain) {
					return DataSourceMap.hk_tw_extend_master;
				} else {
					return DataSourceMap.hk_tw_extend_slave;
				}
			case asia:
			case asia_core_slave:
				if (needMain) {
					return DataSourceMap.asia_extend_master;
				} else {
					return DataSourceMap.asia_extend_slave;
				}
			case indonesia:
			case indonesia_core_slave:
				if (needMain) {
					return DataSourceMap.indonesia_extend_master;
				} else {
					return DataSourceMap.indonesia_extend_slave;
				}
			case vietnam2:
			case vietnam2_core_slave:
				if (needMain) {
					return DataSourceMap.vietnam2_extend_master;
				} else {
					return DataSourceMap.vietnam2_extend_slave;
				}
			case vietnam_partner:
			case vietnam_partner_core_slave:
				if (needMain) {
					return DataSourceMap.vietnam_partner_extend_master;
				} else {
					return DataSourceMap.vietnam_partner_extend_slave;
				}
			case taiwan:
			case taiwan_core_slave:
				if (needMain) {
					return DataSourceMap.taiwan_extend_master;
				} else {
					return DataSourceMap.taiwan_extend_slave;
				}
			default:
				return nowSource;
		}
	}
}
