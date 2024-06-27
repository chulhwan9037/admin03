package com.ict.admin03.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ict.admin03.service.TradeService;
import com.ict.admin03.vo.TradeVO;

@RestController
@RequestMapping("/api")
public class TradeController {
    
    @Autowired
    private TradeService tradeService;
    
    @GetMapping("/tradeboard")
    public List<TradeVO> tradeList(){
        return tradeService.tradeList();
    }

    @GetMapping("/detailTrade")
    public TradeVO detailTrade(@RequestParam("idx") Integer idx){
        return tradeService.detailTrade(idx);
    }

    @PostMapping("/deleteTrade")
    public int deleteTrade(@RequestParam("idx") Integer idx){
        int result = tradeService.deleteTrade(idx);
        return result; 
    }
}
