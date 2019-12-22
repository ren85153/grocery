package com.ribuluo.common.util;

public class BaseRestResult<T> extends RestResult<T> {
    private int totalPageCount;//总页数
    private int size;//总记录数
    private int pageNumber;//当前页
    private int currentpagecount;//当前页的行数

    protected BaseRestResult(String result, String reason, T data) {
        super(result, reason, data);
    }

    public BaseRestResult(int totalPageCount, int size, String result, String reason, T data) {
        super(result, reason, data);
        this.totalPageCount = totalPageCount;
        this.size = size;
    }

    public BaseRestResult(String result, String reason, T data, int totalPageCount, int size, int pageNumber, int currentpagecount) {
        super(result, reason, data);
        this.totalPageCount = totalPageCount;
        this.size = size;
        this.pageNumber = pageNumber;
        this.currentpagecount = currentpagecount;
    }

    public int getTotalPageCount() {
        return totalPageCount;
    }


    public void setTotalPageCount(int totalPageCount) {
        this.totalPageCount = totalPageCount;
    }


    public int getSize() {
        return size;
    }


    public void setSize(int size) {
        this.size = size;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public int getCurrentpagecount() {
        return currentpagecount;
    }

    public void setCurrentpagecount(int currentpagecount) {
        this.currentpagecount = currentpagecount;
    }
}
