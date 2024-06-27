package com.ict.admin03.vo;

import lombok.Data;

@Data
public class AdminVO {
    private Integer idx;
    private String id, pw, email, created_at, updated_at, last_login, is_activated;
}
