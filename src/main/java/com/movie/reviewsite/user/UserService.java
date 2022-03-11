package com.movie.reviewsite.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder; // for hashing passwords

    // user signup
    public UserEntity signup(UserDto userDto) {

        // dto -> entity 하고 user 에 저장
        // 이름이 중복되면 에러 발생
        // repository save 메소드 발동

        UserEntity user = userDto.toEntity();
        userRepository.findByUsername(user.getUsername());

        if (user != null) {
            throw new AlreadyRegisteredUserException();
        }

        user.setUsername(user.getUsername());
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        user.setAuthority("ROLE_USER");

        return userRepository.save(user);
    }

    // admin signup
    public UserEntity adminSignup(UserDto userDto) {

        // dto -> entity 하고 admin 에 저장
        // 이름이 중복되면 에러 발생
        // repository save 메소드 발동

        UserEntity admin = userDto.toEntity();
        userRepository.findByUsername(admin.getUsername());


        if (admin != null) {
            throw new AlreadyRegisteredUserException();
        }

        admin.setUsername(admin.getUsername());
        admin.setPassword(passwordEncoder.encode(admin.getPassword()));
        admin.setAuthority("ROLE_ADMIN");

        return userRepository.save(admin);
    }
}
