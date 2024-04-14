package com.shok.dubhe.model.dto.interfaceInfo;

import lombok.Data;

import java.io.Serializable;

/**
 * 调用接口参数
 * @author wy
 * @version 1.0
 */
@Data
public class InvokeInterfaceRequest implements Serializable {

    /**
     * 主键
     */
    private Long id;

    /**
     * 请求参数
     */
    private String requestParams;

}
