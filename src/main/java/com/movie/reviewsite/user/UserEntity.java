package com.movie.reviewsite.user;

import lombok.*;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Collection;
import java.util.Collections;

@Table
@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PUBLIC)
public class UserEntity implements UserDetails {

    // 유저 id, 유저이름, 비번, 권한

    @Id
    @GeneratedValue
    private Long id;
    private String username;
    private String password;
    private String authority;


    public Boolean isAdmin(){
        return authority.equals("ROLE_ADMIN");
    }

    /* 상속받은 UserDetail 들의 메소드 오버라이딩*/
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() { // 권한 목록
        return Collections.singleton((GrantedAuthority) () -> authority);
    }
    // singleton: 한번에 하나의 역할만 한다. (하나의 인스턴스만 생성한다.)

    // 계정 상태 메소드 (상속받음) 일단 true 로 변경해줌
    @Override
    public boolean isAccountNonExpired() {
        return true;
    } // 계정 만료

    @Override
    public boolean isAccountNonLocked() {
        return true;
    } // 계정 락

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    } // 비번 만료

    @Override
    public boolean isEnabled() {
        return true;
    } // 계정 유무
}
