package com.stc.petlove.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;


public class InvalidException extends RuntimeException{
    public InvalidException(String message) {
        super(message);
    }
}
