package com.shok.dubhe.service;

import com.shok.dubhe.model.entity.InterfaceInfo;
import com.shok.dubhe.model.entity.UserInterfaceInfo;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author SHOK
* @description 针对表【user_interface_info(用户调用接口关系)】的数据库操作Service
* @createDate 2024-04-11 21:28:29
*/
public interface UserInterfaceInfoService extends IService<UserInterfaceInfo> {


    void validUserInterfaceInfo(UserInterfaceInfo userInterfaceInfo, boolean add);

    /**
     * 调用次数统计
     * @param userId
     * @param interfaceInfoId
     * @return
     */
    public boolean invokeInterfaceCount(long userId, long interfaceInfoId);
}
