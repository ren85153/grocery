package com.ribuluo.admin.model.mo;


import javax.validation.constraints.NotNull;
import java.util.*;

/**
 * 2.0消息推送体
 */
public class NewJGPushMO {

    /**
     * 接收者唯一设备id
     */
    private List<String> registrationIds  = new ArrayList<>();

    /**
     * 接收者别名，本项目使用userid进行标识
     */
    private List<String> alias = new ArrayList<>();

    /**
     * 接受者标签
     */
    private List<String> tags  = new ArrayList<>();

    /**
     * 推送内容
     */
    private String alert ;

    /**
     * 标题
     */
    private String title;

    /**
     * 扩展信息
     */
    private Map<String,String> extras  = new HashMap<>();

    /**
     * 消息内容
     */
    private String msgContent;

    /**
     * 推送类型
     */
    private String pushType;

    /**
     * 内容类型
     */
    private String contentType;

    /**
     * 展示的页面
     */
    private String page;


    public NewJGPushMO(String msgContent) {
        this.msgContent = msgContent;
        this.extras.put("msgContent",msgContent);
    }

    public NewJGPushMO() {

    }

    public List<String> getRegistrationIds() {
        return registrationIds;
    }

    public void setRegistrationIds(@NotNull String... registrationIds) {
        this.registrationIds = Arrays.asList(registrationIds);
    }

    public List<String> getAlias() {
        return alias;
    }

    public void setAlias( @NotNull String... alias) {
        this.alias = Arrays.asList(alias);
    }

    /**
     * 批量发送多个接收者时，直接传入list
     * @param list
     */
    public void setAliasList( List<String> list) {
        this.alias = list;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(@NotNull String... tags) {
        this.tags = Arrays.asList(tags);
    }

    public String getAlert() {
        return alert;
    }

    public void setAlert(String alert) {
        this.alert = alert;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Map<String, String> getExtras() {
        return extras;
    }

    public void setExtras(Map<String, String> extras) {
        this.extras.putAll(extras);
    }

    public String getMsgContent() {
        return msgContent;
    }

    public void setMsgContent(String msgContent) {
        this.msgContent = msgContent;
        this.extras.put("msgContent",msgContent);
    }

    public void putExtras(String key,String value) {
        this.extras.put(key,value);
    }
    public void putMsgType(String value) {
        this.extras.put("msgType",value);
    }
    public String getPushType() {
        return pushType;
    }

    public void setPushType(String pushType) {
        this.pushType = pushType;
        this.extras.put("pushType",pushType);
    }

    public void setPushPage(String page) {
        this.page = page;
        this.extras.put("pushPage",page);
    }

    public void setJumpPage(String jumpPage) {
        this.extras.put("jumpPage",jumpPage);
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

	public String getPage() {
		return page;
	}

	public void setPage(String page) {
		this.page = page;
	}

	public void setRegistrationIds(List<String> registrationIds) {
		this.registrationIds = registrationIds;
	}

	public void setAlias(List<String> alias) {
		this.alias = alias;
	}

	public void setTags(List<String> tags) {
		this.tags = tags;
	}
    
    
}
