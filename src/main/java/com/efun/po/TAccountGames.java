package com.efun.po;

/**
 * 港台、亚欧游戏对账设置实体
 */
public class TAccountGames implements java.io.Serializable {

	private static final long serialVersionUID = -8979122626355425890L;
	private Integer id;
	private String month;
	private String gcode;
	private String gameCode;
	private String gameName;
	private String manuName;
	private String decimalWith;
	private String contrastItem;
	private String manuCode;
	private String area;
	private Integer department;
	private String divide;
	private String billMerge;
	private String amountCurrency;
	private String cashflowDivide;
	private String billCashflow;
	private String exchangeRate;
	private String dividePattern;
	private String status;
	private String giveDivide;
	private String includeFlow;
	private String manuUser;
	private String reserve1;
	private String neglectCashflow;
	private Double googleExchangeRate;
	private String deleted;
	private String gameCashflowFiles; // 允许合作商可见文件,中间用"-"分隔
	private String contractCompany;   //签约公司（易幻网络有限公司、Regina、Efun International）
	private String taxRate;           //税率"{"googleTaxRate":"18","iosTaxRate":"17","thirdTaxRate":"16"}"

	/** default constructor */
	public TAccountGames() {
	}

	/** full constructor */
	public TAccountGames(String month, String gcode, String gameCode, String gameName,
			String manuName, String decimalWith, String contrastItem, String manuCode, String area,
			Integer department, String divide, String billMerge, String amountCurrency,
			String cashflowDivide, String billCashflow, String exchangeRate, String dividePattern,
			String status, String giveDivide, String includeFlow, String manuUser, String reserve1,
			String neglectCashflow, Double googleExchangeRate, String deleted) {
		this.month = month;
		this.gcode = gcode;
		this.gameCode = gameCode;
		this.gameName = gameName;
		this.manuName = manuName;
		this.decimalWith = decimalWith;
		this.contrastItem = contrastItem;
		this.manuCode = manuCode;
		this.area = area;
		this.department = department;
		this.divide = divide;
		this.billMerge = billMerge;
		this.amountCurrency = amountCurrency;
		this.cashflowDivide = cashflowDivide;
		this.billCashflow = billCashflow;
		this.exchangeRate = exchangeRate;
		this.dividePattern = dividePattern;
		this.status = status;
		this.giveDivide = giveDivide;
		this.includeFlow = includeFlow;
		this.manuUser = manuUser;
		this.reserve1 = reserve1;
		this.neglectCashflow = neglectCashflow;
		this.googleExchangeRate = googleExchangeRate;
		this.deleted = deleted;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getMonth() {
		return this.month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public String getGcode() {
		return this.gcode;
	}

	public void setGcode(String gcode) {
		this.gcode = gcode;
	}

	public String getGameCode() {
		return this.gameCode;
	}

	public void setGameCode(String gameCode) {
		this.gameCode = gameCode;
	}

	public String getGameName() {
		return this.gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	public String getManuName() {
		return this.manuName;
	}

	public void setManuName(String manuName) {
		this.manuName = manuName;
	}

	public String getDecimalWith() {
		return this.decimalWith;
	}

	public void setDecimalWith(String decimalWith) {
		this.decimalWith = decimalWith;
	}

	public String getContrastItem() {
		return this.contrastItem;
	}

	public void setContrastItem(String contrastItem) {
		this.contrastItem = contrastItem;
	}

	public String getManuCode() {
		return this.manuCode;
	}

	public void setManuCode(String manuCode) {
		this.manuCode = manuCode;
	}

	public String getArea() {
		return this.area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public Integer getDepartment() {
		return this.department;
	}

	public void setDepartment(Integer department) {
		this.department = department;
	}

	public String getDivide() {
		return this.divide;
	}

	public void setDivide(String divide) {
		this.divide = divide;
	}

	public String getBillMerge() {
		return this.billMerge;
	}

	public void setBillMerge(String billMerge) {
		this.billMerge = billMerge;
	}

	public String getAmountCurrency() {
		return this.amountCurrency;
	}

	public void setAmountCurrency(String amountCurrency) {
		this.amountCurrency = amountCurrency;
	}

	public String getCashflowDivide() {
		return this.cashflowDivide;
	}

	public void setCashflowDivide(String cashflowDivide) {
		this.cashflowDivide = cashflowDivide;
	}

	public String getBillCashflow() {
		return this.billCashflow;
	}

	public void setBillCashflow(String billCashflow) {
		this.billCashflow = billCashflow;
	}

	public String getExchangeRate() {
		return this.exchangeRate;
	}

	public void setExchangeRate(String exchangeRate) {
		this.exchangeRate = exchangeRate;
	}

	public String getDividePattern() {
		return this.dividePattern;
	}

	public void setDividePattern(String dividePattern) {
		this.dividePattern = dividePattern;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getGiveDivide() {
		return this.giveDivide;
	}

	public void setGiveDivide(String giveDivide) {
		this.giveDivide = giveDivide;
	}

	public String getIncludeFlow() {
		return this.includeFlow;
	}

	public void setIncludeFlow(String includeFlow) {
		this.includeFlow = includeFlow;
	}

	public String getManuUser() {
		return this.manuUser;
	}

	public void setManuUser(String manuUser) {
		this.manuUser = manuUser;
	}

	public String getReserve1() {
		return this.reserve1;
	}

	public void setReserve1(String reserve1) {
		this.reserve1 = reserve1;
	}

	public String getNeglectCashflow() {
		return this.neglectCashflow;
	}

	public void setNeglectCashflow(String neglectCashflow) {
		this.neglectCashflow = neglectCashflow;
	}

	public Double getGoogleExchangeRate() {
		return this.googleExchangeRate;
	}

	public void setGoogleExchangeRate(Double googleExchangeRate) {
		this.googleExchangeRate = googleExchangeRate;
	}

	public String getDeleted() {
		return this.deleted;
	}

	public void setDeleted(String deleted) {
		this.deleted = deleted;
	}

	public String getGameCashflowFiles() {
		return gameCashflowFiles;
	}

	public void setGameCashflowFiles(String gameCashflowFiles) {
		this.gameCashflowFiles = gameCashflowFiles;
	}

	public String getContractCompany() {
		return contractCompany;
	}

	public void setContractCompany(String contractCompany) {
		this.contractCompany = contractCompany;
	}

	public String getTaxRate() {
		return taxRate;
	}

	public void setTaxRate(String taxRate) {
		this.taxRate = taxRate;
	}
}