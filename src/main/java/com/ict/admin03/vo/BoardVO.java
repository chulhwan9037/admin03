package com.ict.admin03.vo;

import lombok.Data;

@Data
public class BoardVO {
    private Integer id;
    private String title, content, created_at, update_at; 
}
