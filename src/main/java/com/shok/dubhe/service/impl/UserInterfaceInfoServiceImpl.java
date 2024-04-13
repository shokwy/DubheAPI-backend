package com.shok.dubhe.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.shok.dubhe.model.entity.UserInterfaceInfo;
import com.shok.dubhe.service.UserInterfaceInfoService;
import com.shok.dubhe.mapper.UserInterfaceInfoMapper;
import org.springframework.stereotype.Service;

/**
* @author SHOK
* @description 针对表【user_interface_info(用户调用接口关系)】的数据库操作Service实现
* @createDate 2024-04-11 21:28:29
*/
@Service
public class UserInterfaceInfoServiceImpl extends ServiceImpl<UserInterfaceInfoMapper, UserInterfaceInfo>
    implements UserInterfaceInfoService{

}




