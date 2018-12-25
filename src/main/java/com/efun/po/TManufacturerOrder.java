package com.efun.po;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * TManufacturerOrder entity.
 * 
 * @author MyEclipse Persistence Tools
 */
public class TManufacturerOrder implements java.io.Serializable {
	private static final long serialVersionUID = 5897302776802462580L;

	// Fields

	private Integer id;
	private Long userid;
	private String gameCode;
	private String serverCode;
	private String efunOrderId;
	private String thirdOrderId;
	private Float payMoney;
	private Float stone;
	private String moneyType;
	private Date orderTime;
	private String flag;
	private String item;
	private String deleted;

	// Constructors

	/** default constructor */
	public TManufacturerOrder() {
	}

	/** full constructor */
	public TManufacturerOrder(Long userid, String gameCode, String serverCode,
			String efunOrderId, String thirdOrderId, Float payMoney,
			Float stone, String moneyType, Date orderTime, String flag,
			String item, String deleted) {
		this.userid = userid;
		this.gameCode = gameCode;
		this.serverCode = serverCode;
		this.efunOrderId = efunOrderId;
		this.thirdOrderId = thirdOrderId;
		this.payMoney = payMoney;
		this.stone = stone;
		this.moneyType = moneyType;
		this.orderTime = orderTime;
		this.flag = flag;
		this.item = item;
		this.deleted = deleted;
	}

	public TManufacturerOrder(String data, String gameCode) throws ParseException {
		String replace = data.replace("\r", "").replace("\n", "");
		String[] split = replace.split("\\|");
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		this.orderTime = formatter.parse(split[0]);
		this.serverCode = split[1];
		this.userid = Long.valueOf(split[2]);
		String efunOrderId = split[3];
		this.efunOrderId = efunOrderId;
		this.thirdOrderId = split[4];
		this.moneyType = split[5];
		this.payMoney = Float.valueOf(split[6]);
		this.stone = Float.valueOf(split[7]);
		/*if(efunOrderId.contains("IOS")) {
			this.flag = "IOS";
		} else {
			this.flag = "Android";
		}*/
		this.flag = split[8];
		this.item = split[0].substring(0,7).replace("-", "");
		this.deleted = "0";
		this.gameCode = gameCode;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Long getUserid() {
		return this.userid;
	}

	public void setUserid(Long userid) {
		this.userid = userid;
	}

	public String getGameCode() {
		return this.gameCode;
	}

	public void setGameCode(String gameCode) {
		this.gameCode = gameCode;
	}

	public String getServerCode() {
		return this.serverCode;
	}

	public void setServerCode(String serverCode) {
		this.serverCode = serverCode;
	}

	public String getEfunOrderId() {
		return this.efunOrderId;
	}

	public void setEfunOrderId(String efunOrderId) {
		this.efunOrderId = efunOrderId;
	}

	public String getThirdOrderId() {
		return this.thirdOrderId;
	}

	public void setThirdOrderId(String thirdOrderId) {
		this.thirdOrderId = thirdOrderId;
	}

	public Float getPayMoney() {
		return this.payMoney;
	}

	public void setPayMoney(Float payMoney) {
		this.payMoney = payMoney;
	}

	public Float getStone() {
		return this.stone;
	}

	public void setStone(Float stone) {
		this.stone = stone;
	}

	public String getMoneyType() {
		return this.moneyType;
	}

	public void setMoneyType(String moneyType) {
		this.moneyType = moneyType;
	}

	public Date getOrderTime() {
		return this.orderTime;
	}

	public void setOrderTime(Date orderTime) {
		this.orderTime = orderTime;
	}

	public String getFlag() {
		return this.flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	public String getItem() {
		return this.item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public String getDeleted() {
		return this.deleted;
	}

	public void setDeleted(String deleted) {
		this.deleted = deleted;
	}

}