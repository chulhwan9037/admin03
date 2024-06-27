package com.ict.admin03.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ict.admin03.mapper.MemberMapper;
import com.ict.admin03.vo.FreeBoardVO;

@Service
public class FreeBoardService {
    @Autowired
    private MemberMapper memberMapper;

    public List<FreeBoardVO> getGuestList(){
        return memberMapper.getGuestList();
    }

    public FreeBoardVO getGuestDetail(Integer idx){
        return memberMapper.getGuestDetail(idx);
    }

    public int insertBoard(FreeBoardVO fvo){
        return memberMapper.insertBoard(fvo);
    }
}
