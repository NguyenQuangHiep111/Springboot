package com.example.student.exception;

import lombok.*;


public class NotFoundException extends RuntimeException {
    public NotFoundException(String message){
        super(message);
    }
}
