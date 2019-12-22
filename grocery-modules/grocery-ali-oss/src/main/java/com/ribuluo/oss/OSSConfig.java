package com.ribuluo.oss;

import lombok.Data;

/**
 * @author weiyz
 * oss 云存储配置
 **/
@Data
public class OSSConfig {
    String ENDPOINT = "oss-cn-hangzhou.aliyuncs.com";
    String ACCESSKEYID = "LTAIZ4sIFKc15NRA";
    String ACCESSKEYSECTET = "OcYVnRdhnDpURRncyLIRF1P5ott7Fi";
    String BUCKNAME = "jx-file";

    /**
     * http://  + bucket + 公网访问路径 + file name
     */
    String FILE_ADDRESS = "https://jx-file.oss-cn-hangzhou.aliyuncs.com/";

    public OSSConfig() {
    }

    public OSSConfig(String ENDPOINT, String ACCESSKEYID, String ACCESSKEYSECTET, String BUCKNAME, String FILE_ADDRESS) {
        this.ENDPOINT = ENDPOINT;
        this.ACCESSKEYID = ACCESSKEYID;
        this.ACCESSKEYSECTET = ACCESSKEYSECTET;
        this.BUCKNAME = BUCKNAME;
        this.FILE_ADDRESS = FILE_ADDRESS;
    }
}
