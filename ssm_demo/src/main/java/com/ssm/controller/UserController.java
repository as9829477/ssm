package com.ssm.controller;

import com.ssm.service.mysql.service.UserService;
import com.ssm.utils.statusUtils.SuccessMsg;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@Api(value = "user",description = "用户管理")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("getUserList")
    @ApiOperation(value = "获取名单列表",notes = "获取名单列表",consumes = "application/text",produces = "application/json",httpMethod = "GET")
   public Object getUserList(){
       log.info("进入查询全部用户");
       return  new SuccessMsg(userService.getUserList());
   }
}
