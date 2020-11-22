package com.vvc.case_mybatis_plus.dao;

import com.baomidou.mybatisplus.extension.service.IService;
import com.vvc.case_mybatis_plus.entity.model.User;

public interface UserInfoDao extends IService<User>
{
    User queryById(Integer id);
}
