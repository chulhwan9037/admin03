package com.ict.admin03.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ict.admin03.service.AdminService;
import com.ict.admin03.service.AuthService;
import com.ict.admin03.vo.AdminVO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;



@RestController
@RequestMapping("/api")
public class AuthController {
    
    @Autowired
    private AuthService authService;


    @Autowired
    private AdminService adminService;


    @PostMapping("/login")
    public ResponseEntity<?> postMethodName(@RequestBody AdminVO avo) {
        return authService.authenticate(avo);
    }
    

    @GetMapping("/admin")
    public List<AdminVO> getAdminList() {
        System.out.println("넌왜나와");
        return adminService.getAdminList();
    }
    
    
    @PostMapping("/add")
    public int addAdmin(@RequestBody AdminVO avo) {
        int result = adminService.addAdmin(avo);
        return result;
    }
    
    @PostMapping("/delete")
    public ResponseEntity<String> deleteAdmin(@RequestParam("idx") Integer idx) {
        int result = adminService.deleteAdmin(idx);
        if (result > 0) {
            return ResponseEntity.ok("Admin deleted successfully.");
        } else {
            return ResponseEntity.status(404).body("Admin not found.");
        }
    }
    
   
    
}
