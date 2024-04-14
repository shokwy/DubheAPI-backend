package com.shok.dubhe.service;

import com.shok.dubhe.model.entity.InterfaceInfo;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author SHOK
* @description 针对表【interface_info(接口信息)】的数据库操作Service
* @createDate 2024-04-11 21:28:21
*/
public interface InterfaceInfoService extends IService<InterfaceInfo> {

    void validInterfaceInfo(InterfaceInfo interfaceInfo, boolean add);
}
