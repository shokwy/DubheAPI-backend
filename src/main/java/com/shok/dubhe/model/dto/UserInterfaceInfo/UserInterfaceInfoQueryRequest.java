package com.shok.dubhe.model.dto.UserInterfaceInfo;

import com.shok.dubhe.common.PageRequest;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * @author wy
 * @version 1.0
 */
//@EqualsAndHashCode(callSuper = true)
@Data
public class UserInterfaceInfoQueryRequest extends PageRequest implements Serializable {
    /**
     * 主键
     */
    private Long id;

    /**
     * 调用用户 id
     */
    private Long userId;

    /**
     * 接口 id
     */
    private Long interfaceInfoId;

    /**
     * 总调用次数
     */
    private Integer totalNum;

    /**
     * 剩余调用次数
     */
    private Integer leftNum;

    /**
     * 0-正常，1-禁用
     */
    private Integer status;

}

