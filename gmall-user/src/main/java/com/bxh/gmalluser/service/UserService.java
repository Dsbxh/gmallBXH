package com.bxh.gmalluser.service;

import com.bxh.gmalluser.bean.UmsMember;
import com.bxh.gmalluser.bean.UmsMemberReceiveAddress;

import java.util.List;

public interface UserService {
    List<UmsMember> findAll();

    List<UmsMemberReceiveAddress> findReceiveAddressByMemberId(String memberId);

}
