package com.movie.reviewsite.user;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PUBLIC)
public class UserDto {

    private String username;
    private String password;


    public UserEntity toEntity() {
        return UserEntity.builder()
                .username(username)
                .password(password)
                .build();
    }
}
