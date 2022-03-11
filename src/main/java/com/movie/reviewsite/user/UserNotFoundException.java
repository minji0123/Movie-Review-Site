package com.movie.reviewsite.user;

public class UserNotFoundException extends RuntimeException{

    public UserNotFoundException(String message){
        super(message);
    }

    public UserNotFoundException(){
        super("회원을 찾을 수 없습니다.");
    }
}
