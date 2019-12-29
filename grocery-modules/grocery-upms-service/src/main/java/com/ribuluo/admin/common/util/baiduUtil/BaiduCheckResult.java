package com.ribuluo.admin.common.util.baiduUtil;

public class BaiduCheckResult {
    private long log_id;
    private BaiduResult result;
    public void setLog_id(long log_id) {
        this.log_id = log_id;
    }
    public long getLog_id() {
        return log_id;
    }

    public void setResult(BaiduResult result) {
        this.result = result;
    }
    public BaiduResult getResult() {
        return result;
    }

}
