package com.ict.admin03.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ict.admin03.service.UserService;
import com.ict.admin03.vo.UsersVO;

@RestController
@RequestMapping("/api")
public class UserListController {
    
    @Autowired
    private UserService userService;

    @GetMapping("/user")
    public List<UsersVO> getUserList() {
        System.out.println("넌왜나와");
        return userService.getUserList();
    }

    @PostMapping("/deleteUser")
    public int deleteUser(@RequestParam("idx") Integer idx){
        int result = userService.deleteUser(idx);
        return result;
    }

    
}
