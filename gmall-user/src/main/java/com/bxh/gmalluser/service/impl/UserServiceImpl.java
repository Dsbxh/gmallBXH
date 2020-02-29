package com.bxh.gmalluser.service.impl;

import com.bxh.gmalluser.bean.UmsMember;
import com.bxh.gmalluser.bean.UmsMemberReceiveAddress;
import com.bxh.gmalluser.mapper.UserMapper;
import com.bxh.gmalluser.mapper.UserReceiveAddressMapper;
import com.bxh.gmalluser.service.UserService;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Resource
    private UserReceiveAddressMapper userReceiveAddressMapper;

    @Override
    public List<UmsMember> findAll() {
        return userMapper.selectAllUser();
    }

    @Override
    public List<UmsMemberReceiveAddress> findReceiveAddressByMemberId(String memberId) {
        /*UmsMemberReceiveAddress item = new UmsMemberReceiveAddress();
        item.setMemberId(memberId);
        List<UmsMemberReceiveAddress> result = userReceiveAddressMapper.select(item);*/

        Example example = new Example(UmsMemberReceiveAddress.class);
        example.createCriteria().andEqualTo("memberId",memberId);
        List<UmsMemberReceiveAddress> result = userReceiveAddressMapper.selectByExample(example);
        return result;
    }
}
