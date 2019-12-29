package com.ribuluo.admin.common.constant;

import io.swagger.models.auth.In;

public interface QuestionStatus {

    /**
     * 1.待解答
     */
    Integer WAIT=1;
    /**
     * 2.已解答
     */
    Integer COMPLETE=2;
    /**
     *3.完成提问
     */
    Integer ASSESS=3;
    /**
     *4.退款
     */
    Integer REFUND=4;

    /**
     * 5.已取消
     */
    Integer CANCEL=5;

    /**
     * 是否完结
     */
    interface RefundStatus {
        /**
         *正在处理
         */
        String ONGOING="0";

        /**
         * 已完结
         */
        String COMPLAINT="1";
        /**
         *  拒绝
         */
        String REFUSE="3";
    }

    /**
     * 退款流程
     */
    interface RefundType {
        /**
         *1.退款
         */
        String REFUND="1";

        /**
         * 2.投诉
         */
        String COMPLAINT="2";
    }
}
