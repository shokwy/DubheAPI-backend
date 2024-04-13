package com.shok.dubhe.model.dto.interfaceInfo;

import lombok.Data;

import java.io.Serializable;

/**
 * 通过id发送请求
 * @author wy
 * @version 1.0
 */
@Data
public class IdRequest implements Serializable {
    /**
     * id
     */
    private Long id;

    private static final long serialVersionUID = 1L;
}
