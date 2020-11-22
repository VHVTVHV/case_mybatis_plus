package com.vvc.case_mybatis_plus.controller;

import com.vvc.case_mybatis_plus.entity.model.User;
import com.vvc.case_mybatis_plus.service.UserInfoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping(value = "/v1")
@Slf4j
public class UserManageController {
    @Resource
    private UserInfoService userInfoService;
    /**
     * 查询用户信息
     */
    @RequestMapping(path = "/user/info")
    @ResponseBody
    public User queryUserInfo(Integer id) {
        log.info("测试连接");
        return userInfoService.queryUserInfo(id);
    }
}
