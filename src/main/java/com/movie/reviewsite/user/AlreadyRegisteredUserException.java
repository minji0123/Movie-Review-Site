package com.movie.reviewsite.user;

public class AlreadyRegisteredUserException extends RuntimeException {

    public AlreadyRegisteredUserException (String message){
        super(message);
    }

    public AlreadyRegisteredUserException () {
        super("이미 등록된 회원입니다.");
    }

}
