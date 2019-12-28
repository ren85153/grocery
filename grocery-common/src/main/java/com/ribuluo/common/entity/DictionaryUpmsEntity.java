package com.ribuluo.common.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @description:
 * @date: 2019/8/27
 * @author: liuqiang
 * @email sx_moon_sixpence@163.com
 */
@TableName("tb_dic_upms")
@Data
public class DictionaryUpmsEntity implements  Serializable {

    /** 
	 * serialVersionUID
	 */  
	private static final long serialVersionUID = 5328688389728484317L;
	// 0:启用状态
    public  static  int STATUS_UP = 0;
    // 禁用状态
    public static  int STATUS_CLOSE = 1;
    @TableId(type = IdType.AUTO)
    private  Integer id;
    // '字典表代码'
    private String dicCode;
    // '字典表名称'
    private String dicName;
    // '代码索引'
    private  String codeIndex;
    // '字段中文名称'
    private String indexNameCn;
    // '字段英文名称'
    private  String indexNameEn;
    // '状态，0启用，1禁用'
    private  Integer indexStatus;
    // '顺序'
    private  Integer indexSort;
    // '创建时间'
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private LocalDateTime createTime;

}
