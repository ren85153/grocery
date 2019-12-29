package com.ribuluo.admin.common.util;

import java.util.Map;

/**
 * Created by luxiaohui on 2017/8/9.
 *
 * @author luxiaohui
 */
public class HmServiceUtil {

    public static String KEY_PAGE_NUM="pageNum";
    public static String KEY_PAGE_SIZE="pageSize";
    public static String KEY_OFFSET="offset";
    public static String KEY_LIMIT="limit";

    /**
     * 检查分页参数，默认要求 pageSize,pageNum。如果传 offset 和 limit 系统自动转
     *
     * @param params
     */
    public static void checkPageParams(Map params) {
        if (params == null || params.isEmpty()) {
            throw new IllegalArgumentException("分页参数不正确");
        }
        Boolean paramsError=(!params.containsKey(KEY_PAGE_NUM) || !params.containsKey(KEY_PAGE_SIZE)) &&
            (!params.containsKey(KEY_OFFSET) || !params.containsKey(KEY_LIMIT));
        if (paramsError) {
            throw new IllegalArgumentException("分页参数不正确");
        }
        if(!params.containsKey(KEY_PAGE_NUM) || !params.containsKey(KEY_PAGE_SIZE)){
            int offset = Integer.parseInt(params.get(KEY_OFFSET).toString());
            int limit = Integer.parseInt(params.get(KEY_LIMIT).toString());
            int pageNum = offset/limit+1;
            params.put(KEY_PAGE_NUM,pageNum);
            params.put(KEY_PAGE_SIZE,limit);
        }
    }

}
