package com.vvc.case_mybatis_plus.service;

import com.vvc.case_mybatis_plus.entity.model.User;

public interface UserInfoService {
    User queryUserInfo(Integer id);
}
