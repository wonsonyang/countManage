package com.efun.tools;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

/**
 * 该类用于对象类的各种操作,包含了对象的判断,复制,创建,对象转移等操作
 * 
 * 类名称：ObjectUtil <br>
 * 类描述： Object操作的工具类 <br>
 * 创建人：lengchengzhen <br>
 * 创建时间：2015-3-6 下午04:55:00 <br>
 * 修改人：lengchengzhen <br>
 * 修改时间：2015-4-17 下午12:55:00
 * 修改备注： <br>
 * 
 * @version
 * 
 */
public class ObjectUtil {

	/**
	 * 判断一个或者多個obj是否存在空对象
	 * 
	 * @author lengchengzhen
	 * @param objs
	 *            多个object对象
	 * @return 是否包含空对象(null)
	 */
	public static boolean haveNULLObject(Object... objs) {
		if (null == objs) {
			return true;
		}

		for (Object object : objs) {
			if (null == object) {
				return true;
			}
		}

		return false;
	}

	/**
	 * 将对象复制给classType类型的对象(属于浅层复制)
	 * 
	 * @author lengchengzhen
	 * @param <T>
	 *            泛型
	 * @param objFrom
	 *            源对象
	 * @param classType
	 *            类型
	 * @return 复制得到的对象
	 * @throws Exception
	 */
	public static <T> T copyForT(Object objFrom, Class<T> classType) throws Exception {
		T obj = classType.newInstance();
		copyobj2obj(objFrom, obj);
		return obj;
	}

	/**
	 * 将map中的数据复制到T对象上面
	 * 如果m中的某些参数无法被赋值给对象t,则调过该变量,继续下一个变量的赋值,直到该对象参数赋值结束
	 * 
	 * @param <T>
	 *            需要获取的实体对象类型T
	 * @param m
	 *            参数Map<String,Object>
	 * @param classType
	 *            实体类名
	 * @return
	 * @throws IllegalAccessException
	 * @throws InstantiationException
	 * @throws Exception
	 */
	public static Map<String, Object> getFieldListFromObject(Object objFrom) throws Exception {
		Field[] fs2 = objFrom.getClass().getDeclaredFields();

		Map<String, Object> map = new HashMap<String, Object>(fs2.length);
		for (Field f : fs2) {
			f.setAccessible(true);
			String fieldName = f.getName();
			Object obj = f.get(objFrom);
			map.put(fieldName, obj);
		}
		return map;
	}

	/**
	 * 深度复制 (用序列化的特点来进行深拷贝。无论有多少个对象引用都可以复制)
	 * 
	 * @author lengchengzhen
	 * @param obj
	 *            需要复制的对象(需要实现序列化接口)
	 * @return 复制的对象
	 * @throws Exception
	 */
	public static Object deepCopy(Object obj) throws Exception {
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		oos.writeObject(obj);
		ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
		ObjectInputStream ois = new ObjectInputStream(bis);
		return ois.readObject();
	}

	/**
	 * 将对象objFrom复制给objTo对象(属于浅层复制)
	 * 
	 * @author lengchengzhen
	 * @param objFrom
	 *            源对象
	 * @param objTo
	 *            目前对象
	 * @throws Exception
	 */
	private static void copyobj2obj(Object objFrom, Object objTo) throws Exception {
		Map<String, Object> props = new HashMap<String, Object>();
		Map<String, String> haveProps = new HashMap<String, String>();

		// 属性的名称和属性的内容
		Field[] fs = objFrom.getClass().getDeclaredFields();

		for (Field f : fs) {
			f.setAccessible(true);
			Object OtherObj = f.get(objFrom);
			String fieldName = f.getName();
			props.put(fieldName, OtherObj);
			haveProps.put(fieldName, fieldName);
		}

		Field[] fs2 = objTo.getClass().getDeclaredFields();

		for (Field f : fs2) {
			f.setAccessible(true);
			String fieldName = f.getName();
			Object objTemp = props.get(fieldName);
			if (null != haveProps.get(fieldName) && !"serialVersionUID".equals(fieldName)) {
				f.set(objTo, objTemp);
			}
		}
	}
	
}
