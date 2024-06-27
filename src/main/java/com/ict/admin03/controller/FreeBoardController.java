package com.ict.admin03.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ict.admin03.service.FreeBoardService;
import com.ict.admin03.vo.FreeBoardVO;

@RestController
@RequestMapping("/api")
public class FreeBoardController {
    
    @Autowired
    private FreeBoardService freeBoardService;

    @GetMapping("/freeBoard")
    public List<FreeBoardVO> getGuestList() {
        return freeBoardService.getGuestList();
    }

    @GetMapping("/freeBoardDetail")
    public FreeBoardVO getGuestDetail(@RequestParam("idx") Integer idx){
        return freeBoardService.getGuestDetail(idx);
    }

    @PostMapping("/freeBoardInsert")
    public int insertBoard(@RequestBody FreeBoardVO fvo){
        int result = freeBoardService.insertBoard(fvo);
        return result;
    }
}
