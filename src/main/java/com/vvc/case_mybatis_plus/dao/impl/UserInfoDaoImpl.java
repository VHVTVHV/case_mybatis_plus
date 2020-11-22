package com.vvc.case_mybatis_plus.dao.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.vvc.case_mybatis_plus.dao.UserInfoDao;
import com.vvc.case_mybatis_plus.mapper.UserInfoMapper;
import com.vvc.case_mybatis_plus.entity.model.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserInfoDaoImpl extends ServiceImpl<UserInfoMapper, User> implements UserInfoDao {
    @Resource
    private UserInfoMapper userInfoMapper;

    @Override
    public User queryById(Integer id) {
        return userInfoMapper.selectById(id);
    }

}
