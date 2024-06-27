package com.ict.admin03.vo;

import lombok.Data;

@Data
public class UsersVO {
    private Integer idx;
    private String id, name, pw, email, created_at, updated_at, last_login, is_activated, kakao, naver, google;
}
