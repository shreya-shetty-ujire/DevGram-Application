package com.snapgram.backend.exception;

public class UserAlreadyExistsException extends RuntimeException{

    public UserAlreadyExistsException(String message){
       super(message);
    }
}