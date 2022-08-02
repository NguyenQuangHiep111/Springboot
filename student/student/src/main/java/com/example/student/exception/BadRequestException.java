package com.example.student.exception;

import lombok.*;


public class BadRequestException extends RuntimeException {
    public BadRequestException(String message){
        super(message);

    }
}
