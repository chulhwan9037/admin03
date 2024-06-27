package com.ict.admin03.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ict.admin03.mapper.MemberMapper;
import com.ict.admin03.vo.TradeVO;

@Service
public class TradeService {
    @Autowired
    private MemberMapper memberMapper;

    public List<TradeVO> tradeList(){
        return memberMapper.tradeList();
    }

    public TradeVO detailTrade(Integer idx){
        return memberMapper.detailTrade(idx);
    }

    public int deleteTrade(Integer idx){
        return memberMapper.deleteTrade(idx);
    }
}
