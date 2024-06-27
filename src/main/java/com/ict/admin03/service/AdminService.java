package com.ict.admin03.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.ict.admin03.mapper.MemberMapper;
import com.ict.admin03.vo.AdminVO;
import java.util.List;


@Service
public class AdminService {
     @Autowired
    private MemberMapper memberMapper;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public List<AdminVO> getAdminList(){
        return memberMapper.getAdminList();
    }

    public int addAdmin(AdminVO avo) {
        // 비밀번호 암호화
        String pwd = passwordEncoder.encode(avo.getPw());
        avo.setPw(pwd);

        return memberMapper.addAdmin(avo);
    }

    public int deleteAdmin(Integer idx){
        return memberMapper.deleteAdmin(idx);
    }

    
}
