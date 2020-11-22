package com.vvc.case_mybatis_plus.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.vvc.case_mybatis_plus.entity.model.User;

public interface UserInfoMapper extends BaseMapper<User> {

    User queryById(Integer id);
}
