package com.ict.admin03.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ict.admin03.mapper.MemberMapper;
import com.ict.admin03.vo.UsersVO;

@Service
public class UserService {
     @Autowired
    private MemberMapper memberMapper;

    public List<UsersVO> getUserList(){
        return memberMapper.getUserList();
    }

    public int deleteUser(Integer idx){
        return memberMapper.deleteUser(idx);
    } 
}
