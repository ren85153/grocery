package com.ribuluo.admin.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.ribuluo.admin.mapper.SysLogMapper;
import com.ribuluo.admin.service.SysLogService;
import com.ribuluo.common.constant.CommonConstant;
import com.ribuluo.common.entity.SysLog;
import com.ribuluo.common.util.Assert;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * <p>
 * 日志表 服务实现类
 * </p>
 * @author
 */
@Service
public class SysLogServiceImpl extends ServiceImpl<SysLogMapper, SysLog> implements SysLogService {

    @Override
    public Boolean updateByLogId(Long id) {
        Assert.isNull(id, "日志ID为空");

        SysLog sysLog = new SysLog();
        sysLog.setId(id);
        sysLog.setDelFlag(CommonConstant.STATUS_DEL);
        sysLog.setUpdateTime(new Date());
        return updateById(sysLog);
    }
}
