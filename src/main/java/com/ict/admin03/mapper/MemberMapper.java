package com.ict.admin03.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.ict.admin03.vo.AdminVO;
import com.ict.admin03.vo.FreeBoardVO;
import com.ict.admin03.vo.TradeVO;
import com.ict.admin03.vo.UsersVO;

import java.util.List;

@Mapper
public interface MemberMapper {
    // 관리자
    AdminVO selectMember(@Param("id") String id) ;
    
    List<AdminVO> getAdminList();
    
    int addAdmin(AdminVO avo);

    int deleteAdmin(@Param("idx") Integer idx);
    
    
    // 유저
    List<UsersVO> getUserList();

    int deleteUser(@Param("idx") Integer idx);


    // 자유게시판
    
    List<FreeBoardVO> getGuestList();

    FreeBoardVO getGuestDetail(@Param("idx") Integer idx);

    int insertBoard(FreeBoardVO gvo);


    // 중고거래 게시판
    List<TradeVO> tradeList();
    TradeVO detailTrade(@Param("idx") Integer idx);
    int deleteTrade(@Param("idx") Integer idx);
}

   

