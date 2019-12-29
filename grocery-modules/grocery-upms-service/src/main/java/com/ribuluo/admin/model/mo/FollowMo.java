package com.ribuluo.admin.model.mo;

public class FollowMo {

    private String jxId;

    /**
     * 关注的jxid
     */
    private String jxFollowId;


    /**
     0.取关   1.关注
     */
    private String type;

    /**
     * 1,w我关注的，2.我的粉丝，3：我的好友
     */
    private String findType;

    private int 	pageNum = 1;
    private int 	pageSize = 20;

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public String getFindType() {
        return findType;
    }

    public void setFindType(String findType) {
        this.findType = findType;
    }

    public String getJxId() {
        return jxId;
    }

    public void setJxId(String jxId) {
        this.jxId = jxId;
    }

    public String getJxFollowId() {
        return jxFollowId;
    }

    public void setJxFollowId(String jxFollowId) {
        this.jxFollowId = jxFollowId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
