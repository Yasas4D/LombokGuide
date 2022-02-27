package com.example.lombok.guide.models;

import lombok.Data;

@Data
public class UserLombok {

    private Long userId;
    private String userName;
    private String email;
    private final String section;
}
