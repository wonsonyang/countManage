package com.efun.rpc.service.support;

import com.efun.rpc.annotation.RpcService;


import java.util.List;

/**
 * 储值接口
 * 
 * @author hedongzhou
 *
 */
@RpcService
public interface PayRpcService {

	/**
	 * 新增
	 * 
	 * @param entity
	 * @return
	 */
	public String save(Object entity);

	/**
	 * 批量新增
	 * 
	 * @param entity
	 * @return
	 */
	public String saveAll(List<?> entity);

	/**
	 * 更新
	 * 
	 * @param entity
	 * @return
	 */
	public String update(Object entity);

	/**
	 * 删除
	 * 
	 * @param cls
	 * @param ids
	 * @return
	 */
	public String delete(Class<?> cls, String... ids);

	/**
	 * 执行SQL
	 * 
	 * @param sql
	 * @return
	 */
	public String excuteSql(String sql);

	/**
	 * 排序
	 * 
	 * @param idColumn
	 *            主键字段名
	 * @param sortColumn
	 *            排序字段名
	 * @param data
	 *            格式：“48523-101,48524-102,...”
	 * @return
	 */
	public String sort(String idColumn, String sortColumn, String data);

	/**
	 * 刷新品项缓存
	 * 
	 * @param gameCode
	 * @return
	 */
	public void clearItemListByGameCode(String gameCode);

	/**
	 * 删除缓存
	 * 
	 * @param functionFlag
	 *            需要删除缓存的功能标识
	 * @param cacheKey
	 *            缓存的Key
	 */
	public void clearCache(String functionFlag, String cacheKey);

	/**
	 * 金流查单
	 * 
	 * @param efunOrderId
	 *            Efun订单
	 * @param flag
	 *            金流标识
	 */
	public String order(String efunOrderId, String flag);

	/**
	 * Google金流补单
	 * 
	 * @param efunOrderId
	 * @param googleOrderId
	 */
	public String googleplay(String efunOrderId, String googleOrderId);

	/**
	 * appstore金流补单
	 * 
	 * @param efunOrderId
	 * @param transactionId
	 */
	public String appstore(String efunOrderId, String transactionId);

	/**
	 * bluepay金流补单
	 * 
	 * @param efunOrderId
	 */
	public String bluepay(String efunOrderId);

	/**
	 * worldpay金流补单
	 * 
	 * @param efunOrderId
	 */
	public String worldpay(String efunOrderId);

	/**
	 * paypal金流补单
	 * 
	 * @param efunOrderId
	 * @param googleOrderId
	 */
	public String paypal(String efunOrderId, String gpmid);

	/**
	 * mol金流补单
	 * 
	 * @param efunOrderId
	 */
	public String mol(String efunOrderId);

	/**
	 * molthailand金流补单
	 * 
	 * @param efunOrderId
	 */
	public String molthailand(String efunOrderId);

	/**
	 * paydibs金流补单
	 * 
	 * @param efunOrderId
	 */
	public String paydibs(String efunOrderId);

	/**
	 * mimopay金流补单
	 * 
	 * @param efunOrderId
	 */
	public String mimopay(String efunOrderId);

	/**
	 * easy2pay金流补单
	 * 
	 * @param efunOrderId
	 */
	public String easy2pay(String efunOrderId);

	/**
	 * coda金流补单
	 * 
	 * @param efunOrderId
	 */
	public String coda(String efunOrderId);

	/**
	 * mycard金流补单
	 * 
	 * @param efunOrderId
	 */
	public String mycard(String efunOrderId);

	/**
	 * unipin金流补单
	 * 
	 * @param efunOrderId
	 */
	public String unipin(String efunOrderId);

	/**
	 * upay金流补单
	 * 
	 * @param efunOrderId
	 */
	public String upay(String efunOrderId);

	/**
	 * 金流统一补发接口，港台先上
	 * 
	 * @param flag
	 * @param efunOrderIds
	 * @return
	 */
	public String batchReSendCoin(String flag, String efunOrderIds);

}
