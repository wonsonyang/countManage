package com.efun.dao;


import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.jdbc.core.simple.SimpleJdbcInsertOperations;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class BaseDaoImpl implements BaseDao {

	private static final Logger logger = Logger.getLogger(BaseDaoImpl.class);

	@Autowired
	protected JdbcTemplate jdbcTemplate;

	@Override
	@SuppressWarnings("unchecked")
	public <T> T findOne(String sql, Object[] params, Class<T> classType) throws SQLException {
		if (sql != null && sql.indexOf("limit") == -1 && sql.indexOf("LIMIT") == -1) {
			sql = new StringBuilder().append(sql).append(" limit 1").toString();
		}
		//SqlPrintUtil.printSql(sql, params);
		List<?> s = jdbcTemplate.queryForList(sql, params);
		if (s == null || s.size() == 0)
			return null;
		Map<String, Object> map = (Map<String, Object>) s.get(0);
		try {
			T o = classType.newInstance();
			Method[] methods = classType.getMethods();
			for (Method method : methods) {
				String fieldName = method.getName();
				if (fieldName.equals("getClass")) {
					continue;
				}
				if (fieldName.startsWith("get")) {
					fieldName = fieldName.substring(3);
					fieldName = fieldName.substring(0, 1).toLowerCase() + fieldName.substring(1);
					Field field = classType.getDeclaredField(fieldName);
					if (field == null) {
						continue;
					}
					field.setAccessible(true);
					Object fieldValue = map.get(fieldName);

					if (fieldValue != null) {
						if (field.getType().getName().toLowerCase().endsWith("long")) {
							field.set(o, Long.valueOf(String.valueOf(fieldValue)));
						} else {
							field.set(o, fieldValue);
						}
					}
				}
			}
			return o;
		} catch (Exception e) {
			logger.info(
					" ExceptionName=" + e.getClass().getName() + " --> " + "ExceptionMsg=" + e.getMessage() + " --> ",
					e);
		}
		return null;
	}

	@Override
	@SuppressWarnings("unchecked")
	public <T> List<T> findList(String sql, Object[] params, Class<T> classType) throws SQLException {
		//SqlPrintUtil.printSql(sql, params);
		List<?> s = jdbcTemplate.queryForList(sql, params);
		List<T> list = new ArrayList<T>();
		for (int i = 0, len = s.size(); i < len; i++) {
			Map<String, Object> map = (Map<String, Object>) s.get(i);
			try {
				T o = classType.newInstance();
				Method[] methods = classType.getMethods();
				for (Method method : methods) {
					String fieldName = method.getName();
					if (fieldName.equals("getClass")) {
						continue;
					}
					if (fieldName.startsWith("get")) {
						fieldName = fieldName.substring(3);
						fieldName = fieldName.substring(0, 1).toLowerCase() + fieldName.substring(1);
						Field field = classType.getDeclaredField(fieldName);
						if (field == null) {
							continue;
						}
						field.setAccessible(true);
						Object fieldValue = map.get(fieldName);
						if (fieldValue != null) {
							if (field.getType().getName().toLowerCase().endsWith("long")) {
								field.set(o, Long.valueOf(String.valueOf(fieldValue)));
							} else {
								field.set(o, fieldValue);
							}
						}
					}
				}
				list.add(o);
			} catch (Exception e) {
				logger.error("findList Exception : " + e.getMessage());
			}
		}
		return list;
	}

	@Override
	public long saveOrUpdate(String sql, Object[] params) {
		//SqlPrintUtil.printSql(sql, params);
		return jdbcTemplate.update(sql, params);
	}

	@Override
	public int[] batchUpdate(String sql, List<Object[]> params) {
		//SqlPrintUtil.printSql(sql, params.toArray());
		return jdbcTemplate.batchUpdate(sql, params);
	}

	@Override
	public long updateLast(Object obj, String tableName, String keyColumns) {// 保存对象，并获取主键值
		//SqlPrintUtil.printSql(tableName, JSONObject.toJSONString(obj));
		SimpleJdbcInsertOperations simpleJdbcInsert = new SimpleJdbcInsert((JdbcTemplate) jdbcTemplate);
		simpleJdbcInsert.withTableName(tableName);
		BeanPropertySqlParameterSource bp = new BeanPropertySqlParameterSource(obj);
		SqlParameterSource sps = bp;
		return (Long) simpleJdbcInsert.usingGeneratedKeyColumns(keyColumns).executeAndReturnKey(sps);
	}

	@Override
	public List<Map<String, Object>> find(String sql, Object[] obs) throws SQLException {
		//SqlPrintUtil.printSql(sql, obs);
		return jdbcTemplate.queryForList(sql, obs);
	}
	
	@Override
	public <T> T query(String sql, Object[] params, Class<T> classType){
		T t = null;
		try{
			t = jdbcTemplate.queryForObject(sql, params, classType);		
		}catch(Exception e ){
			logger.info("query--Exception:"+e+" SQL:"+sql);
		}
		return t;
	}
	
	
}
