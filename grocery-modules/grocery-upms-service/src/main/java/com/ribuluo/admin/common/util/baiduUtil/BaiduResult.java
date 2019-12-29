package com.ribuluo.admin.common.util.baiduUtil;

import java.util.List;

public class BaiduResult {
    private int spam;
    private List<String> review;
    private List<String> reject;
    private List<BaiduPass> pass;
    public void setSpam(int spam) {
        this.spam = spam;
    }
    public int getSpam() {
        return spam;
    }

    public void setReview(List<String> review) {
        this.review = review;
    }
    public List<String> getReview() {
        return review;
    }

    public void setReject(List<String> reject) {
        this.reject = reject;
    }
    public List<String> getReject() {
        return reject;
    }

    public void setPass(List<BaiduPass> pass) {
        this.pass = pass;
    }
    public List<BaiduPass> getPass() {
        return pass;
    }
}
