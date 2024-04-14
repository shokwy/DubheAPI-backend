package com.shok.dubhe.service.impl;
import java.util.Date;

import com.baomidou.mybatisplus.core.conditions.update.LambdaUpdateWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.shok.dubhe.common.ErrorCode;
import com.shok.dubhe.exception.BusinessException;
import com.shok.dubhe.model.entity.InterfaceInfo;
import com.shok.dubhe.model.entity.UserInterfaceInfo;
import com.shok.dubhe.service.UserInterfaceInfoService;
import com.shok.dubhe.mapper.UserInterfaceInfoMapper;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

/**
* @author SHOK
* @description 针对表【user_interface_info(用户调用接口关系)】的数据库操作Service实现
* @createDate 2024-04-11 21:28:29
*/
@Service
public class UserInterfaceInfoServiceImpl extends ServiceImpl<UserInterfaceInfoMapper, UserInterfaceInfo>
    implements UserInterfaceInfoService{

    @Override
    public void validUserInterfaceInfo(UserInterfaceInfo interfaceInfo, boolean add) {

        if (interfaceInfo == null) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR);
        }
        Long id = interfaceInfo.getId();
        Long userId = interfaceInfo.getUserId();
        Long interfaceInfoId = interfaceInfo.getInterfaceInfoId();
        Integer totalNum = interfaceInfo.getTotalNum();
        Integer leftNum = interfaceInfo.getLeftNum();
        Integer status = interfaceInfo.getStatus();
        Date createTime = interfaceInfo.getCreateTime();
        Date updateTime = interfaceInfo.getUpdateTime();
        Integer isDelete = interfaceInfo.getIsDelete();

        if (userId == null || userId < 1) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR, "调用用户异常");
        }
//
    }

    @Override
    public boolean invokeInterfaceCount(long userId, long interfaceInfoId) {
        if (userId <= 0 || interfaceInfoId <= 0) {
            throw new BusinessException(ErrorCode.NOT_FOUND_ERROR);
        }

        LambdaUpdateWrapper<UserInterfaceInfo> updateWrapper = new LambdaUpdateWrapper<>();
        updateWrapper.eq(UserInterfaceInfo::getUserId, userId)
                .eq(UserInterfaceInfo::getInterfaceInfoId, interfaceInfoId)
                .gt(UserInterfaceInfo::getLeftNum, 0)
                .setSql("left_num = left_num -1, total_num = total_num + 1");

        return update(updateWrapper);
    }
}




