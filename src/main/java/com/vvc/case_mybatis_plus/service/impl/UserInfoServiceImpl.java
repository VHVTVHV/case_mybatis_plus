package com.vvc.case_mybatis_plus.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.vvc.case_mybatis_plus.dao.UserInfoDao;
import com.vvc.case_mybatis_plus.entity.model.User;
import com.vvc.case_mybatis_plus.service.UserInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserInfoServiceImpl implements UserInfoService {
    @Resource
    private UserInfoDao userInfoDao;

    @Override
    public User queryUserInfo(Integer id) {
        // 试验调用自定义方法
        User user = userInfoDao.queryById(id);
        // 在自定义service层调用BaseMapper的方法
        Integer count = userInfoDao.getBaseMapper().selectCount(new QueryWrapper<User>().lambda().eq(User::getId, id));
        System.out.println(count);
        // 使用mybatis-plus自带的查询方法
        return userInfoDao.getById(id);
    }
}
