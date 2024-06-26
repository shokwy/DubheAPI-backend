package com.shok.dubhe.service.impl;
import java.util.Date;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.shok.dubhe.common.ErrorCode;
import com.shok.dubhe.exception.BusinessException;
import com.shok.dubhe.model.entity.InterfaceInfo;
import com.shok.dubhe.service.InterfaceInfoService;
import com.shok.dubhe.mapper.InterfaceInfoMapper;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

/**
* @author SHOK
* @description 针对表【interface_info(接口信息)】的数据库操作Service实现
* @createDate 2024-04-11 21:28:21
*/
@Service
public class InterfaceInfoServiceImpl extends ServiceImpl<InterfaceInfoMapper, InterfaceInfo>
    implements InterfaceInfoService{

    @Override
    public void validInterfaceInfo(InterfaceInfo interfaceInfo, boolean add) {
        if (interfaceInfo == null) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR);
        }

        Long id = interfaceInfo.getId();
        String name = interfaceInfo.getName();
        String description = interfaceInfo.getDescription();
        String url = interfaceInfo.getUrl();
        String requestParams = interfaceInfo.getRequestParams();
        String requestHeader = interfaceInfo.getRequestHeader();
        String responseHeader = interfaceInfo.getResponseHeader();
        Integer status = interfaceInfo.getStatus();
        String method = interfaceInfo.getMethod();
        Long userId = interfaceInfo.getUserId();

        if (StringUtils.isNotBlank(description) && description.length() > 200) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR, "描述内容过长");
        }
    }
}




