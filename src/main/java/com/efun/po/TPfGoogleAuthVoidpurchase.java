package com.efun.po;

import java.io.Serializable;

/**
 * 谷歌开发者帐户退款查询认证配置 t_pf_google_auth_voidpurchase
 */
public class TPfGoogleAuthVoidpurchase implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * id 主键id
	 */
	private Long id;

	/**
	 * gameCode 游戏代码
	 */
	private String gameCode;

	/**
	 * developerAccount 谷歌开发者帐户
	 */
	private String developerAccount;

	/**
	 * packageName 程序包包名
	 */
	private String packageName;

	/**
	 * serviceAccount 谷歌开发者帐户服务帐户认证JSON字符串
	 */
	private String serviceAccount;

	/**
	 * flag 是否查询退款
	 */
	private String flag;

	/**
	 * createTime 创建时间
	 */
	private java.util.Date createTime;

	/**
	 * modifiedTime 修改时间
	 */
	private java.util.Date modifiedTime;

	/**
	 * operator 操作者
	 */
	private String operator;

	/**
	 * mailAddr 通知邮件地址
	 */
	private String mailAddr;

	/**
	 * mainContent 邮件内容，紧急通知人
	 */
	private String mainContent;

	/**
	 * deleted 删除标识
	 */
	private Integer deleted;

	/**
	 * autoBanAccount 自动封号
	 */
	private Integer autoBanAccount;

	/**
	 * 自动封号条件
	 */
	private String bannedCondition;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getGameCode() {
		return gameCode;
	}

	public void setGameCode(String gameCode) {
		this.gameCode = gameCode;
	}

	public String getDeveloperAccount() {
		return developerAccount;
	}

	public void setDeveloperAccount(String developerAccount) {
		this.developerAccount = developerAccount;
	}

	public String getPackageName() {
		return packageName;
	}

	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}

	public String getServiceAccount() {
		return serviceAccount;
	}

	public void setServiceAccount(String serviceAccount) {
		this.serviceAccount = serviceAccount;
	}

	public String getFlag() {
		return flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	public java.util.Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(java.util.Date createTime) {
		this.createTime = createTime;
	}

	public java.util.Date getModifiedTime() {
		return modifiedTime;
	}

	public void setModifiedTime(java.util.Date modifiedTime) {
		this.modifiedTime = modifiedTime;
	}

	public String getOperator() {
		return operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

	public String getMailAddr() {
		return mailAddr;
	}

	public void setMailAddr(String mailAddr) {
		this.mailAddr = mailAddr;
	}

	public String getMainContent() {
		return mainContent;
	}

	public void setMainContent(String mainContent) {
		this.mainContent = mainContent;
	}

	public Integer getDeleted() {
		return deleted;
	}

	public void setDeleted(Integer deleted) {
		this.deleted = deleted;
	}

	public Integer getAutoBanAccount() {
		return autoBanAccount;
	}

	public void setAutoBanAccount(Integer autoBanAccount) {
		this.autoBanAccount = autoBanAccount;
	}

	public String getBannedCondition() {
		return bannedCondition;
	}

	public void setBannedCondition(String bannedCondition) {
		this.bannedCondition = bannedCondition;
	}
}