package com.bxh.gmalluser.controller;

import com.bxh.gmalluser.bean.UmsMember;
import com.bxh.gmalluser.bean.UmsMemberReceiveAddress;
import com.bxh.gmalluser.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("findAll")
    public List<UmsMember> findAll() {
        return userService.findAll();
    }

    @RequestMapping("/findReceiveAddressByMemberId")
    public List<UmsMemberReceiveAddress> findReceiveAddressByMemberId(String memberId) {
        return userService.findReceiveAddressByMemberId(memberId);
    }


}
