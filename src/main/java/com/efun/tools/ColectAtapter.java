package com.efun.tools;

/**
 * 适配LIST
 * 
 * @author GanYiYong
 * @date 2013-12-06
 */
public class ColectAtapter {

	private int value;
	private String name;

	public ColectAtapter() {
	}

	public ColectAtapter(int value, String name) {
		super();
		this.value = value;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

}
