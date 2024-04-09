package com.smp.sellmyposting.user.dto.request;

import com.smp.sellmyposting.user.domain.User;
import com.smp.sellmyposting.user.domain.enum_.Role;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;


import java.util.UUID;

@Getter
@Builder
@AllArgsConstructor
public class UserRequestDTO {

    private String email;
    private String password;
    private String uuid;
    private int active;
    private Role role;

    public User toEntity() {
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();

        return User.builder()
                .email(this.email)
                .password(bCryptPasswordEncoder.encode(this.password))
                .uuid(UUID.randomUUID().toString())
                .active(1)
                .role(Role.USER)
                .build();
    }
}
