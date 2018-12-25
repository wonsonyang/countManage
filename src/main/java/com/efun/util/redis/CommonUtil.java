package com.efun.util.redis;

import java.io.*;

public class CommonUtil {

	/**
	 * if(object!=null&&object.toString().trim().length()>0){ return true;
	 * }else{ return false; }
	 * 
	 * @param object
	 * @return
	 */
	public static boolean objectIsNotNull(Object object) {
		if (object != null && object.toString().trim().length() > 0) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * 序列化
	 * 
	 * @param o
	 * @return
	 * @throws Exception
	 */
	public static byte[] serialize(Object o) throws Exception {
		ByteArrayOutputStream baos = new ByteArrayOutputStream(); // 构造一个字节输出流
		ObjectOutputStream oos = new ObjectOutputStream(baos); // 构造一个类输出流
		oos.writeObject(o); // 写这个对象
		byte[] buf = baos.toByteArray(); // 从这个地层字节流中把传输的数组给一个新的数组
		oos.flush();
		oos.close();
		baos.close();
		return buf;
	}

	/**
	 * 反序列化
	 * 
	 * @param bytes
	 * @return
	 * @throws IOException
	 * @throws ClassNotFoundException
	 */
	public static Object deserialize(byte[] bytes) throws IOException, ClassNotFoundException {
		// 构建一个类输入流，地层用字节输入流实现
		ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
		ObjectInputStream ois = new ObjectInputStream(bais);
		Object obj = ois.readObject();
		ois.close();
		return obj;
	}

}
