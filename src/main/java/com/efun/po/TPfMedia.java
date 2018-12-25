package com.efun.po;

import java.io.Serializable;

/**
 * 媒体表 t_pf_media
 */
public class TPfMedia implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * id 唯一标识
	 */
	private Long id;

	/**
	 * createdTime 创建时间
	 */
	private java.util.Date createdTime;

	/**
	 * lastModifiedTime 最后修改时间
	 */
	private java.util.Date lastModifiedTime;

	/**
	 * gameCode 游戏代码
	 */
	private String gameCode;

	/**
	 * module 模块
	 */
	private String module;

	/**
	 * type 类型
	 */
	private String type;

	/**
	 * title 标题
	 */
	private String title;

	/**
	 * content 内容描述
	 */
	private String content;

	/**
	 * pic 图片地址
	 */
	private String pic;

	/**
	 * url 连接url
	 */
	private String url;

	/**
	 * beginTime 开始时间
	 */
	private java.util.Date beginTime;

	/**
	 * endTime 结束时间
	 */
	private java.util.Date endTime;

	/**
	 * deleted
	 */
	private Integer deleted;

	/**
	 * showScope 显示范围,0:默认安卓&amp;ios,1:只安卓显示,2:只ios显示
	 */
	private Integer showScope;

	/**
	 * weight 排序权重,数值越大权重越大
	 */
	private Integer weight;

	/**
	 * likes 点赞数
	 */
	private Integer likes;

	/**
	 * views 观看数
	 */
	private Integer views;

	/**
	 * audit 是否审核:0未通过审核; 1通过审核
	 */
	private Integer audit;

	/**
	 * role 角色分类
	 */
	private String role;

	/**
	 * uid uid
	 */
	private String uid;

	/**
	 * roleId 角色Id
	 */
	private String roleId;

	/**
	 * roleName 角色名字
	 */
	private String roleName;

	/**
	 * anchorName 主播名字(实况主)
	 */
	private String anchorName;

	/**
	 * source 视频来源:
	 */
	private String source;

	/**
	 * bigPic视屏大图
	 */
	private String bigPic;

	private String language;
	private String duration;
	private String platform;
	private String hot;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public java.util.Date getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(java.util.Date createdTime) {
		this.createdTime = createdTime;
	}

	public java.util.Date getLastModifiedTime() {
		return lastModifiedTime;
	}

	public void setLastModifiedTime(java.util.Date lastModifiedTime) {
		this.lastModifiedTime = lastModifiedTime;
	}

	public String getGameCode() {
		return gameCode;
	}

	public void setGameCode(String gameCode) {
		this.gameCode = gameCode;
	}

	public String getModule() {
		return module;
	}

	public void setModule(String module) {
		this.module = module;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getPic() {
		return pic;
	}

	public void setPic(String pic) {
		this.pic = pic;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public java.util.Date getBeginTime() {
		return beginTime;
	}

	public void setBeginTime(java.util.Date beginTime) {
		this.beginTime = beginTime;
	}

	public java.util.Date getEndTime() {
		return endTime;
	}

	public void setEndTime(java.util.Date endTime) {
		this.endTime = endTime;
	}

	public Integer getDeleted() {
		return deleted;
	}

	public void setDeleted(Integer deleted) {
		this.deleted = deleted;
	}

	public Integer getShowScope() {
		return showScope;
	}

	public void setShowScope(Integer showScope) {
		this.showScope = showScope;
	}

	public Integer getWeight() {
		return weight;
	}

	public void setWeight(Integer weight) {
		this.weight = weight;
	}

	public Integer getLikes() {
		return likes;
	}

	public void setLikes(Integer likes) {
		this.likes = likes;
	}

	public Integer getViews() {
		return views;
	}

	public void setViews(Integer views) {
		this.views = views;
	}

	public Integer getAudit() {
		return audit;
	}

	public void setAudit(Integer audit) {
		this.audit = audit;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getRoleId() {
		return roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getAnchorName() {
		return anchorName;
	}

	public void setAnchorName(String anchorName) {
		this.anchorName = anchorName;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getBigPic() {
		return bigPic;
	}

	public void setBigPic(String bigPic) {
		this.bigPic = bigPic;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public String getPlatform() {
		return platform;
	}

	public void setPlatform(String platform) {
		this.platform = platform;
	}

	public String getHot() {
		return hot;
	}

	public void setHot(String hot) {
		this.hot = hot;
	}
}