package com.Blog.Application.Payloads;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class UserDTO {
    private int userId;
    private String name;
    private String email;
    private String phone;
    private String password;
    private String about;
}
